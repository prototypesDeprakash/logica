using System;


public class ParseException : Exception
{

	public ParseException(string message, int startIndex, int endIndex) : base(message)
	{
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	public int startIndex;

	public int endIndex;
}
