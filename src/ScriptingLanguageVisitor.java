// Generated from C:/Users/Peter/OneDrive/MSc_fv2/Fordítóprogramok/Gyakorlat/kötprog/scripting-language/src/ScriptingLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScriptingLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScriptingLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ScriptingLanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ScriptingLanguageParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ScriptingLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ScriptingLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#number_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_expression(ScriptingLanguageParser.Number_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(ScriptingLanguageParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#number_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_factor(ScriptingLanguageParser.Number_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(ScriptingLanguageParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#or_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_op(ScriptingLanguageParser.Or_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#and_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_op(ScriptingLanguageParser.And_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#logical_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_factor(ScriptingLanguageParser.Logical_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ScriptingLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ScriptingLanguageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ScriptingLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#declaration_and_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_and_assignment(ScriptingLanguageParser.Declaration_and_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(ScriptingLanguageParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(ScriptingLanguageParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptingLanguageParser#ternary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expression(ScriptingLanguageParser.Ternary_expressionContext ctx);
}