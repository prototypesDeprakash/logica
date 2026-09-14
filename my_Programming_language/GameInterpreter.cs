using System;
using System.Collections.Generic;

public class GameInterpreter : SimpleBaseVisitor<object>
{
    private readonly Dictionary<string, object> variables = new();

    // Stores user-created functions.
    private readonly Dictionary<string, SimpleParser.FunctionDeclarationContext> functions
        = new();

    // ============================================
    // PROGRAM
    // ============================================

    public override object VisitProgram(SimpleParser.ProgramContext context)
    {
        // First pass:
        // register all user-defined functions.
        foreach (var line in context.line())
        {
            if (line.functionDeclaration() != null)
            {
                Visit(line.functionDeclaration());
            }
        }

        // Second pass:
        // execute normal code.
        foreach (var line in context.line())
        {
            if (line.functionDeclaration() == null)
            {
                Visit(line);
            }
        }

        return null;
    }

    // ============================================
    // FUNCTION DECLARATION
    // ============================================

    public override object VisitFunctionDeclaration(
        SimpleParser.FunctionDeclarationContext context)
    {
        string functionName = context.ID().GetText();

        functions[functionName] = context;

        Console.WriteLine(
            $"Registered function: {functionName}"
        );

        return null;
    }

    // ============================================
    // FUNCTION CALL
    // ============================================

    public override object VisitFunctionCall(
        SimpleParser.FunctionCallContext context)
    {
        string functionName = context.ID().GetText();

        // Check built-in functions first.
        if (ExecuteBuiltInFunction(functionName))
        {
            return null;
        }

        // Check user-created functions.
        if (functions.TryGetValue(
                functionName,
                out SimpleParser.FunctionDeclarationContext function))
        {
            Visit(function.block());
            return null;
        }

        Console.WriteLine(
            $"Unknown function: {functionName}"
        );

        return null;
    }

    // ============================================
    // PRINT
    // ============================================

    public override object VisitPrintStatement(
        SimpleParser.PrintStatementContext context)
    {
        if (context.expression() == null)
        {
            Console.WriteLine();
            return null;
        }

        object value = Visit(context.expression());

        Console.WriteLine(value);

        return null;
    }

    // ============================================
    // BUILT-IN FUNCTIONS
    // ============================================

    private bool ExecuteBuiltInFunction(string functionName)
    {
        switch (functionName)
        {
            case "move":
                Console.WriteLine("PLAYER -> MOVE");
                return true;

            case "turnLeft":
                Console.WriteLine("PLAYER -> TURN LEFT");
                return true;

            case "turnRight":
                Console.WriteLine("PLAYER -> TURN RIGHT");
                return true;

            case "harvest":
                Console.WriteLine("PLAYER -> HARVEST");
                return true;

            default:
                return false;
        }
    }

    // ============================================
    // BLOCK
    // ============================================

    public override object VisitBlock(SimpleParser.BlockContext context)
    {
        foreach (var line in context.line())
        {
            Visit(line);
        }

        return null;
    }

    // ============================================
    // VARIABLE DECLARATION
    // ============================================

    public override object VisitVariableDeclaration(
        SimpleParser.VariableDeclarationContext context)
    {
        string name = context.ID().GetText();

        object value = Visit(context.expression());

        variables[name] = value;

        return null;
    }

public override object VisitVariableDeclarationNoSemicolon(
    SimpleParser.VariableDeclarationNoSemicolonContext context)
{
    string name = context.ID().GetText();

    object value = Visit(context.expression());

    variables[name] = value;

    return null;
}
    // ============================================
    // ASSIGNMENT
    // ============================================

    public override object VisitAssignment(
        SimpleParser.AssignmentContext context)
    {
        string name = context.ID().GetText();

        object value = Visit(context.expression());

        variables[name] = value;

        return null;
    }

    // ============================================
    // INCREMENT
    // ============================================

    public override object VisitIncrement(
        SimpleParser.IncrementContext context)
    {
        string name = context.ID().GetText();

        int value = Convert.ToInt32(variables[name]);

        variables[name] = value + 1;

        return null;
    }

    // ============================================
    // DECREMENT
    // ============================================

    public override object VisitDecrement(
        SimpleParser.DecrementContext context)
    {
        string name = context.ID().GetText();

        int value = Convert.ToInt32(variables[name]);

        variables[name] = value - 1;

        return null;
    }

    // ============================================
    // EXPRESSION
    // ============================================

    public override object VisitExpression(
        SimpleParser.ExpressionContext context)
    {
        if (context.ID() != null)
        {
            string name = context.ID().GetText();

            if (variables.TryGetValue(name, out object value))
                return value;

            Console.WriteLine(
                $"Unknown variable: {name}"
            );

            return null;
        }

        if (context.INT() != null)
        {
            return int.Parse(context.INT().GetText());
        }

        if (context.STRING() != null)
        {
            string value = context.STRING().GetText();

            return value.Substring(
                1,
                value.Length - 2
            );
        }

        if (context.TRUE() != null)
            return true;

        if (context.FALSE() != null)
            return false;

        // Parentheses
        if (context.expression().Length == 1)
        {
            return Visit(context.expression(0));
        }

        // Binary expression
        if (context.expression().Length == 2)
        {
            object left =
                Visit(context.expression(0));

            object right =
                Visit(context.expression(1));

            string op =
                context.GetChild(1).GetText();

            return EvaluateBinary(left, op, right);
        }

        // !expression
        if (context.expression().Length == 1)
        {
            string first = context.GetChild(0).GetText();

            if (first == "!")
            {
                return !Convert.ToBoolean(
                    Visit(context.expression(0))
                );
            }
        }

        return null;
    }

    // ============================================
    // BINARY OPERATORS
    // ============================================

    private object EvaluateBinary(
        object left,
        string op,
        object right)
    {
        switch (op)
        {
            case "+":
                return Convert.ToInt32(left)
                     + Convert.ToInt32(right);

            case "-":
                return Convert.ToInt32(left)
                     - Convert.ToInt32(right);

            case "*":
                return Convert.ToInt32(left)
                     * Convert.ToInt32(right);

            case "/":
                return Convert.ToInt32(left)
                     / Convert.ToInt32(right);

            case "<":
                return Convert.ToInt32(left)
                     < Convert.ToInt32(right);

            case ">":
                return Convert.ToInt32(left)
                     > Convert.ToInt32(right);

            case "<=":
                return Convert.ToInt32(left)
                     <= Convert.ToInt32(right);

            case ">=":
                return Convert.ToInt32(left)
                     >= Convert.ToInt32(right);

            case "==":
                return Equals(left, right);

            case "!=":
                return !Equals(left, right);

            case "&&":
                return Convert.ToBoolean(left)
                    && Convert.ToBoolean(right);

            case "||":
                return Convert.ToBoolean(left)
                    || Convert.ToBoolean(right);

            default:
                throw new Exception(
                    $"Unknown operator: {op}"
                );
        }
    }

    // ============================================
    // IF
    // ============================================

    public override object VisitIfBlock(
    SimpleParser.IfBlockContext context)
{
    bool condition =
        Convert.ToBoolean(
            Visit(context.expression())
        );

    // First block is always the main IF block
    if (condition)
    {
        Visit(context.block()[0]);
        return null;
    }

    // No ELSE
    if (context.ELSE() == null)
        return null;

    // ELSE IF
    if (context.ifBlock() != null)
    {
        Visit(context.ifBlock());
        return null;
    }

    // ELSE block
    // Because there are potentially two block references,
    // ANTLR gives us an array.
    if (context.block().Length > 1)
    {
        Visit(context.block()[1]);
    }

    return null;
}
    // ============================================
    // WHILE
    // ============================================

    public override object VisitWhileBlock(
        SimpleParser.WhileBlockContext context)
    {
        int safety = 0;

        while (Convert.ToBoolean(
            Visit(context.expression())))
        {
            Visit(context.block());

            safety++;

            if (safety > 10000)
            {
                Console.WriteLine(
                    "Possible infinite loop."
                );

                break;
            }
        }

        return null;
    }

    // ============================================
    // FOR
    // ============================================

  public override object VisitForBlock(
    SimpleParser.ForBlockContext context)
{
    // for (int i = 0; ...)
    if (context.forInit() != null)
    {
        Visit(context.forInit());
    }

    int safety = 0;

    while (true)
    {
        // Check condition
        if (context.expression() != null)
        {
            bool condition =
                Convert.ToBoolean(
                    Visit(context.expression())
                );

            if (!condition)
                break;
        }

        // Execute body
        Visit(context.block());

        // Execute i++
        if (context.forUpdate() != null)
        {
            Visit(context.forUpdate());
        }

        safety++;

        if (safety > 10000)
        {
            Console.WriteLine("Possible infinite loop.");
            break;
        }
    }

    return null;
}
}