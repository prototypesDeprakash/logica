using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Runtime.CompilerServices;


public class Parser
{

	public static Program Parse(TokenStream stream, CodeWindow f)
	{
		HashSet<string> allVars = new HashSet<string>();
		HashSet<string> importedModules = new HashSet<string>();
		HashSet<string> hashSet = new HashSet<string>();
		Node syntaxTree = Parser.Block(stream, f, -1, hashSet, hashSet, allVars, importedModules, true, true);
		if (stream.Current != null)
		{
			throw new ParseException("error_code_after_block", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
		}
		return new Program(syntaxTree, hashSet, allVars, importedModules);
	}


	private static DefNode Function(TokenStream stream, CodeWindow f, int indentation, HashSet<string> allVars, HashSet<string> importedModules, bool global = false, bool isStatic = false)
	{
		Token token = stream.Consume(TokenType.DEF, null, false);
		Token token2 = stream.Consume(TokenType.IDENTIFIER, null, false);
		Parser.OptionalGenericTypeAnnotation(stream);
		stream.Consume(TokenType.BRACKET_OPEN, null, false);
		Parser.LineBreaks(stream);
		HashSet<string> hashSet = new HashSet<string>();
		List<string> list = new List<string>();
		List<Node> list2 = new List<Node>();
		bool flag = false;
		for (;;)
		{
			Token token3 = stream.Current;
			if (token3 != null && token3.type == TokenType.BRACKET_CLOSE)
			{
				goto IL_11C;
			}
			string value = stream.Consume(TokenType.IDENTIFIER, null, false).value;
			list.Add(value);
			hashSet.Add(value);
			allVars.Add(value);
			Parser.OptionalVariableTypeAnnotation(stream);
			Parser.LineBreaks(stream);
			Token token4 = stream.Current;
			if (token4 != null && token4.type == TokenType.ASSIGN)
			{
				stream.Consume(TokenType.ASSIGN, null, false);
				Parser.LineBreaks(stream);
				list2.Add(Parser.Expression(stream, f, 0, true, TokenType.NO_TOKEN, false));
				flag = true;
			}
			else if (flag)
			{
				break;
			}
			Token token5 = stream.Current;
			if (token5 == null || token5.type != TokenType.COMMA)
			{
				goto IL_11C;
			}
			stream.Consume(TokenType.COMMA, null, false);
			Parser.LineBreaks(stream);
		}
		throw new ParseException("error_missing_default_parameter", token.startIndex, stream.CurrentStringEndIndex);
		IL_11C:
		stream.Consume(TokenType.BRACKET_CLOSE, null, false);
		Parser.OptionalReturnTypeAnnotation(stream);
		Token token6 = Parser.ConsumeColon(stream);
		FunctionNode functionNode = new FunctionNode(list, token2.value, global, f, token.startIndex, token6.startIndex + token6.value.Length);
		functionNode.boxedParams.codeWindow = f;
		functionNode.slots.Add(Parser.Block(stream, f, indentation, hashSet, new HashSet<string>(), allVars, importedModules, false, true));
		functionNode.Vars = hashSet;
		foreach (Node item in list2)
		{
			functionNode.slots.Add(item);
		}
		return new DefNode(token2.value, isStatic, f, token.startIndex, token.startIndex + token.value.Length)
		{
			slots = 
			{
				functionNode
			}
		};
	}

	private static Node Block(TokenStream stream, CodeWindow f, int prevIndentation, HashSet<string> vars, HashSet<string> globalVars, HashSet<string> allVars, HashSet<string> importedModules, bool global = false, bool isStatic = false)
	{
		if (global && stream.Current == null)
		{
			return new SequenceNode(f);
		}
		Token token = stream.Current;
		if (token == null || token.type != TokenType.NEW_LINE)
		{
			throw new ParseException("error_no_statements", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
		}
		int startIndex = stream.CurrentStringStartIndex + 1;
		int currentStringEndIndex = stream.CurrentStringEndIndex;
		int indentation = Parser.GetIndentation(stream);
		if (indentation <= prevIndentation)
		{
			throw new ParseException("error_not_enough_indentation", startIndex, currentStringEndIndex);
		}
		List<Node> list = new List<Node>();
		int num;
		for (num = indentation; num == indentation; num = Parser.GetIndentation(stream))
		{
			stream.Consume(TokenType.NEW_LINE, null, false);
			list.Add(Parser.Statement(stream, f, indentation, vars, globalVars, allVars, importedModules, global, isStatic));
			Token token2 = stream.Current;
			if (token2 == null || token2.type != TokenType.NEW_LINE)
			{
				break;
			}
		}
		startIndex = stream.CurrentStringStartIndex + 1;
		currentStringEndIndex = stream.CurrentStringEndIndex;
		if (num > indentation)
		{
			throw new ParseException("error_too_much_indentation", startIndex, currentStringEndIndex);
		}
		if (!global && list.Count == 0)
		{
			throw new ParseException("error_no_statements", startIndex, currentStringEndIndex);
		}
		return new SequenceNode(f)
		{
			slots = list
		};
	}


	private static Node Statement(TokenStream stream, CodeWindow f, int indentation, HashSet<string> vars, HashSet<string> globalVars, HashSet<string> allVars, HashSet<string> importedModules, bool global = false, bool isStatic = false)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.DEF)
		{
			DefNode defNode = Parser.Function(stream, f, indentation, allVars, importedModules, global, isStatic);
			if (!globalVars.Contains(defNode.funcName))
			{
				vars.Add(defNode.funcName);
			}
			allVars.Add(defNode.funcName);
			return defNode;
		}
		Token token2 = stream.Current;
		if (token2 != null && token2.type == TokenType.PASS)
		{
			Token token3 = stream.Consume(TokenType.PASS, null, false);
			return new PassNode(f, token3.startIndex, token3.startIndex + token3.value.Length);
		}
		Token token4 = stream.Current;
		if (token4 != null && token4.type == TokenType.BREAK)
		{
			Token token5 = stream.Consume(TokenType.BREAK, null, false);
			return new BreakNode(f, token5.startIndex, token5.startIndex + token5.value.Length);
		}
		Token token6 = stream.Current;
		if (token6 != null && token6.type == TokenType.CONTINUE)
		{
			Token token7 = stream.Consume(TokenType.CONTINUE, null, false);
			return new ContinueNode(f, token7.startIndex, token7.startIndex + token7.value.Length);
		}
		Token token8 = stream.Current;
		if (token8 != null && token8.type == TokenType.RETURN)
		{
			Token token9 = stream.Consume(TokenType.RETURN, null, false);
			Node node = new ReturnNode(f, token9.startIndex, token9.startIndex + token9.value.Length);
			if (stream.Current != null)
			{
				Token token10 = stream.Current;
				if (token10 == null || token10.type != TokenType.NEW_LINE)
				{
					node.slots.Add(Parser.TupleOrExpression(stream, f, false, TokenType.BRACKET_CLOSE, null, false));
				}
			}
			return node;
		}
		Token token11 = stream.Current;
		if (token11 != null && token11.type == TokenType.GLOBAL)
		{
			stream.Consume(TokenType.GLOBAL, null, false);
			Token token12 = stream.Consume(TokenType.IDENTIFIER, null, false);
			Parser.OptionalVariableTypeAnnotation(stream);
			if (vars.Contains(token12.value))
			{
				throw new ParseException(CodeUtilities.LocalizeAndFormat("error_assign_before_global", new object[]
				{
					token12.value
				}), token12.startIndex, token12.startIndex + token12.value.Length);
			}
			globalVars.Add(token12.value);
			return new NoOpNode(f, token12.startIndex, token12.startIndex + token12.value.Length);
		}
		else
		{
			Token token13 = stream.Current;
			if (token13 != null && token13.type == TokenType.IMPORT)
			{
				Token token14 = stream.Consume(TokenType.IMPORT, null, false);
				List<string> list = Parser.SequenceOfIdentifiers(stream, "error_invalid_import");
				foreach (string item in list)
				{
					if (!globalVars.Contains(item))
					{
						vars.Add(item);
					}
					allVars.Add(item);
				}
				return new ImportNode(f, token14.startIndex, stream.CurrentStringStartIndex - 1, list, false, false, null, isStatic);
			}
			Token token15 = stream.Current;
			if (token15 == null || token15.type != TokenType.FROM)
			{
				Token token16 = stream.Current;
				if (token16 == null || token16.type != TokenType.WHILE)
				{
					Token token17 = stream.Current;
					if (token17 == null || token17.type != TokenType.FOR)
					{
						Token token18 = stream.Current;
						if (token18 == null || token18.type != TokenType.IF)
						{
							Node node2 = Parser.TupleOrExpression(stream, f, false, TokenType.ASSIGN, null, true);
							Token token19 = stream.Current;
							if (token19 != null && token19.type == TokenType.ASSIGN)
							{
								return Parser.Assignment(stream, f, node2, vars, globalVars, allVars);
							}
							if (!(node2 is FunctionNode) && !(node2 is CallNode))
							{
								if (node2 is ValueNode)
								{
									string value = ((ValueNode)node2).value;
									if (BuiltinFunctions.Functions.ContainsKey(value) || BuiltinFunctions.Methods.ContainsKey(value))
									{
										throw new ParseException(CodeUtilities.LocalizeAndFormat("error_not_a_statement2", new object[]
										{
											value + "()"
										}), node2.boxedParams.wordStart, node2.boxedParams.wordEnd);
									}
								}
								throw new ParseException("error_not_a_statement", node2.boxedParams.wordStart, node2.boxedParams.wordEnd);
							}
							return node2;
						}
					}
				}
				return Parser.FlowControll(stream, f, indentation, vars, globalVars, allVars, importedModules, false);
			}
			Token token20 = stream.Consume(TokenType.FROM, null, false);
			Token token21 = stream.Consume(TokenType.IDENTIFIER, "error_invalid_import", false);
			stream.Consume(TokenType.IMPORT, "error_invalid_import", false);
			Token token22 = stream.Current;
			if (!(((token22 != null) ? token22.value : null) == "*"))
			{
				List<string> list2 = Parser.SequenceOfIdentifiers(stream, null);
				foreach (string item2 in list2)
				{
					if (!globalVars.Contains(item2))
					{
						vars.Add(item2);
					}
					allVars.Add(item2);
				}
				return new ImportNode(f, token20.startIndex, stream.CurrentStringStartIndex, new List<string>
				{
					token21.value
				}, true, false, list2, isStatic);
			}
			if (!global)
			{
				throw new ParseException("error_wildcard_imports_not_allowed_in_function", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
			}
			stream.Consume(TokenType.MULT, null, false);
			importedModules.Add(token21.value);
			return new ImportNode(f, token20.startIndex, stream.CurrentStringStartIndex, new List<string>
			{
				token21.value
			}, true, true, null, isStatic);
		}
	}

	
	private static List<string> SequenceOfIdentifiers(TokenStream stream, string error = null)
	{
		List<string> list = new List<string>();
		Token token = stream.Current;
		if (token != null && token.type == TokenType.BRACKET_OPEN)
		{
			stream.Consume(TokenType.BRACKET_OPEN, null, false);
			Parser.LineBreaks(stream);
			list.Add(stream.Consume(TokenType.IDENTIFIER, error, false).value);
			Parser.LineBreaks(stream);
			for (;;)
			{
				Token token2 = stream.Current;
				if (token2 == null || token2.type != TokenType.COMMA)
				{
					goto IL_B5;
				}
				stream.Consume(TokenType.COMMA, null, false);
				Parser.LineBreaks(stream);
				Token token3 = stream.Current;
				if (token3 != null && token3.type == TokenType.BRACKET_CLOSE)
				{
					break;
				}
				list.Add(stream.Consume(TokenType.IDENTIFIER, error, false).value);
				Parser.LineBreaks(stream);
			}
			stream.Consume(TokenType.BRACKET_CLOSE, null, false);
			return list;
			IL_B5:
			stream.Consume(TokenType.BRACKET_CLOSE, error, false);
		}
		else
		{
			list.Add(stream.Consume(TokenType.IDENTIFIER, error, false).value);
			for (;;)
			{
				Token token4 = stream.Current;
				if (token4 == null || token4.type != TokenType.COMMA)
				{
					break;
				}
				stream.Consume(TokenType.COMMA, null, false);
				list.Add(stream.Consume(TokenType.IDENTIFIER, error, false).value);
			}
			if (error != null && stream.Current != null)
			{
				Token token5 = stream.Current;
				if (token5 == null || token5.type != TokenType.NEW_LINE)
				{
					throw new ParseException(error, stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
				}
			}
		}
		return list;
	}

	private static Node Assignment(TokenStream stream, CodeWindow f, Node lhs, HashSet<string> vars, HashSet<string> globalVars, HashSet<string> allVars)
	{
		Token token = stream.Consume(TokenType.ASSIGN, null, false);
		Node item = Parser.TupleOrExpression(stream, f, false, TokenType.BRACKET_CLOSE, null, false);
		Parser.CheckAssignmentLhsRec(lhs, f, vars, globalVars, allVars);
		return new AssignmentNode(token.value, f, token.startIndex, token.startIndex + token.value.Length)
		{
			slots = 
			{
				lhs,
				item
			}
		};
	}


	private static void CheckAssignmentLhsRec(Node lhs, CodeWindow f, HashSet<string> vars, HashSet<string> globalVars, HashSet<string> allVars)
	{
		if (!(lhs is ValueNode))
		{
			if (lhs is TupleNode || lhs is ListNode)
			{
				using (List<Node>.Enumerator enumerator = lhs.slots[0].slots.GetEnumerator())
				{
					while (enumerator.MoveNext())
					{
						Node lhs2 = enumerator.Current;
						Parser.CheckAssignmentLhsRec(lhs2, f, vars, globalVars, allVars);
					}
					return;
				}
			}
			if (lhs is BracketNode)
			{
				Parser.CheckAssignmentLhsRec(lhs.slots[0], f, vars, globalVars, allVars);
				return;
			}
			BinaryExprNode binaryExprNode = lhs as BinaryExprNode;
			if (binaryExprNode == null || (!(binaryExprNode.op == ".") && (!(binaryExprNode.op == "[]") || binaryExprNode.slots[1].slots.Count != 1)))
			{
				throw new ParseException("error_invalid_assign_expr", lhs.boxedParams.wordStart, lhs.boxedParams.wordEnd);
			}
			return;
		}
		ValueNode valueNode = (ValueNode)lhs;
		string value = valueNode.value;
		if (Farm.allKeyWords.Contains(value) || Scope.IsConstant(value))
		{
			throw new ParseException(CodeUtilities.LocalizeAndFormat("error_reserved_keyword", new object[]
			{
				value
			}), valueNode.boxedParams.wordStart, valueNode.boxedParams.wordEnd);
		}
		double num;
		if (double.TryParse(value, NumberStyles.AllowDecimalPoint, CultureInfo.InvariantCulture, out num) || value.StartsWith('"') || value.StartsWith('\''))
		{
			throw new ParseException(CodeUtilities.LocalizeAndFormat("error_invalid_name", new object[]
			{
				value
			}), valueNode.boxedParams.wordStart, valueNode.boxedParams.wordEnd);
		}
		if (!globalVars.Contains(value))
		{
			vars.Add(value);
		}
		allVars.Add(value);
	}

	private static Node FlowControll(TokenStream stream, CodeWindow f, int indentation, HashSet<string> vars, HashSet<string> globalVars, HashSet<string> allVars, HashSet<string> importedModules, bool isElif = false)
	{
		bool flag = false;
		Token token = stream.Current;
		Node node;
		if (token != null && token.type == TokenType.WHILE)
		{
			Token token2 = stream.Consume(TokenType.WHILE, null, false);
			node = new BranchNode(f, token2.startIndex, token2.startIndex + token2.value.Length, true);
		}
		else
		{
			Token token3 = stream.Current;
			if (token3 != null && token3.type == TokenType.FOR)
			{
				Token token4 = stream.Consume(TokenType.FOR, null, false);
				Node node2 = Parser.TupleOrExpression(stream, f, false, TokenType.IN, null, false);
				Parser.CheckAssignmentLhsRec(node2, f, vars, globalVars, allVars);
				Node node3 = new ForNode(node2, f, token4.startIndex, token4.startIndex + token4.value.Length);
				stream.Consume(TokenType.IN, "error_invalid_for_syntax", false);
				node = node3;
			}
			else
			{
				Token token5 = stream.Consume(isElif ? TokenType.ELIF : TokenType.IF, null, false);
				node = new BranchNode(f, token5.startIndex, token5.startIndex + token5.value.Length, false);
				flag = true;
			}
		}
		Node item = Parser.TupleOrExpression(stream, f, false, TokenType.BRACKET_CLOSE, null, false);
		Token token6 = stream.Current;
		if (token6 != null && token6.type == TokenType.ASSIGN)
		{
			throw new ParseException("error_unexpected_assign", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
		}
		Parser.ConsumeColon(stream);
		Node item2 = Parser.Block(stream, f, indentation, vars, globalVars, allVars, importedModules, false, false);
		node.slots.Add(item);
		node.slots.Add(item2);
		node.boxedParams.codeWindow = f;
		if (flag)
		{
			Token lookAhead = stream.LookAhead;
			if (lookAhead != null && lookAhead.type == TokenType.ELSE && Parser.GetIndentation(stream) == indentation)
			{
				stream.Consume(TokenType.NEW_LINE, "error_new_line_expected", false);
				stream.Consume(TokenType.ELSE, null, false);
				Parser.ConsumeColon(stream);
				node.slots.Add(Parser.Block(stream, f, indentation, vars, globalVars, allVars, importedModules, false, false));
				return node;
			}
		}
		if (flag)
		{
			Token lookAhead2 = stream.LookAhead;
			if (lookAhead2 != null && lookAhead2.type == TokenType.ELIF && Parser.GetIndentation(stream) == indentation)
			{
				stream.Consume(TokenType.NEW_LINE, "error_new_line_expected", false);
				node.slots.Add(Parser.FlowControll(stream, f, indentation, vars, globalVars, allVars, importedModules, true));
			}
		}
		return node;
	}

	private static Node Sequence(TokenStream stream, CodeWindow f, TokenType endToken, out bool keyValuePairs, bool allowKeyValuePairs = false, bool lineBreaks = true)
	{
		keyValuePairs = true;
		Node node = new SequenceNode(f);
		if (lineBreaks)
		{
			Parser.LineBreaks(stream);
		}
		Token token = stream.Current;
		if (token == null || token.type != endToken)
		{
			Token token2 = stream.Current;
			if ((token2 == null || token2.type != TokenType.NEW_LINE || lineBreaks) && (stream.Current != null || lineBreaks))
			{
				for (;;)
				{
					Node item = Parser.Expression(stream, f, 0, lineBreaks, endToken, false);
					if (lineBreaks)
					{
						Parser.LineBreaks(stream);
					}
					Token token3 = stream.Current;
					if (token3 != null && token3.type == TokenType.COLON)
					{
						if (!keyValuePairs || !allowKeyValuePairs)
						{
							break;
						}
						stream.Consume(TokenType.COLON, "error_wrong_dict_literal", false);
						if (lineBreaks)
						{
							Parser.LineBreaks(stream);
						}
						Node item2 = Parser.Expression(stream, f, 0, lineBreaks, endToken, false);
						node.slots.Add(item);
						node.slots.Add(item2);
					}
					else
					{
						if (keyValuePairs && node.slots.Count > 0)
						{
							goto Block_13;
						}
						node.slots.Add(item);
						keyValuePairs = false;
					}
					if (lineBreaks)
					{
						Parser.LineBreaks(stream);
					}
					Token token4 = stream.Current;
					bool flag = token4 != null && token4.type == TokenType.COMMA;
					if (flag)
					{
						stream.Consume(TokenType.COMMA, null, false);
						if (lineBreaks)
						{
							Parser.LineBreaks(stream);
						}
					}
					Token token5 = stream.Current;
					if (token5 != null && token5.type == endToken)
					{
						goto IL_19B;
					}
					Token token6 = stream.Current;
					if (token6 != null && token6.type == TokenType.NEW_LINE && !lineBreaks)
					{
						goto IL_19B;
					}
					bool flag2 = stream.Current == null && !lineBreaks;
					IL_19C:
					bool flag3 = flag2;
					if (flag3)
					{
						return node;
					}
					if (!flag && !flag3)
					{
						goto Block_25;
					}
					continue;
					IL_19B:
					flag2 = true;
					goto IL_19C;
				}
				throw new ParseException("error_invalid_expression", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
				Block_13:
				throw new ParseException("error_invalid_expression", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
				Block_25:
				if (lineBreaks)
				{
					throw new ParseException("error_expected_close_token", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
				}
				throw new ParseException("error_invalid_expression", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
			}
		}
		return node;
	}
	private static Node TupleOrExpression(TokenStream stream, CodeWindow f, bool canLineBreak = false, TokenType endOfTupleToken = TokenType.BRACKET_CLOSE, Node startExpr = null, bool isLeftmostExpression = false)
	{
		if (startExpr == null)
		{
			Token token = stream.Current;
			if (token != null && token.type == endOfTupleToken)
			{
				Node item = new SequenceNode(f);
				return new TupleNode(f, stream.CurrentStringStartIndex, stream.CurrentStringStartIndex)
				{
					slots = 
					{
						item
					}
				};
			}
		}
		Node node;
		if (startExpr == null)
		{
			node = Parser.Expression(stream, f, 0, canLineBreak, endOfTupleToken, isLeftmostExpression);
		}
		else
		{
			node = startExpr;
		}
		Token token2 = stream.Current;
		if (token2 != null && token2.type == TokenType.COMMA)
		{
			stream.Consume(TokenType.COMMA, null, false);
			bool flag;
			Node node2 = Parser.Sequence(stream, f, endOfTupleToken, out flag, false, canLineBreak);
			node2.slots.Insert(0, node);
			return new TupleNode(f, stream.CurrentStringStartIndex, stream.CurrentStringStartIndex)
			{
				slots = 
				{
					node2
				}
			};
		}
		return node;
	}

	private static Node Expression(TokenStream stream, CodeWindow f, int opIndex = 0, bool canLineBreak = false, TokenType excludeToken = TokenType.NO_TOKEN, bool isLeftmost = false)
	{
		if (canLineBreak)
		{
			Parser.LineBreaks(stream);
		}
		if (opIndex < Parser.operators.Count && Parser.operators[opIndex].Item1.Contains(excludeToken))
		{
			opIndex++;
		}
		if (opIndex < Parser.operators.Count)
		{
			return Parser.operators[opIndex].Item2(stream, f, opIndex, canLineBreak, excludeToken, isLeftmost);
		}
		return Parser.AtomicExpression(stream, f, isLeftmost);
	}


	private static void LineBreaks(TokenStream stream)
	{
		for (;;)
		{
			Token token = stream.Current;
			if (token == null || token.type != TokenType.NEW_LINE)
			{
				break;
			}
			stream.Consume(TokenType.NEW_LINE, null, false);
		}
	}
	public static void OptionalVariableTypeAnnotation(TokenStream stream)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.COLON)
		{
			Token lookAhead = stream.LookAhead;
			if (lookAhead == null || lookAhead.type != TokenType.STRING)
			{
				Token lookAhead2 = stream.LookAhead;
				if (lookAhead2 == null || lookAhead2.type != TokenType.IDENTIFIER)
				{
					return;
				}
			}
			stream.Consume(TokenType.COLON, null, false);
			Parser.TypeExpression(stream, false);
		}
	}

	public static void OptionalReturnTypeAnnotation(TokenStream stream)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.ARROW)
		{
			stream.Consume(TokenType.ARROW, null, false);
			Parser.TypeExpression(stream, false);
		}
	}

	public static void OptionalGenericTypeAnnotation(TokenStream stream)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.SQUARE_BRACKET_OPEN)
		{
			Parser.TypeExpressionList(stream);
		}
	}


	public static void TypeExpression(TokenStream stream, bool identifierIsOptional = false)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.STRING)
		{
			stream.Consume(TokenType.STRING, null, false);
			return;
		}
		if (identifierIsOptional)
		{
			Token token2 = stream.Current;
			if (token2 != null && token2.type == TokenType.IDENTIFIER)
			{
				stream.Consume(TokenType.IDENTIFIER, null, false);
			}
		}
		else
		{
			stream.Consume(TokenType.IDENTIFIER, null, false);
		}
		Token token3 = stream.Current;
		if (token3 != null && token3.type == TokenType.SQUARE_BRACKET_OPEN)
		{
			Parser.TypeExpressionList(stream);
		}
		Token token4 = stream.Current;
		if (token4 != null && token4.type == TokenType.UNION)
		{
			stream.Consume(TokenType.UNION, null, false);
			Parser.TypeExpression(stream, false);
		}
	}


	public static void TypeExpressionList(TokenStream stream)
	{
		stream.Consume(TokenType.SQUARE_BRACKET_OPEN, null, false);
		Token token = stream.Current;
		if (token != null && token.type == TokenType.BRACKET_OPEN)
		{
			Parser.EmptyTuple(stream);
		}
		else
		{
			Parser.TypeExpression(stream, true);
			for (;;)
			{
				Token token2 = stream.Current;
				if (token2 == null || token2.type != TokenType.COMMA)
				{
					break;
				}
				stream.Consume(TokenType.COMMA, null, false);
				Token token3 = stream.Current;
				if (token3 != null && token3.type == TokenType.SQUARE_BRACKET_CLOSE)
				{
					break;
				}
				Parser.TypeExpression(stream, true);
			}
		}
		stream.Consume(TokenType.SQUARE_BRACKET_CLOSE, null, false);
	}


	private static void EmptyTuple(TokenStream stream)
	{
		stream.Consume(TokenType.BRACKET_OPEN, null, false);
		stream.Consume(TokenType.BRACKET_CLOSE, null, false);
	}

	
	private static Node BracketExpression(TokenStream stream, CodeWindow f)
	{
		stream.Consume(TokenType.BRACKET_OPEN, null, false);
		Node node = Parser.TupleOrExpression(stream, f, true, TokenType.BRACKET_CLOSE, null, false);
		Parser.LineBreaks(stream);
		stream.Consume(TokenType.BRACKET_CLOSE, null, false);
		return new BracketNode(f, node.boxedParams.wordStart, node.boxedParams.wordEnd)
		{
			slots = 
			{
				node
			}
		};
	}


	private static Node BinaryExpression(TokenStream stream, CodeWindow f, int opIndex, bool canLineBreak, TokenType excludeToken, bool isLeftmost = false)
	{
		if (canLineBreak)
		{
			Parser.LineBreaks(stream);
		}
		Node node = Parser.Expression(stream, f, opIndex + 1, canLineBreak, excludeToken, isLeftmost);
		if (canLineBreak)
		{
			Parser.LineBreaks(stream);
		}
		foreach (TokenType tokenType in Parser.operators[opIndex].Item1)
		{
			Token token = stream.Current;
			if (token != null && token.type == tokenType)
			{
				if (tokenType == TokenType.COMPARE || tokenType == TokenType.IN)
				{
					List<Node> list = new List<Node>
					{
						node
					};
					List<string> list2 = new List<string>();
					for (;;)
					{
						Token token2 = stream.Current;
						if (token2 == null || token2.type != TokenType.COMPARE)
						{
							Token token3 = stream.Current;
							if (token3 == null || token3.type != TokenType.IN)
							{
								break;
							}
						}
						Token token4 = stream.Consume(TokenType.NO_TOKEN, null, false);
						list.Add(Parser.BinaryExpression(stream, f, opIndex + 1, canLineBreak, excludeToken, false));
						list2.Add(token4.value);
					}
					return new ComparisonNode(list2, f, node.boxedParams.wordStart, stream.CurrentStringEndIndex)
					{
						slots = list
					};
				}
				Token token5 = stream.Consume(tokenType, null, false);
				Node node2 = Parser.BinaryExpression(stream, f, opIndex, canLineBreak, excludeToken, false);
				Node node3 = new BinaryExprNode(token5.value, token5.type, f, token5.startIndex, token5.startIndex + token5.value.Length);
				node3.slots.Add(node);
				if (!(node2 is BinaryExprNode) || !Parser.operators[opIndex].Item1.Contains(((BinaryExprNode)node2).opTokenType))
				{
					node3.slots.Add(node2);
					return node3;
				}
				Node node4 = node2;
				while (node4.slots[0] is BinaryExprNode && Parser.operators[opIndex].Item1.Contains(((BinaryExprNode)node4.slots[0]).opTokenType))
				{
					node4 = node4.slots[0];
				}
				node3.slots.Add(node4.slots[0]);
				node4.slots[0] = node3;
				return node2;
			}
		}
		return node;
	}


	private static Node UnaryExpression(TokenStream stream, CodeWindow f, int opIndex, bool canLineBreak, TokenType excludeToken, bool isLeftmost = false)
	{
		if (canLineBreak)
		{
			Parser.LineBreaks(stream);
		}
		foreach (TokenType tokenType in Parser.operators[opIndex].Item1)
		{
			Token token = stream.Current;
			if (token != null && token.type == tokenType)
			{
				Token token2 = stream.Consume(tokenType, null, false);
				Node item = Parser.Expression(stream, f, opIndex, canLineBreak, TokenType.NO_TOKEN, false);
				return new UnaryExprNode(token2.value, f, token2.startIndex, token2.startIndex + token2.value.Length)
				{
					slots = 
					{
						item
					}
				};
			}
		}
		return Parser.Expression(stream, f, opIndex + 1, canLineBreak, excludeToken, isLeftmost);
	}


	private static Node IndexDotOrCallExpression(TokenStream stream, CodeWindow f, int opIndex, bool canLineBreak, TokenType excludeToken, bool isLeftmost = false)
	{
		if (canLineBreak)
		{
			Parser.LineBreaks(stream);
		}
		Node node = Parser.Expression(stream, f, opIndex + 1, canLineBreak, excludeToken, isLeftmost);
		if (canLineBreak)
		{
			Parser.LineBreaks(stream);
		}
		for (;;)
		{
			Token token = stream.Current;
			if (token == null || token.type != TokenType.SQUARE_BRACKET_OPEN)
			{
				Token token2 = stream.Current;
				if (token2 == null || token2.type != TokenType.BRACKET_OPEN)
				{
					Token token3 = stream.Current;
					if (token3 == null || token3.type != TokenType.DOT)
					{
						break;
					}
				}
			}
			Token token4 = stream.Current;
			if (token4 != null && token4.type == TokenType.SQUARE_BRACKET_OPEN)
			{
				Token token5 = stream.Consume(TokenType.SQUARE_BRACKET_OPEN, null, false);
				Node node2 = new SequenceNode(f);
				node2.slots.Add(Parser.SliceIndex(stream, f, false));
				Token token6 = stream.Current;
				if (token6 != null && token6.type == TokenType.COLON)
				{
					stream.Consume(TokenType.COLON, null, false);
					node2.slots.Add(Parser.SliceIndex(stream, f, true));
					Token token7 = stream.Current;
					if (token7 != null && token7.type == TokenType.COLON)
					{
						stream.Consume(TokenType.COLON, null, false);
						Parser.LineBreaks(stream);
						Token token8 = stream.Current;
						if (token8 == null || token8.type != TokenType.SQUARE_BRACKET_CLOSE)
						{
							node2.slots.Add(Parser.Expression(stream, f, 0, true, TokenType.NO_TOKEN, false));
						}
					}
				}
				Parser.LineBreaks(stream);
				stream.Consume(TokenType.SQUARE_BRACKET_CLOSE, null, false);
				node = new BinaryExprNode("[]", TokenType.BRACKET_OPEN, f, token5.startIndex, token5.startIndex + token5.value.Length)
				{
					slots = 
					{
						node,
						node2
					}
				};
			}
			else
			{
				Token token9 = stream.Current;
				if (token9 != null && token9.type == TokenType.BRACKET_OPEN)
				{
					Token token10 = stream.Consume(TokenType.BRACKET_OPEN, null, false);
					bool flag;
					Node item = Parser.Sequence(stream, f, TokenType.BRACKET_CLOSE, out flag, false, true);
					stream.Consume(TokenType.BRACKET_CLOSE, null, false);
					node = new CallNode(f, token10.startIndex, token10.startIndex + token10.value.Length)
					{
						slots = 
						{
							node,
							item
						}
					};
				}
				else
				{
					Token token11 = stream.Current;
					if (token11 != null && token11.type == TokenType.DOT)
					{
						Token token12 = stream.Consume(TokenType.DOT, null, false);
						Token token13 = stream.Consume(TokenType.IDENTIFIER, null, false);
						LiteralNode literalNode = node as LiteralNode;
						if (literalNode != null)
						{
							PyConstBag pyConstBag = literalNode.value as PyConstBag;
							if (pyConstBag != null)
							{
								try
								{
									node = new LiteralNode(pyConstBag.Evaluate(token13.value, node.boxedParams.wordStart, node.boxedParams.wordEnd).Item1, f, node.boxedParams.wordStart, token13.startIndex + token13.value.Length);
									continue;
								}
								catch (ExecuteException ex)
								{
									throw new ParseException(ex.Message, ex.startIndex, ex.endIndex);
								}
							}
						}
						Node item2 = new ValueNode(token13.value, f, token13.startIndex, token13.startIndex + token13.value.Length);
						node = new BinaryExprNode(".", TokenType.DOT, f, token12.startIndex, token12.startIndex + token12.value.Length)
						{
							slots = 
							{
								node,
								item2
							}
						};
					}
				}
			}
		}
		return node;
	}

	
	private static Node SliceIndex(TokenStream stream, CodeWindow f, bool couldBeLastSlice = false)
	{
		Parser.LineBreaks(stream);
		Token token = stream.Current;
		Node node;
		if (token == null || token.type != TokenType.COLON)
		{
			Token token2 = stream.Current;
			if (token2 == null || token2.type != TokenType.SQUARE_BRACKET_CLOSE || !couldBeLastSlice)
			{
				node = Parser.Expression(stream, f, 0, true, TokenType.NO_TOKEN, false);
				Token token3 = stream.Current;
				if (token3 == null || token3.type != TokenType.COLON)
				{
					node = Parser.TupleOrExpression(stream, f, true, TokenType.SQUARE_BRACKET_CLOSE, node, false);
					goto IL_89;
				}
				goto IL_89;
			}
		}
		node = new LiteralNode(new PyNone(), f, stream.CurrentStringStartIndex, stream.CurrentStringStartIndex);
		IL_89:
		Parser.LineBreaks(stream);
		return node;
	}

	
	private static Node AtomicExpression(TokenStream stream, CodeWindow f, bool canBeTypeAnnotated)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.BRACKET_OPEN)
		{
			return Parser.BracketExpression(stream, f);
		}
		Token token2 = stream.Current;
		if (token2 != null && token2.type == TokenType.SQUARE_BRACKET_OPEN)
		{
			int currentStringStartIndex = stream.CurrentStringStartIndex;
			int currentStringEndIndex = stream.CurrentStringEndIndex;
			stream.Consume(TokenType.SQUARE_BRACKET_OPEN, null, false);
			bool flag;
			Node item = Parser.Sequence(stream, f, TokenType.SQUARE_BRACKET_CLOSE, out flag, false, true);
			stream.Consume(TokenType.SQUARE_BRACKET_CLOSE, null, false);
			return new ListNode(f, currentStringStartIndex, currentStringEndIndex)
			{
				slots = 
				{
					item
				}
			};
		}
		Token token3 = stream.Current;
		if (token3 != null && token3.type == TokenType.CURL_BRACE_OPEN)
		{
			int currentStringStartIndex2 = stream.CurrentStringStartIndex;
			int currentStringEndIndex2 = stream.CurrentStringEndIndex;
			stream.Consume(TokenType.CURL_BRACE_OPEN, null, false);
			bool flag2;
			Node item2 = Parser.Sequence(stream, f, TokenType.CURL_BRACE_CLOSE, out flag2, true, true);
			stream.Consume(TokenType.CURL_BRACE_CLOSE, null, false);
			if (flag2)
			{
				return new DictNode(f, currentStringStartIndex2, currentStringEndIndex2)
				{
					slots = 
					{
						item2
					}
				};
			}
			return new SetNode(f, currentStringStartIndex2, currentStringEndIndex2)
			{
				slots = 
				{
					item2
				}
			};
		}
		else
		{
			Token token4 = stream.Current;
			if (token4 != null && token4.type == TokenType.NUM)
			{
				Token token5 = stream.Consume(TokenType.NUM, null, false);
				double num;
				try
				{
					num = double.Parse(token5.value, NumberStyles.AllowDecimalPoint, CultureInfo.InvariantCulture);
				}
				catch (OverflowException)
				{
					num = double.PositiveInfinity;
				}
				catch (FormatException)
				{
					throw new ParseException("error_invalid_number_format", token5.startIndex, token5.startIndex + token5.value.Length);
				}
				return new LiteralNode(new PyNumber(num), f, token5.startIndex, token5.startIndex + token5.value.Length);
			}
			Token token6 = stream.Current;
			if (token6 != null && token6.type == TokenType.STRING)
			{
				Token token7 = stream.Consume(TokenType.STRING, null, false);
				return new LiteralNode(new PyString(token7.value.Substring(1, token7.value.Length - 2)), f, token7.startIndex, token7.startIndex + token7.value.Length);
			}
			Token token8 = stream.Current;
			if (token8 == null || token8.type != TokenType.IDENTIFIER)
			{
				throw new ParseException("error_invalid_expression", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
			}
			Token token9 = stream.Consume(TokenType.IDENTIFIER, null, false);
			if (canBeTypeAnnotated)
			{
				Parser.OptionalVariableTypeAnnotation(stream);
			}
			IPyObject pyObject = Scope.EvaluateConstant(token9.value);
			if (pyObject != null)
			{
				return new LiteralNode(pyObject, f, token9.startIndex, token9.startIndex + token9.value.Length);
			}
			return new ValueNode(token9.value, f, token9.startIndex, token9.startIndex + token9.value.Length);
		}
	}

	
	private static void ProcessChainedComparisons(Node tree)
	{
		List<ValueTuple<Node, Node, int>> list = new List<ValueTuple<Node, Node, int>>();
		list.Add(new ValueTuple<Node, Node, int>(tree, null, 0));
		while (list.Count > 0)
		{
			ValueTuple<Node, Node, int> valueTuple = list[list.Count - 1];
			Node item = valueTuple.Item1;
			Node item2 = valueTuple.Item2;
			list.RemoveAt(list.Count - 1);
			if (item2 != null)
			{
				BinaryExprNode binaryExprNode = item as BinaryExprNode;
				if (binaryExprNode != null && binaryExprNode.opTokenType == TokenType.COMPARE)
				{
					BinaryExprNode binaryExprNode2 = binaryExprNode.slots[0] as BinaryExprNode;
					if (binaryExprNode2 != null)
					{
						TokenType opTokenType = binaryExprNode2.opTokenType;
					}
				}
			}
		}
	}

	
	private static int GetIndentation(TokenStream stream)
	{
		Token token = stream.Current;
		if (token == null || token.type != TokenType.NEW_LINE)
		{
			throw new ParseException("error_new_line_expected", stream.CurrentStringStartIndex, stream.CurrentStringEndIndex);
		}
		for (;;)
		{
			Token lookAhead = stream.LookAhead;
			if (lookAhead == null || lookAhead.type != TokenType.NEW_LINE)
			{
				break;
			}
			stream.Consume(TokenType.NEW_LINE, null, false);
		}
		string value = stream.Current.value;
		if (value.Contains('\t') && value.Contains(' '))
		{
			throw new ParseException("error_mixed_indentation", stream.CurrentStringStartIndex + 1, stream.CurrentStringEndIndex);
		}
		return value.Count((char c) => c == ' ') + value.Count((char c) => c == '\t') * 4;
	}

	
	private static Token ConsumeColon(TokenStream stream)
	{
		Token token = stream.Current;
		if (token != null && token.type == TokenType.NEW_LINE)
		{
			stream.Consume(TokenType.COLON, "error_missing_colon", true);
		}
		return stream.Consume(TokenType.COLON, null, false);
	}

	
	[TupleElementNames(new string[]
	{
		"types",
		"evaluationFunc"
	})]
	private static List<ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>> operators = new List<ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>>
	{
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.OR
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.BinaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.AND
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.BinaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.NOT
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.UnaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.COMPARE,
			TokenType.IN
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.BinaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.ADD
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.BinaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.MULT
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.BinaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.ADD
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.UnaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.EXP
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.BinaryExpression)),
		new ValueTuple<List<TokenType>, Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>>(new List<TokenType>
		{
			TokenType.BRACKET_OPEN,
			TokenType.SQUARE_BRACKET_OPEN,
			TokenType.DOT
		}, new Func<TokenStream, CodeWindow, int, bool, TokenType, bool, Node>(Parser.IndexDotOrCallExpression))
	};
}
