// Generated from C:/Users/Peter/OneDrive/MSc_fv2/Fordítóprogramok/Gyakorlat/kötprog/scripting-language/src/ScriptingLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScriptingLanguageParser}.
 */
public interface ScriptingLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ScriptingLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ScriptingLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ScriptingLanguageParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ScriptingLanguageParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ScriptingLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ScriptingLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ScriptingLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ScriptingLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber_expression(ScriptingLanguageParser.Number_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#number_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber_expression(ScriptingLanguageParser.Number_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(ScriptingLanguageParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(ScriptingLanguageParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#number_factor}.
	 * @param ctx the parse tree
	 */
	void enterNumber_factor(ScriptingLanguageParser.Number_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#number_factor}.
	 * @param ctx the parse tree
	 */
	void exitNumber_factor(ScriptingLanguageParser.Number_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(ScriptingLanguageParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(ScriptingLanguageParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#or_op}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(ScriptingLanguageParser.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#or_op}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(ScriptingLanguageParser.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void enterLogical_factor(ScriptingLanguageParser.Logical_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#logical_factor}.
	 * @param ctx the parse tree
	 */
	void exitLogical_factor(ScriptingLanguageParser.Logical_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ScriptingLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ScriptingLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ScriptingLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ScriptingLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ScriptingLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ScriptingLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#declaration_and_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_and_assignment(ScriptingLanguageParser.Declaration_and_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#declaration_and_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_and_assignment(ScriptingLanguageParser.Declaration_and_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScriptingLanguageParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ScriptingLanguageParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScriptingLanguageParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ScriptingLanguageParser.UpdateContext ctx);
}