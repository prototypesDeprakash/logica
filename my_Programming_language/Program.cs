using Antlr4.Runtime;

string filePath = "program.prakash";

if (!File.Exists(filePath))
{
    Console.WriteLine("program.prakash not found.");
    return;
}

string code = File.ReadAllText(filePath);

Console.WriteLine("===== CODE =====");
Console.WriteLine(code);
Console.WriteLine();

AntlrInputStream input = new AntlrInputStream(code);

SimpleLexer lexer = new SimpleLexer(input);

CommonTokenStream tokens = new CommonTokenStream(lexer);

SimpleParser parser = new SimpleParser(tokens);

SimpleParser.ProgramContext tree = parser.program();

GameInterpreter interpreter = new GameInterpreter();

interpreter.Visit(tree);