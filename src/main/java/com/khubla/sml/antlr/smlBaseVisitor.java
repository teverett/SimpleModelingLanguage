// Generated from com/khubla/sml/antlr/sml.g4 by ANTLR 4.5.1
package com.khubla.sml.antlr;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link smlVisitor}, which can be extended to create a visitor which only needs to handle a subset of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return type.
 */
public class smlBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements smlVisitor<T> {
   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitAccesstype(smlParser.AccesstypeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitAtom(smlParser.AtomContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitComponent(smlParser.ComponentContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitDerivative(smlParser.DerivativeContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitEquation(smlParser.EquationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitEquations(smlParser.EquationsContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitExpression(smlParser.ExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitFunc(smlParser.FuncContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitFuncname(smlParser.FuncnameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitImports(smlParser.ImportsContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitImportSpec(smlParser.ImportSpecContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitModel(smlParser.ModelContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitModelDeclaration(smlParser.ModelDeclarationContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitModelName(smlParser.ModelNameContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitMultiplyingExpression(smlParser.MultiplyingExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitNumber(smlParser.NumberContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitPowExpression(smlParser.PowExpressionContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitRelop(smlParser.RelopContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitScientific(smlParser.ScientificContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitVardecl(smlParser.VardeclContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitVariable(smlParser.VariableContext ctx) {
      return visitChildren(ctx);
   }

   /**
    * {@inheritDoc}
    * <p>
    * The default implementation returns the result of calling {@link #visitChildren} on {@code ctx}.
    * </p>
    */
   @Override
   public T visitVariables(smlParser.VariablesContext ctx) {
      return visitChildren(ctx);
   }
}