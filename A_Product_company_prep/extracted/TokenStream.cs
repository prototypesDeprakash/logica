using System;
using System.Collections.Generic;
using System.Linq;


public class TokenStream
{

	public void Add(Token t)
	{
		this.tokens.AddLast(t);
		this.lastStringIndex = t.startIndex + t.value.Length;
	}

	public Token Current
	{
		get
		{
			LinkedListNode<Token> first = this.tokens.First;
			if (first == null)
			{
				return null;
			}
			return first.Value;
		}
	}

		public Token LookAhead
	{
		get
		{
			LinkedListNode<Token> first = this.tokens.First;
			if (first == null)
			{
				return null;
			}
			LinkedListNode<Token> next = first.Next;
			if (next == null)
			{
				return null;
			}
			return next.Value;
		}
	}

	public Token LookAheadIgnoreNewlines
	{
		get
		{
			LinkedListNode<Token> linkedListNode;
			for (linkedListNode = this.tokens.First; linkedListNode != null; linkedListNode = linkedListNode.Next)
			{
				Token value = linkedListNode.Value;
				TokenType? tokenType = (value != null) ? new TokenType?(value.type) : null;
				TokenType tokenType2 = TokenType.NEW_LINE;
				if (!(tokenType.GetValueOrDefault() == tokenType2 & tokenType != null))
				{
					break;
				}
			}
			if (linkedListNode == null)
			{
				return null;
			}
			LinkedListNode<Token> next = linkedListNode.Next;
			if (next == null)
			{
				return null;
			}
			return next.Value;
		}
	}

		public Token Last
	{
		get
		{
			LinkedListNode<Token> last = this.tokens.Last;
			if (last == null)
			{
				return null;
			}
			return last.Value;
		}
	}

		public int CurrentStringEndIndex
	{
		get
		{
			if (this.Current == null)
			{
				return this.lastStringIndex;
			}
			return this.Current.startIndex + this.Current.value.Length;
		}
	}
	public int CurrentStringStartIndex
	{
		get
		{
			if (this.Current == null)
			{
				return this.lastStringIndex;
			}
			return this.Current.startIndex;
		}
	}

		public Token Consume(TokenType type = TokenType.NO_TOKEN, string error = null, bool moveErrorBack = false)
	{
		Token token = this.Current;
		if (token == null)
		{
			if (error == null)
			{
				throw new ParseException(string.Format(Localizer.Localize("error_unexpected_token"), type), this.lastStringIndex, this.lastStringIndex);
			}
			throw new ParseException(error, this.lastStringIndex, this.lastStringIndex);
		}
		else
		{
			if (type == TokenType.NO_TOKEN || token.type == type)
			{
				this.tokens.RemoveFirst();
				return token;
			}
			int num = (token.type == TokenType.NEW_LINE) ? 1 : 0;
			if (error == null)
			{
				throw new ParseException(string.Format(Localizer.Localize("error_unexpected_token"), type), token.startIndex - (moveErrorBack ? 1 : 0) + num, token.startIndex + (moveErrorBack ? 0 : token.value.Length));
			}
			throw new ParseException(error, token.startIndex - (moveErrorBack ? 1 : 0) + num, token.startIndex + (moveErrorBack ? 0 : token.value.Length));
		}
	}

		public void RemoveLast()
	{
		if (this.tokens.Last != null)
		{
			this.tokens.RemoveLast();
		}
		this.lastStringIndex = ((this.Last != null) ? (this.Last.startIndex + this.Last.value.Length) : 0);
	}

		public IEnumerator<Token> GetEnumerator()
	{
		return this.tokens.GetEnumerator();
	}
	public IEnumerable<Token> IterateReverse()
	{
		for (LinkedListNode<Token> node = this.tokens.Last; node != null; node = node.Previous)
		{
			yield return node.Value;
		}
		yield break;
	}


	public List<Token> ToList()
	{
		return this.tokens.ToList<Token>();
	}

		public override string ToString()
	{
		string text = "";
		foreach (Token token in this)
		{
			text += string.Format(" {0} {1} |", token.value, token.type).Replace("\n", "\\n").Replace("\t", "\\t");
		}
		return text;
	}

		public Token GetLastNewLine(int pos)
	{
		LinkedListNode<Token> linkedListNode = this.TokenNodeAtPos(pos);
		for (linkedListNode = ((linkedListNode != null) ? linkedListNode.Previous : this.tokens.Last); linkedListNode != null; linkedListNode = linkedListNode.Previous)
		{
			if (linkedListNode.Value.type == TokenType.NEW_LINE)
			{
				return linkedListNode.Value;
			}
		}
		return null;
	}

	
	public Token GetTokenAtPos(int pos)
	{
		return this.TokenNodeAtPos(pos).Value;
	}

		private LinkedListNode<Token> TokenNodeAtPos(int pos)
	{
		LinkedListNode<Token> linkedListNode = this.tokens.First;
		while (linkedListNode != null && linkedListNode.Value.startIndex + linkedListNode.Value.value.Length <= pos)
		{
			linkedListNode = linkedListNode.Next;
		}
		return linkedListNode;
	}

		private LinkedList<Token> tokens = new LinkedList<Token>();

	private int lastStringIndex;
}
