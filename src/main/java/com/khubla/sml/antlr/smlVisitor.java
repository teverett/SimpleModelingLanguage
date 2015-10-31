// Generated from com/khubla/sml/antlr/sml.g4 by ANTLR 4.5.1
package com.khubla.sml.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link smlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface smlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link smlParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(smlParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#modelDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelDeclaration(smlParser.ModelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#modelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelName(smlParser.ModelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(smlParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#importSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSpec(smlParser.ImportSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(smlParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(smlParser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#accesstype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesstype(smlParser.AccesstypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(smlParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#equations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquations(smlParser.EquationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(smlParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#derivative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivative(smlParser.DerivativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(smlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(smlParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(smlParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(smlParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(smlParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(smlParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(smlParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(smlParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(smlParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link smlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(smlParser.NumberContext ctx);
}