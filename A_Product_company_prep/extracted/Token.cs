using System;


public class Token
{
		public Token(TokenType type, string value, int startIndex)
	{
		this.type = type;
		this.value = value;
		this.startIndex = startIndex;
	}

	public TokenType type;

	public string value;

	
	public int startIndex;
}
