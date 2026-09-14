using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;
using System.Text.RegularExpressions;


public class Tokenizer
{
	
	public static bool Tokenize(string code, out TokenStream stream)
	{
		stream = new TokenStream();
		stream.Add(new Token(TokenType.NEW_LINE, "\n", 0));
		bool flag = false;
		string text = code.Replace("\v", "\n");
		int i = 0;
		while (i < text.Length)
		{
			bool flag2 = false;
			foreach (ValueTuple<string, bool, TokenType> valueTuple in Tokenizer.constantTokens)
			{
				string item = valueTuple.Item1;
				bool item2 = valueTuple.Item2;
				TokenType item3 = valueTuple.Item3;
				if (i + item.Length <= text.Length && text.AsSpan(i, item.Length).SequenceEqual(item))
				{
					if (item2 && i + item.Length < text.Length)
					{
						char c = text[i + item.Length];
						if (char.IsLetterOrDigit(c) || c == '_')
						{
							goto IL_EF;
						}
					}
					stream.Add(new Token(item3, item, i));
					i += item.Length;
					flag2 = true;
					break;
				}
				IL_EF:;
			}
			if (!flag2)
			{
				foreach (ValueTuple<Regex, TokenType> valueTuple2 in Tokenizer.regexTokens)
				{
					Regex item4 = valueTuple2.Item1;
					TokenType item5 = valueTuple2.Item2;
					Match match = item4.Match(text, i);
					if (match.Success)
					{
						if (item5 != TokenType.IGNORE)
						{
							stream.Add(new Token(item5, match.Value, i));
						}
						flag |= (item5 == TokenType.UNKNOWN);
						i += match.Length;
						flag2 = true;
						break;
					}
				}
				if (!flag2)
				{
					throw new Exception("nothing matched, not even UNKNOWN. this should never happen");
				}
			}
		}
		for (;;)
		{
			Token last = stream.Last;
			if (last == null || last.type != TokenType.NEW_LINE)
			{
				break;
			}
			stream.RemoveLast();
		}
		return flag;
	}

	[TupleElementNames(new string[]
	{
		"Text",
		"needsWordBoundary",
		"Type"
	})]
	private static readonly ValueTuple<string, bool, TokenType>[] constantTokens = new ValueTuple<string, bool, TokenType>[]
	{
		new ValueTuple<string, bool, TokenType>("if", true, TokenType.IF),
		new ValueTuple<string, bool, TokenType>("else", true, TokenType.ELSE),
		new ValueTuple<string, bool, TokenType>("for", true, TokenType.FOR),
		new ValueTuple<string, bool, TokenType>("or", true, TokenType.OR),
		new ValueTuple<string, bool, TokenType>("and", true, TokenType.AND),
		new ValueTuple<string, bool, TokenType>("return", true, TokenType.RETURN),
		new ValueTuple<string, bool, TokenType>("def", true, TokenType.DEF),
		new ValueTuple<string, bool, TokenType>("while", true, TokenType.WHILE),
		new ValueTuple<string, bool, TokenType>("elif", true, TokenType.ELIF),
		new ValueTuple<string, bool, TokenType>("break", true, TokenType.BREAK),
		new ValueTuple<string, bool, TokenType>("continue", true, TokenType.CONTINUE),
		new ValueTuple<string, bool, TokenType>("pass", true, TokenType.PASS),
		new ValueTuple<string, bool, TokenType>("**", false, TokenType.EXP),
		new ValueTuple<string, bool, TokenType>("==", false, TokenType.COMPARE),
		new ValueTuple<string, bool, TokenType>("=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("!=", false, TokenType.COMPARE),
		new ValueTuple<string, bool, TokenType>("<=", false, TokenType.COMPARE),
		new ValueTuple<string, bool, TokenType>(">=", false, TokenType.COMPARE),
		new ValueTuple<string, bool, TokenType>("<", false, TokenType.COMPARE),
		new ValueTuple<string, bool, TokenType>(">", false, TokenType.COMPARE),
		new ValueTuple<string, bool, TokenType>("(", false, TokenType.BRACKET_OPEN),
		new ValueTuple<string, bool, TokenType>(")", false, TokenType.BRACKET_CLOSE),
		new ValueTuple<string, bool, TokenType>("+=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("+", false, TokenType.ADD),
		new ValueTuple<string, bool, TokenType>("-=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("->", false, TokenType.ARROW),
		new ValueTuple<string, bool, TokenType>("-", false, TokenType.ADD),
		new ValueTuple<string, bool, TokenType>("*=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("//=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("//", false, TokenType.MULT),
		new ValueTuple<string, bool, TokenType>("/=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("%=", false, TokenType.ASSIGN),
		new ValueTuple<string, bool, TokenType>("*", false, TokenType.MULT),
		new ValueTuple<string, bool, TokenType>("/", false, TokenType.MULT),
		new ValueTuple<string, bool, TokenType>("%", false, TokenType.MULT),
		new ValueTuple<string, bool, TokenType>("[", false, TokenType.SQUARE_BRACKET_OPEN),
		new ValueTuple<string, bool, TokenType>("]", false, TokenType.SQUARE_BRACKET_CLOSE),
		new ValueTuple<string, bool, TokenType>("{", false, TokenType.CURL_BRACE_OPEN),
		new ValueTuple<string, bool, TokenType>("}", false, TokenType.CURL_BRACE_CLOSE),
		new ValueTuple<string, bool, TokenType>(",", false, TokenType.COMMA),
		new ValueTuple<string, bool, TokenType>(":", false, TokenType.COLON),
		new ValueTuple<string, bool, TokenType>("|", false, TokenType.UNION),
		new ValueTuple<string, bool, TokenType>("global", true, TokenType.GLOBAL),
		new ValueTuple<string, bool, TokenType>("import", true, TokenType.IMPORT),
		new ValueTuple<string, bool, TokenType>("from", true, TokenType.FROM)
	};

	
	private static readonly List<ValueTuple<Regex, TokenType>> regexTokens = new List<ValueTuple<Regex, TokenType>>
	{
		new ValueTuple<Regex, TokenType>(new Regex("\\G(\\d*\\.)?\\d+\\b"), TokenType.NUM),
		new ValueTuple<Regex, TokenType>(new Regex("\\G(?:in|not\\s+in)\\b"), TokenType.IN),
		new ValueTuple<Regex, TokenType>(new Regex("\\Gnot\\b"), TokenType.NOT),
		new ValueTuple<Regex, TokenType>(new Regex("\\G[a-zA-Z_]\\w*"), TokenType.IDENTIFIER),
		new ValueTuple<Regex, TokenType>(new Regex("\\G(['\"])(.*?)\\1"), TokenType.STRING),
		new ValueTuple<Regex, TokenType>(new Regex("\\G\\n( |\\t)*"), TokenType.NEW_LINE),
		new ValueTuple<Regex, TokenType>(new Regex("\\G[\\s-[\\n]]+"), TokenType.IGNORE),
		new ValueTuple<Regex, TokenType>(new Regex("\\G#.*"), TokenType.IGNORE),
		new ValueTuple<Regex, TokenType>(new Regex("\\G\\."), TokenType.DOT),
		new ValueTuple<Regex, TokenType>(new Regex("\\G\\S+"), TokenType.UNKNOWN)
	};
}
