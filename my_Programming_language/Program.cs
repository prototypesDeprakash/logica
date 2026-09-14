using Antlr4.Runtime;

string code = """
move();
turnLeft();
harvest();
""";

Console.WriteLine("SOURCE:");
Console.WriteLine(code);
Console.WriteLine();

// Create ANTLR input
AntlrInputStream input = new AntlrInputStream(code);

// Lexer
SimpleLexer lexer = new SimpleLexer(input);

// Tokens
CommonTokenStream tokens = new CommonTokenStream(lexer);

// Parser
SimpleParser parser = new SimpleParser(tokens);

// Parse
SimpleParser.ProgramContext tree = parser.program();

Console.WriteLine("PARSE TREE:");
Console.WriteLine(tree.ToStringTree(parser));