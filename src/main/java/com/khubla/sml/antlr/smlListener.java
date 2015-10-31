// Generated from com/khubla/sml/antlr/sml.g4 by ANTLR 4.5.1
package com.khubla.sml.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by {@link smlParser}.
 */
public interface smlListener extends ParseTreeListener {
   /**
    * Enter a parse tree produced by {@link smlParser#accesstype}.
    * 
    * @param ctx the parse tree
    */
   void enterAccesstype(smlParser.AccesstypeContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#atom}.
    * 
    * @param ctx the parse tree
    */
   void enterAtom(smlParser.AtomContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#component}.
    * 
    * @param ctx the parse tree
    */
   void enterComponent(smlParser.ComponentContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#derivative}.
    * 
    * @param ctx the parse tree
    */
   void enterDerivative(smlParser.DerivativeContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#equation}.
    * 
    * @param ctx the parse tree
    */
   void enterEquation(smlParser.EquationContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#equations}.
    * 
    * @param ctx the parse tree
    */
   void enterEquations(smlParser.EquationsContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void enterExpression(smlParser.ExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#func}.
    * 
    * @param ctx the parse tree
    */
   void enterFunc(smlParser.FuncContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#funcname}.
    * 
    * @param ctx the parse tree
    */
   void enterFuncname(smlParser.FuncnameContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#imports}.
    * 
    * @param ctx the parse tree
    */
   void enterImports(smlParser.ImportsContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#importSpec}.
    * 
    * @param ctx the parse tree
    */
   void enterImportSpec(smlParser.ImportSpecContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#model}.
    * 
    * @param ctx the parse tree
    */
   void enterModel(smlParser.ModelContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#modelDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void enterModelDeclaration(smlParser.ModelDeclarationContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#modelName}.
    * 
    * @param ctx the parse tree
    */
   void enterModelName(smlParser.ModelNameContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#multiplyingExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterMultiplyingExpression(smlParser.MultiplyingExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#number}.
    * 
    * @param ctx the parse tree
    */
   void enterNumber(smlParser.NumberContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#powExpression}.
    * 
    * @param ctx the parse tree
    */
   void enterPowExpression(smlParser.PowExpressionContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#relop}.
    * 
    * @param ctx the parse tree
    */
   void enterRelop(smlParser.RelopContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#scientific}.
    * 
    * @param ctx the parse tree
    */
   void enterScientific(smlParser.ScientificContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#vardecl}.
    * 
    * @param ctx the parse tree
    */
   void enterVardecl(smlParser.VardeclContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#variable}.
    * 
    * @param ctx the parse tree
    */
   void enterVariable(smlParser.VariableContext ctx);

   /**
    * Enter a parse tree produced by {@link smlParser#variables}.
    * 
    * @param ctx the parse tree
    */
   void enterVariables(smlParser.VariablesContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#accesstype}.
    * 
    * @param ctx the parse tree
    */
   void exitAccesstype(smlParser.AccesstypeContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#atom}.
    * 
    * @param ctx the parse tree
    */
   void exitAtom(smlParser.AtomContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#component}.
    * 
    * @param ctx the parse tree
    */
   void exitComponent(smlParser.ComponentContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#derivative}.
    * 
    * @param ctx the parse tree
    */
   void exitDerivative(smlParser.DerivativeContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#equation}.
    * 
    * @param ctx the parse tree
    */
   void exitEquation(smlParser.EquationContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#equations}.
    * 
    * @param ctx the parse tree
    */
   void exitEquations(smlParser.EquationsContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#expression}.
    * 
    * @param ctx the parse tree
    */
   void exitExpression(smlParser.ExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#func}.
    * 
    * @param ctx the parse tree
    */
   void exitFunc(smlParser.FuncContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#funcname}.
    * 
    * @param ctx the parse tree
    */
   void exitFuncname(smlParser.FuncnameContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#imports}.
    * 
    * @param ctx the parse tree
    */
   void exitImports(smlParser.ImportsContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#importSpec}.
    * 
    * @param ctx the parse tree
    */
   void exitImportSpec(smlParser.ImportSpecContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#model}.
    * 
    * @param ctx the parse tree
    */
   void exitModel(smlParser.ModelContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#modelDeclaration}.
    * 
    * @param ctx the parse tree
    */
   void exitModelDeclaration(smlParser.ModelDeclarationContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#modelName}.
    * 
    * @param ctx the parse tree
    */
   void exitModelName(smlParser.ModelNameContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#multiplyingExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitMultiplyingExpression(smlParser.MultiplyingExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#number}.
    * 
    * @param ctx the parse tree
    */
   void exitNumber(smlParser.NumberContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#powExpression}.
    * 
    * @param ctx the parse tree
    */
   void exitPowExpression(smlParser.PowExpressionContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#relop}.
    * 
    * @param ctx the parse tree
    */
   void exitRelop(smlParser.RelopContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#scientific}.
    * 
    * @param ctx the parse tree
    */
   void exitScientific(smlParser.ScientificContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#vardecl}.
    * 
    * @param ctx the parse tree
    */
   void exitVardecl(smlParser.VardeclContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#variable}.
    * 
    * @param ctx the parse tree
    */
   void exitVariable(smlParser.VariableContext ctx);

   /**
    * Exit a parse tree produced by {@link smlParser#variables}.
    * 
    * @param ctx the parse tree
    */
   void exitVariables(smlParser.VariablesContext ctx);
}