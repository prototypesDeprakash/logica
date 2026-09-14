// Generated from c:/Users/prave/OneDrive/Desktop/logica/my_Programming_language/Simple.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SimpleParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SimpleParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SimpleParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SimpleParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimpleParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SimpleParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SimpleParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(SimpleParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(SimpleParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(SimpleParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(SimpleParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(SimpleParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(SimpleParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SimpleParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SimpleParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(SimpleParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(SimpleParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#variableDeclarationNoSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationNoSemicolon(SimpleParser.VariableDeclarationNoSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#variableDeclarationNoSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationNoSemicolon(SimpleParser.VariableDeclarationNoSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#assignmentNoSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentNoSemicolon(SimpleParser.AssignmentNoSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#assignmentNoSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentNoSemicolon(SimpleParser.AssignmentNoSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(SimpleParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(SimpleParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(SimpleParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(SimpleParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#functionCallNoSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallNoSemicolon(SimpleParser.FunctionCallNoSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#functionCallNoSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallNoSemicolon(SimpleParser.FunctionCallNoSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(SimpleParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(SimpleParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleParser.ExpressionContext ctx);
}