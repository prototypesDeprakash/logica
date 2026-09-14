using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using TMPro;
using UnityEngine;
using UnityEngine.Events;
using UnityEngine.EventSystems;
using UnityEngine.UI;

public class CodeWindow : MonoBehaviour, ITooltipHandler
{

	public CodeInputField CodeInput
	{
		get
		{
			return this.codeInput;
		}
	}

	
	private void OnEnable()
	{
		ThemeManager.Inst.OnThemeChanged += this.OnThemeChanged;
	}

	private void OnDisable()
	{
		ThemeManager.Inst.OnThemeChanged -= this.OnThemeChanged;
	}

	
	private void Update()
	{
		if (!this.errorMessage.IsShowing() && this.errorString != null)
		{
			this.ShowError();
		}
		if (this.updateSizeInXFrames > 0)
		{
			if (this.updateSizeInXFrames == 1)
			{
				this.UpdateSize();
			}
			this.updateSizeInXFrames--;
		}
		this.UpdateFade();
		this.UpdateCodeTooltips();
	}

	private void OnThemeChanged(ColorTheme theme)
	{
		this.windowBackground.color = theme.ui.WindowFrameColor;
		theme.ui.text.ApplyTo(this.fileNameText);
		theme.code.text.ApplyTo(this.codeInput);
		this.codeInput.textComponent.color = new Color(1f, 1f, 1f, 0f);
		this.codeText.color = theme.code.text.TextColor;
		Image image;
		if (this.codeInput.TryGetComponent<Image>(out image))
		{
			image.color = theme.code.BackgroundColor;
		}
		Image image2;
		if (this.breakpointPanel.TryGetComponent<Image>(out image2))
		{
			image2.color = theme.code.BackgroundColor;
		}
		Image image3;
		if (this.scrollView.verticalScrollbar.handleRect.TryGetComponent<Image>(out image3))
		{
			image3.color = theme.ui.ScrollbarColor;
		}
		this.codeText.text = CodeUtilities.SyntaxColor2(this.codeInput.text, ThemeManager.Inst.Theme, "", -1);
	}

	private void UpdateCodeTooltips()
	{
		if (this.tooltipUpdateCallback == null)
		{
			return;
		}
		int num;
		int i;
		for (i = (num = TMP_TextUtilities.FindIntersectingCharacter(this.codeInput.textComponent, new Vector3(Input.mousePosition.x, Input.mousePosition.y), this.workspace.uiCam, true)); i > 0; i--)
		{
			if (!Helper.IsValidNameChar(this.codeInput.text[i - 1]) && this.codeInput.text[i - 1] != '.')
			{
				break;
			}
		}
		while (num + 1 < this.codeInput.text.Length && (Helper.IsValidNameChar(this.codeInput.text[num + 1]) || this.codeInput.text[num + 1] == '.'))
		{
			num++;
		}
		if (i != this.hoverWordStart || num != this.hoverWordEnd)
		{
			this.hoverWordStart = i;
			this.hoverWordEnd = num;
			TimerManager.StopTimer(new Action(this.CallTooltipUpdate));
			if (this.hoverWordStart < 0 || this.hoverWordEnd >= this.codeInput.text.Length)
			{
				this.CallTooltipUpdate();
				return;
			}
			TimerManager.StartTimer(new Action(this.CallTooltipUpdate), 0.4, false, -1.0);
		}
	}


	private void CallTooltipUpdate()
	{
		if (this.tooltipUpdateCallback != null)
		{
			this.tooltipUpdateCallback();
		}
	}

	
	public CodeWindow DockedParent
	{
		get
		{
			Window dockedParent = base.GetComponent<Window>().dockedParent;
			if (dockedParent == null)
			{
				return null;
			}
			return dockedParent.GetComponent<CodeWindow>();
		}
	}


	public CodeWindow DockedChild
	{
		get
		{
			Window dockedChild = base.GetComponent<Window>().DockedChild;
			if (dockedChild == null)
			{
				return null;
			}
			return dockedChild.GetComponent<CodeWindow>();
		}
	}

	public void PressExecuteOrStop()
	{
		this.workspace.activeWindow = base.GetComponent<Window>();
		if (MainSim.Inst.StepByStepMode)
		{
			MainSim.Inst.StepByStepMode = false;
			return;
		}
		if (!MainSim.Inst.IsExecuting())
		{
			Node node = this.Parse();
			if (node != null && node != null)
			{
				MainSim.Inst.StartMainExecution(this, node);
				return;
			}
		}
		MainSim.Inst.StopMainExecution();
	}


	public void PressStepByStepButton()
	{
		this.workspace.activeWindow = base.GetComponent<Window>();
		if (MainSim.Inst.StepByStepMode)
		{
			MainSim.Inst.NextExecutionStep();
			return;
		}
		if (!MainSim.Inst.IsExecuting())
		{
			this.PressExecuteOrStop();
		}
		MainSim.Inst.StepByStepMode = true;
	}

		public void StartStepByStepMode()
	{
		this.stepByStepImg.sprite = this.stepByStepSprite;
		this.executeImg.sprite = this.executeSprite;
	}

	
	public void StartExecutionMode(bool closeErrors = true)
	{
		this.executeButton.IsRunning = true;
		this.stepByStepButton.IsRunning = true;
		this.isExecuting = true;
		this.executeImg.sprite = this.stopSprite;
		this.stepByStepImg.sprite = this.pauseSprite;
		if (closeErrors)
		{
			this.CloseError();
		}
	}

		public void StopExecutionMode()
	{
		if (!this.isExecuting)
		{
			return;
		}
		this.executeButton.IsRunning = false;
		this.stepByStepButton.IsRunning = false;
		this.isExecuting = false;
		this.executeImg.sprite = this.executeSprite;
		this.stepByStepImg.sprite = this.stepByStepSprite;
	}

	
	public void SetExecutionColor()
	{
		if (OptionHolder.GetString("code highlights", "enabled") == "disabled")
		{
			return;
		}
		this.fadeStartTime = Time.time;
		this.isFading = true;
	}

	
	private void UpdateFade()
	{
		if (!this.isFading)
		{
			return;
		}
		ColorTheme theme = ThemeManager.Inst.Theme;
		float num = Time.time - this.fadeStartTime;
		if (num >= 0.2f)
		{
			this.windowBackground.color = theme.ui.WindowFrameColor;
			this.isFading = false;
			return;
		}
		this.windowBackground.color = Color.Lerp(theme.code.WindowFrameExecColor, theme.ui.WindowFrameColor, num / 0.2f);
	}


	public void Load(string code)
	{
		this.codeInput.onTextInserted.AddListener(new UnityAction<string>(this.OnCodeInserted));
		this.codeInput.onTextMeshUpdated.AddListener(new UnityAction(this.OnCodeChanged));
		this.codeInput.onEndEdit.AddListener(new UnityAction<string>(this.OnCodeCommit));
		this.codeInput.onCarretMoved.AddListener(new UnityAction(this.OnCarretMoved));
		this.codeInput.onBackSpace.AddListener(new UnityAction(this.OnBackspace));
		this.codeInput.onSelect.AddListener(new UnityAction<string>(this.OnFocus));
		this.codeInput.onTextSelection.AddListener(new UnityAction<string, int, int>(this.OnTextSelection));
		this.codeInput.uiCam = this.workspace.uiCam;
		this.codeInput.codeCompleter = (RectTransform)this.workspace.codeCompleter.transform;
		this.codeInput.text = code;
		this.fileNameText.text = this.fileName;
		this.undoState = this.codeInput.text;
		this.undoChangeTime = Time.time;
	}


	public void PromptDelete()
	{
		if (this.isExecuting)
		{
			return;
		}
		string text = string.Format(Localizer.Localize("popup_warning_delete_files"), this.fileName);
		List<WarningPopup.ButtonData> buttonsToAdd = new List<WarningPopup.ButtonData>
		{
			new WarningPopup.ButtonData("delete", delegate()
			{
				MainSim.Inst.warningPopup.Close();
				if (!this.isExecuting)
				{
					base.GetComponent<Window>().Close();
				}
			}),
			new WarningPopup.ButtonData("cancel", new UnityAction(MainSim.Inst.warningPopup.Close))
		};
		MainSim.Inst.warningPopup.ShowPopup(text, buttonsToAdd);
	}


	public void OnNameTextEdited()
	{
		this.Rename(this.fileNameText.text);
	}

	
	public void Rename(string newName)
	{
		if (this.workspace.IsValidFileName(newName))
		{
			this.workspace.RenameWindow(base.GetComponent<Window>(), newName);
			this.fileName = newName;
			this.fileNameText.text = newName;
			return;
		}
		this.fileNameText.text = this.fileName;
	}

	
	public List<CodeWindow> GetDockedChildren()
	{
		if (this.DockedChild == null)
		{
			return new List<CodeWindow>();
		}
		List<CodeWindow> dockedChildren = this.DockedChild.GetDockedChildren();
		dockedChildren.Add(this.DockedChild);
		return dockedChildren;
	}

		public void SetMinimized()
	{
		bool isMinimized = base.GetComponent<Window>().isMinimized;
		this.errorMessage.Close();
		this.updateSizeInXFrames = 2;
	}

		public bool IsPointerOverCodeInput()
	{
		return RectTransformUtility.RectangleContainsScreenPoint((RectTransform)this.codeInput.textViewport.transform, Input.mousePosition, this.workspace.uiCam) && RectTransformUtility.RectangleContainsScreenPoint(this.scrollViewRect, Input.mousePosition, this.workspace.uiCam);
	}

	
	public void OnCodeCommit(string s)
	{
		this.Parse();
	}

	
	private void OnCodeChanged()
	{
		this.UpdateTokens();
		this.UpdateSize();
		int stringPosition = Mathf.Clamp(this.codeInput.stringPosition - 1, 0, this.codeInput.text.Length);
		this.ScrollToStringPosition(stringPosition);
	}


	public void ScrollToStringPosition(int stringPosition)
	{
		TMP_TextInfo textInfo = this.codeInput.textComponent.textInfo;
		if (textInfo.characterCount == 0 || stringPosition >= textInfo.characterCount)
		{
			return;
		}
		float num = textInfo.characterInfo[stringPosition].bottomLeft.y;
		num -= ((RectTransform)this.codeText.transform).rect.height / 2f;
		num = -num;
		RectTransform rectTransform = (RectTransform)this.codeInput.transform;
		float y = rectTransform.anchoredPosition.y;
		float height = this.scrollViewRect.rect.height;
		float lineHeight = textInfo.lineInfo[0].lineHeight;
		if (num < y + 30f)
		{
			rectTransform.anchoredPosition = new Vector2(0f, Mathf.Max(num - 30f, 0f));
			return;
		}
		if (num > y + height - (70f + lineHeight))
		{
			rectTransform.anchoredPosition = new Vector2(0f, Mathf.Min(num - height + (70f + lineHeight), Mathf.Max(rectTransform.rect.height - height, 0f)));
		}
	}


	public void Scroll(float scroll)
	{
		((RectTransform)this.codeInput.transform).anchoredPosition += new Vector2(0f, scroll * -500f);
	}

	private void UpdateSize()
	{
		Window component = base.GetComponent<Window>();
		Vector2 vector = this.codeInput.textComponent.GetRenderedValues(false) + this.extraSize;
		Window window = component;
		float[] array = new float[3];
		array[0] = vector.x;
		array[1] = this.minWidth;
		window.minSize.x = Mathf.Max(array);
		component.automaticSize.y = Mathf.Min(vector.y, this.scrollingStartSize);
		component.UpdateSize();
		this.UpdateCodeInputSize();
		if (this.errorMessage.IsShowing())
		{
			this.ShowError();
		}
	}


	public void UpdateCodeInputSize()
	{
		Window component = base.GetComponent<Window>();
		this.codeInput.GetComponent<LayoutElement>().minHeight = Mathf.Max(component.minSize.y, component.playerSetSize.y) - 70f;
	}


	private void OnCarretMoved()
	{
		bool flag = RectTransformUtility.RectangleContainsScreenPoint((RectTransform)this.workspace.codeCompleter.transform, Input.mousePosition, this.workspace.uiCam);
		if (this.workspace.codeCompleter.IsOpen && !flag)
		{
			this.workspace.codeCompleter.Close();
			this.codeInput.blockArrowKeys = false;
		}
	}

	
	private void OnTextSelection(string s, int start, int end)
	{
		this.prevSelectionEnd = Mathf.Max(start, end);
		this.prevSelectionStart = Mathf.Min(start, end);
	}

	
	private void OnFocus(string code)
	{
		this.CloseError();
		base.GetComponent<Window>().MoveToFront();
		this.workspace.activeWindow = base.GetComponent<Window>();
	}


	private void OnBackspace()
	{
		if (this.workspace.codeCompleter.IsOpen && this.codeInput.stringPosition > 0 && !char.IsLetterOrDigit(this.codeInput.text[this.codeInput.stringPosition - 1]))
		{
			this.workspace.codeCompleter.Close();
			return;
		}
		if (this.workspace.codeCompleter.IsOpen)
		{
			this.workspace.codeCompleter.Backspace();
		}
	}

	private void OnCodeInserted(string inserted)
	{
		if (inserted.Contains('\r'))
		{
			this.codeInput.text = this.codeInput.text.Replace("\r", "");
		}
		if (this.isExecuting)
		{
			return;
		}
		Workspace workspace = this.workspace;
		if (workspace != null)
		{
			Tooltip tooltip = workspace.tooltip;
			if (tooltip != null)
			{
				tooltip.CloseTooltip();
			}
		}
		CodeCompleter codeCompleter = this.workspace.codeCompleter;
		if (inserted.Length == 1 && (Helper.IsValidNameChar(inserted[0]) || inserted[0] == '.'))
		{
			if (codeCompleter.IsOpen && inserted[0] != '.')
			{
				codeCompleter.UpdateString(inserted[0]);
			}
			else if (((char.IsLetter(inserted[0]) || inserted[0] == '_') && (this.codeInput.stringPosition <= 1 || !Helper.IsValidNameChar(this.codeInput.text[this.codeInput.stringPosition - 2]))) || inserted[0] == '.')
			{
				Vector3 vector = this.codeInput.textComponent.textInfo.characterInfo[this.codeInput.stringPosition - 1].bottomLeft;
				Vector3 b = BlinkManager.GetCodeOffset(this.codeInput.GetComponent<RectTransform>());
				vector = this.codeInput.transform.TransformPoint(vector) + b;
				if (inserted[0] == '.')
				{
					codeCompleter.Open(vector, this.GetSubWordList(this.GetWordBefore(this.codeInput.stringPosition - 2)), "", this.codeInput.stringPosition, this);
				}
				else if (this.codeInput.stringPosition >= 2 && this.codeInput.text[this.codeInput.stringPosition - 2] == '.')
				{
					codeCompleter.Open(vector, this.GetSubWordList(this.GetWordBefore(this.codeInput.stringPosition - 3)), inserted, this.codeInput.stringPosition - 1, this);
				}
				else if (this.IsImportStatement(this.codeInput.text, this.codeInput.stringPosition - 1))
				{
					codeCompleter.Open(vector, (from cw in this.workspace.codeWindows.Values
					select cw.fileName).ToList<string>(), inserted, this.codeInput.stringPosition - 1, this);
				}
				else
				{
					codeCompleter.Open(vector, this.GetWordList(), inserted, this.codeInput.stringPosition - 1, this);
				}
			}
		}
		else if (codeCompleter.IsOpen && inserted.Length == 1 && (inserted[0] == '\t' || inserted[0] == '\n'))
		{
			if (codeCompleter.IsMatch || inserted[0] == '\t')
			{
				this.CompleteWord(true);
			}
			codeCompleter.Close();
		}
		else if (this.workspace.codeCompleter.IsOpen)
		{
			codeCompleter.Close();
		}
		if (this.prevText.Length > 0 && (OptionHolder.GetKeyCombination("indent selection").IsKeyPressed(true) || OptionHolder.GetKeyCombination("unindent selection").IsKeyPressed(true)))
		{
			List<int> list = new List<int>();
			bool flag = this.prevText.Length > this.codeInput.text.Length;
			if (flag)
			{
				int num = this.prevSelectionEnd - 1;
				while (num >= 0 && (num >= this.prevSelectionStart || this.prevText[num] != '\n'))
				{
					if (this.prevText[num] == '\n')
					{
						list.Add(num);
					}
					num--;
				}
				list.Add(num);
			}
			else
			{
				int num2 = this.codeInput.stringPosition - 2;
				while (num2 >= 0 && this.prevText[num2] != '\n')
				{
					num2--;
				}
				list.Add(num2);
			}
			bool flag2 = OptionHolder.GetKeyCombination("unindent selection").IsKeyPressed(true);
			if (list.Count > 1 || flag2)
			{
				StringBuilder stringBuilder = new StringBuilder(this.prevText);
				int num3 = 0;
				bool flag3 = false;
				foreach (int num4 in list)
				{
					if (flag2)
					{
						if (stringBuilder.Length > num4 + 1 && stringBuilder[num4 + 1] == '\t')
						{
							stringBuilder.Remove(num4 + 1, 1);
							num3++;
						}
						else if (stringBuilder.Length > num4 + 4 && stringBuilder[num4 + 1] == ' ' && stringBuilder[num4 + 2] == ' ' && stringBuilder[num4 + 3] == ' ' && stringBuilder[num4 + 4] == ' ')
						{
							stringBuilder.Remove(num4 + 1, 4);
							num3 += 4;
							flag3 = true;
						}
					}
					else
					{
						bool flag4 = OptionHolder.GetString("tabs to spaces", "") == "enabled";
						stringBuilder.Insert(num4 + 1, flag4 ? "    " : "\t");
						num3 += (flag4 ? 4 : 1);
					}
				}
				int stringPosition = this.codeInput.stringPosition;
				this.codeInput.text = stringBuilder.ToString();
				if (flag2)
				{
					if (flag)
					{
						this.codeInput.stringPosition = this.prevSelectionEnd - num3;
						this.codeInput.selectionStringFocusPosition = this.prevSelectionStart - (flag3 ? 4 : 1);
					}
					else
					{
						this.codeInput.stringPosition = stringPosition - (1 + num3);
					}
				}
				else
				{
					this.codeInput.stringPosition = this.prevSelectionEnd + num3;
					this.codeInput.selectionStringFocusPosition = this.prevSelectionStart + 1;
				}
				if (this.workspace.codeCompleter.IsOpen)
				{
					codeCompleter.Close();
				}
				this.UpdateTokens();
				return;
			}
		}
		if (inserted.Contains('\r'))
		{
			this.codeInput.text = this.codeInput.text.Replace("\r", "");
		}
		this.UpdateTokens();
		int num5 = this.codeInput.stringPosition - 1;
		if (num5 > 0 && this.codeInput.text[num5] == '\n')
		{
			Token lastNewLine = this.tokens.GetLastNewLine(num5);
			string text = (lastNewLine != null) ? lastNewLine.value.Remove(0, 1) : "\t";
			if (num5 - 1 > 0 && this.codeInput.text[num5 - 1] == ':' && lastNewLine != null)
			{
				string str = text;
				string text2 = text.StartsWith(' ') ? "    " : '\t';
				text = str + ((text2 != null) ? text2.ToString() : null);
			}
			this.codeInput.text = this.codeInput.text.Insert(num5 + 1, text);
			this.codeInput.stringPosition += text.Length;
		}
	}

	
	public void OpenCodeCompleterAtCarret()
	{
		if (this.codeInput.text[this.codeInput.stringPosition - 1] == ' ')
		{
			this.codeInput.text = this.codeInput.text.Remove(this.codeInput.stringPosition - 1, 1);
			CodeInputField codeInputField = this.codeInput;
			int stringPosition = codeInputField.stringPosition;
			codeInputField.stringPosition = stringPosition - 1;
		}
		CodeCompleter codeCompleter = this.workspace.codeCompleter;
		int num = Mathf.Max(0, this.codeInput.stringPosition - 1);
		if (this.codeInput.text[num] == '.')
		{
			Vector3 vector = this.codeInput.textComponent.textInfo.characterInfo[num].bottomLeft;
			Vector3 b = BlinkManager.GetCodeOffset(this.codeInput.GetComponent<RectTransform>());
			vector = this.codeInput.transform.TransformPoint(vector) + b;
			codeCompleter.Open(vector, this.GetSubWordList(this.GetWordBefore(num - 1)), "", num + 1, this);
			return;
		}
		int num2 = num;
		while (num2 > 0 && Helper.IsValidNameChar(this.codeInput.text[num2]) && Helper.IsValidNameChar(this.codeInput.text[num2 - 1]))
		{
			num2--;
		}
		Vector3 vector2 = this.codeInput.textComponent.textInfo.characterInfo[num2].bottomLeft;
		Vector3 b2 = BlinkManager.GetCodeOffset(this.codeInput.GetComponent<RectTransform>());
		vector2 = this.codeInput.transform.TransformPoint(vector2) + b2;
		if (num2 != num && num2 > 0 && this.codeInput.text[num2 - 1] == '.')
		{
			codeCompleter.Open(vector2, this.GetSubWordList(this.GetWordBefore(num2 - 2)), this.codeInput.text.Substring(num2, num - num2), num2, this);
			return;
		}
		codeCompleter.Open(vector2, this.GetWordList(), this.codeInput.text.Substring(num2, num - num2), num2, this);
	}

	private bool IsImportStatement(string text, int stringIndex)
	{
		int i = stringIndex - 1;
		while (i >= 0 && char.IsWhiteSpace(text[i]))
		{
			i--;
		}
		if (i < 0)
		{
			return false;
		}
		int num = i;
		while (i >= 0 && char.IsLetterOrDigit(text[i]))
		{
			i--;
		}
		int num2 = i + 1;
		int num3 = num - i;
		bool flag = num3 == 6 && text[num2] == 'i' && text[num2 + 1] == 'm' && text[num2 + 2] == 'p' && text[num2 + 3] == 'o' && text[num2 + 4] == 'r' && text[num2 + 5] == 't';
		bool result = num3 == 4 && text[num2] == 'f' && text[num2 + 1] == 'r' && text[num2 + 2] == 'o' && text[num2 + 3] == 'm';
		if (!flag)
		{
			return result;
		}
		for (i = num2 - 1; i >= 0; i--)
		{
			if (!char.IsWhiteSpace(text[i]))
			{
				break;
			}
		}
		while (i >= 0)
		{
			if (!char.IsLetterOrDigit(text[i]))
			{
				break;
			}
			i--;
		}
		while (i >= 0 && char.IsWhiteSpace(text[i]))
		{
			i--;
		}
		if (i < 0)
		{
			return true;
		}
		int num4 = i;
		while (i >= 0 && char.IsLetterOrDigit(text[i]))
		{
			i--;
		}
		int num5 = i + 1;
		return num4 - i != 4 || text[num5] != 'f' || text[num5 + 1] != 'r' || text[num5 + 2] != 'o' || text[num5 + 3] != 'm';
	}


	public void CompleteWord(bool removeExtraChar)
	{
		CodeCompleter codeCompleter = this.workspace.codeCompleter;
		bool flag = this.codeInput.stringPosition == this.codeInput.text.Length;
		string text = this.codeInput.text;
		int startStringIndex = codeCompleter.startStringIndex;
		text = text.Remove(startStringIndex, codeCompleter.TypedLength + (removeExtraChar ? 1 : 0));
		text = text.Insert(startStringIndex, codeCompleter.Selection);
		this.codeInput.text = text;
		this.codeInput.stringPosition += codeCompleter.Selection.Length - ((removeExtraChar && !flag) ? 1 : 0) - codeCompleter.TypedLength;
	}

	public void UpdateSearch(string word, int selectedIndex = -1)
	{
		this.codeText.text = CodeUtilities.SyntaxColor2(this.codeInput.text, ThemeManager.Inst.Theme, word, selectedIndex);
	}

	private void ConvertSpacesToTabs()
	{
		int num = 0;
		bool flag = true;
		List<int> list = null;
		for (int i = 0; i < this.codeInput.text.Length; i++)
		{
			if (this.codeInput.text[i] == ' ' && flag)
			{
				num++;
				if (num == 4)
				{
					num = 0;
					this.codeInput.stringPosition -= 3;
					if (list == null)
					{
						list = new List<int>();
					}
					list.Add(i - 3);
				}
			}
			else if (this.codeInput.text[i] == '\n' || this.codeInput.text[i] == '\t')
			{
				num = 0;
				flag = true;
			}
			else
			{
				num = 0;
				flag = false;
			}
		}
		if (list != null)
		{
			list.Reverse();
			StringBuilder stringBuilder = new StringBuilder(this.codeInput.text);
			foreach (int num2 in list)
			{
				stringBuilder.Remove(num2, 4);
				stringBuilder.Insert(num2, '\t');
			}
			this.codeInput.text = stringBuilder.ToString();
		}
	}

	private bool UpdateTokens()
	{
		if (this.codeInput.text == this.prevText)
		{
			return false;
		}
		if (this.isExecuting)
		{
			MainSim.Inst.StopMainExecution();
		}
		if (OptionHolder.GetString("tabs to spaces", "") == "enabled" && this.codeInput.text.Contains('\t'))
		{
			int num = this.codeInput.text.Take(this.codeInput.stringPosition + 1).Count((char c) => c == '\t');
			this.codeInput.text = this.codeInput.text.Replace("\t", "    ");
			this.codeInput.stringPosition += num * 3;
		}
		else if (OptionHolder.GetString("tabs to spaces", "") == "disabled")
		{
			this.ConvertSpacesToTabs();
		}
		this.prevText = this.codeInput.text;
		this.dirty = true;
		this.codeText.text = CodeUtilities.SyntaxColor2(this.codeInput.text, ThemeManager.Inst.Theme, "", -1);
		Tokenizer.Tokenize(this.codeInput.text, out this.tokens);
		this.<UpdateTokens>g__updateTokenizedIdentifiers|88_0(this.tokens);
		if (this.undoPreventNextChange)
		{
			this.undoPreventNextChange = false;
		}
		else
		{
			if (Time.time - this.undoChangeTime > 0.5f)
			{
				this.workspace.undoHistory.AddChange(new Func<object, object>(this.SetToCodeState), this.undoState, base.gameObject);
				this.undoState = this.codeInput.text;
			}
			this.undoChangeTime = Time.time;
		}
		return true;
	}


	private object SetToCodeState(object state)
	{
		object text = this.codeInput.text;
		this.undoPreventNextChange = true;
		this.codeInput.text = (string)state;
		if (!this.codeInput.isFocused)
		{
			this.Parse();
		}
		this.undoState = this.codeInput.text;
		return text;
	}


	public Node Parse()
	{
		object obj = this.parseLock;
		Node result;
		lock (obj)
		{
			this.UpdateTokens();
			if (!this.dirty)
			{
				if (this.parseException != null)
				{
					this.errorString = this.parseException.Message;
					this.errorStartIndex = this.parseException.startIndex;
					this.errorEndIndex = this.parseException.endIndex;
				}
				Program program = this.cachedProgram;
				result = ((program != null) ? program.syntaxTree : null);
			}
			else
			{
				MainSim.Inst.dirty = true;
				this.dirty = false;
				this.parsedFunctions.Clear();
				try
				{
					this.cachedProgram = Parser.Parse(this.tokens, this);
					this.cachedProgram.syntaxTree.CheckForNonsensicalCode();
					this.breakpointPanel.UpdateBreakpoints(this.cachedProgram.syntaxTree);
					this.parseException = null;
					Program program2 = this.cachedProgram;
					result = ((program2 != null) ? program2.syntaxTree : null);
				}
				catch (ParseException ex)
				{
					this.errorString = ex.Message;
					this.errorStartIndex = ex.startIndex;
					this.errorEndIndex = ex.endIndex;
					this.parseException = ex;
					this.cachedProgram = null;
					result = null;
				}
			}
		}
		return result;
	}

	
	public void SetErrorMessage(string message, int startIndex, int endIndex)
	{
		this.errorString = message;
		this.errorStartIndex = startIndex;
		this.errorEndIndex = endIndex;
	}


	private void ShowError()
	{
		if (EventSystem.current.currentSelectedGameObject == this.codeInput.gameObject)
		{
			return;
		}
		Vector3 vector;
		Vector3 right;
		if (base.GetComponent<Window>().isMinimized)
		{
			this.errorMessage.transform.SetParent(base.transform);
			Rect rect = ((RectTransform)base.transform).rect;
			vector = base.transform.TransformPoint(new Vector3((rect.xMin + rect.xMax) / 2f, rect.yMin + 10f, 0f));
			right = vector;
			this.workspace.MoveCameraTo(base.GetComponent<Window>(), false, -1, null);
		}
		else
		{
			this.errorMessage.transform.SetParent(this.codeInput.transform);
			TMP_CharacterInfo[] characterInfo = this.codeInput.textComponent.textInfo.characterInfo;
			Vector3 b = BlinkManager.GetCodeOffset(this.codeInput.GetComponent<RectTransform>());
			this.ScrollToStringPosition(this.errorStartIndex);
			vector = this.codeInput.transform.TransformPoint(characterInfo[this.errorStartIndex].bottomLeft) + b;
			right = this.codeInput.transform.TransformPoint(characterInfo[this.errorEndIndex].bottomRight) + b;
			this.workspace.MoveCameraTo(base.GetComponent<Window>(), false, this.errorStartIndex, this.codeInput);
		}
		this.errorMessage.ShowError(this.errorString, vector, right);
	}
	private void CloseError()
	{
		this.errorString = null;
		this.errorMessage.Close();
	}


	private List<string> GetWordList()
	{
		HashSet<string> hashSet = (from x in BuiltinFunctions.Functions.Keys
		where MainSim.Inst.IsUnlocked(x) && x != "tap"
		select x).ToHashSet<string>();
		hashSet.UnionWith(MainSim.Inst.GetUnlockedKeywords());
		hashSet.UnionWith(this.tokenizedIdentifiers);
		if (this.cachedProgram != null)
		{
			hashSet.UnionWith(this.cachedProgram.allVars);
			foreach (string b in this.cachedProgram.importedModules)
			{
				foreach (CodeWindow codeWindow in this.workspace.codeWindows.Values)
				{
					if (codeWindow.fileName == b && codeWindow.cachedProgram != null)
					{
						hashSet.UnionWith(codeWindow.cachedProgram.allVars);
					}
				}
			}
		}
		List<string> list = hashSet.ToList<string>();
		list.Add("__name__");
		list.Sort();
		return list;
	}

	
	private List<string> GetSubWordList(string domain)
	{
		IEnumerable<string> enumerable;
		if (!(domain == "Entities"))
		{
			if (!(domain == "Grounds"))
			{
				if (!(domain == "Items"))
				{
					if (!(domain == "Unlocks"))
					{
						if (!(domain == "Leaderboards"))
						{
							if (!(domain == "Hats"))
							{
								enumerable = null;
							}
							else
							{
								enumerable = from h in ResourceManager.GetAllHats()
								where MainSim.Inst.IsUnlocked(h.hatName) && !h.hidden
								select h.hatName;
							}
						}
						else
						{
							enumerable = from l in ResourceManager.GetAllLeaderboards()
							select l.leaderboardName;
						}
					}
					else
					{
						enumerable = from u in ResourceManager.GetAllUnlocks()
						where u.enabled
						select u.unlockName;
					}
				}
				else
				{
					enumerable = from i in ResourceManager.GetAllItems()
					where MainSim.Inst.IsUnlocked(i.itemName) && i.enabled
					select i.itemName;
				}
			}
			else
			{
				enumerable = from f in ResourceManager.GetAllFarmObjects()
				where f.isGround
				select f.objectName into s
				where MainSim.Inst.IsUnlocked(s)
				select s;
			}
		}
		else
		{
			enumerable = from f in ResourceManager.GetAllFarmObjects()
			where !f.isGround
			select f.objectName into s
			where MainSim.Inst.IsUnlocked(s)
			select s;
		}
		if (enumerable == null)
		{
			bool flag = false;
			HashSet<string> hashSet = new HashSet<string>();
			foreach (CodeWindow codeWindow in this.workspace.codeWindows.Values)
			{
				if (codeWindow.fileName == domain && codeWindow.cachedProgram != null)
				{
					hashSet.UnionWith(codeWindow.cachedProgram.allVars);
					flag = true;
				}
			}
			if (!flag)
			{
				hashSet.UnionWith((from s in BuiltinFunctions.Methods.Keys
				where MainSim.Inst.IsUnlocked(s)
				select s).ToHashSet<string>());
			}
			return hashSet.ToList<string>();
		}
		if (enumerable != null)
		{
			return enumerable.Select(new Func<string, string>(CodeUtilities.ToUpperSnake)).ToList<string>();
		}
		return new List<string>();
	}

	
	private string GetWordBefore(int stringPos)
	{
		int num = stringPos;
		while (num >= 0 && this.codeInput.text.Length > num && Helper.IsValidNameChar(this.codeInput.text[num]))
		{
			num--;
		}
		return this.codeInput.text.Substring(num + 1, stringPos - num);
	}


	public TooltipInfo GetTooltipInfo(Action updateTooltipCallback)
	{
		this.tooltipUpdateCallback = updateTooltipCallback;
		if (this.hoverWordStart < 0 || this.hoverWordEnd >= this.CodeInput.text.Length)
		{
			return null;
		}
		string text = (this.codeInput.text == "") ? "" : this.codeInput.text.Substring(this.hoverWordStart, this.hoverWordEnd - this.hoverWordStart + 1);
		TooltipInfo tooltipInfo = TooltipUtils.GetWordTooltip(text, this);
		IPyObject obj;
		if (MainSim.Inst.EvaluateName(text, out obj))
		{
			string str = CodeUtilities.ToNiceString(obj, 0, null, false);
			tooltipInfo = new TooltipInfo("`" + str + "`", 0f, default(Vector3), TooltipInfo.Anchor.Auto, "");
		}
		if (tooltipInfo != null)
		{
			Vector3 bottomLeft = this.codeInput.textComponent.textInfo.characterInfo[this.hoverWordStart].bottomLeft;
			Vector3 b = BlinkManager.GetCodeOffset(this.codeInput.GetComponent<RectTransform>());
			Vector3 fixedPosition = this.codeInput.transform.TransformPoint(bottomLeft) + b;
			tooltipInfo.fixedPosition = fixedPosition;
			tooltipInfo.anchor = TooltipInfo.Anchor.BottomRight;
			tooltipInfo.delay = 0.3f;
		}
		return tooltipInfo;
	}

	public void TooltipGone()
	{
		this.tooltipUpdateCallback = null;
	}


	[CompilerGenerated]
	private void <UpdateTokens>g__updateTokenizedIdentifiers|88_0(TokenStream t)
	{
		this.tokenizedIdentifiers.Clear();
		foreach (Token token in t)
		{
			if (token.type == TokenType.IDENTIFIER)
			{
				this.tokenizedIdentifiers.Add(token.value);
			}
		}
	}

	[SerializeField]
	private float minWidth;


	[SerializeField]
	private float scrollingStartSize;

	[SerializeField]
	private Vector2 extraSize;


	private const float colorFadeDuration = 0.2f;

	
	private float fadeStartTime = -1f;


	private bool isFading;


	[SerializeField]
	private Image windowBackground;

	
	[SerializeField]
	private ScrollRect scrollView;

	// Token: 0x04000248 RID: 584
	public RectTransform scrollViewRect;

	// Token: 0x04000249 RID: 585
	[SerializeField]
	private CodeInputField codeInput;

	// Token: 0x0400024A RID: 586
	[SerializeField]
	private BreakPointPanel breakpointPanel;

	// Token: 0x0400024B RID: 587
	[SerializeField]
	private TextMeshProUGUI codeText;

	// Token: 0x0400024C RID: 588
	[SerializeField]
	private TMP_InputField fileNameText;

	// Token: 0x0400024D RID: 589
	[SerializeField]
	private ColoredButton executeButton;

	// Token: 0x0400024E RID: 590
	[SerializeField]
	private ColoredButton stepByStepButton;

	// Token: 0x0400024F RID: 591
	[SerializeField]
	private Image executeImg;

	// Token: 0x04000250 RID: 592
	[SerializeField]
	private Image stepByStepImg;

	// Token: 0x04000251 RID: 593
	[SerializeField]
	private Sprite executeSprite;

	// Token: 0x04000252 RID: 594
	[SerializeField]
	private Sprite stopSprite;

	// Token: 0x04000253 RID: 595
	[SerializeField]
	private Sprite stepByStepSprite;

	// Token: 0x04000254 RID: 596
	[SerializeField]
	private Sprite pauseSprite;

	// Token: 0x04000255 RID: 597
	[SerializeField]
	private ErrorMessage errorMessage;

	// Token: 0x04000256 RID: 598
	[SerializeField]
	private Color errorColor;

	public Workspace workspace;

	public bool isExecuting;

	public TokenStream tokens;

	public string fileName;

	private volatile string errorString;

	private volatile int errorStartIndex;

	private volatile int errorEndIndex;

	public ConcurrentDictionary<string, FunctionNode> parsedFunctions = new ConcurrentDictionary<string, FunctionNode>();

	public HashSet<string> tokenizedIdentifiers = new HashSet<string>();

	private volatile Program cachedProgram;

	private volatile bool dirty = true;

	private volatile ParseException parseException;

	private object parseLock = new object();

	private string undoState = "";

	private float undoChangeTime;

	private bool undoPreventNextChange;

	private int prevSelectionStart;

	private int prevSelectionEnd;

		private string prevText;


	private Action tooltipUpdateCallback;

	
	private int hoverWordStart;

	
	private int hoverWordEnd;


	private int updateSizeInXFrames;
}
