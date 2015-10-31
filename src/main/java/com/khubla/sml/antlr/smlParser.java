// Generated from com/khubla/sml/antlr/sml.g4 by ANTLR 4.5.1
package com.khubla.sml.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class smlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DER=8, ASSIGN=9, 
		COS=10, SIN=11, TAN=12, ACOS=13, ASIN=14, ATAN=15, LN=16, LOG=17, LPAREN=18, 
		RPAREN=19, PLUS=20, MINUS=21, TIMES=22, DIV=23, GT=24, LT=25, EQ=26, COMMA=27, 
		POINT=28, E=29, POW=30, SEMICOLON=31, COLON=32, NUMBER=33, ID=34, WS=35, 
		COMMENT=36;
	public static final int
		RULE_model = 0, RULE_modelDeclaration = 1, RULE_modelName = 2, RULE_imports = 3, 
		RULE_importSpec = 4, RULE_variables = 5, RULE_vardecl = 6, RULE_accesstype = 7, 
		RULE_component = 8, RULE_equations = 9, RULE_equation = 10, RULE_derivative = 11, 
		RULE_expression = 12, RULE_multiplyingExpression = 13, RULE_powExpression = 14, 
		RULE_atom = 15, RULE_func = 16, RULE_funcname = 17, RULE_relop = 18, RULE_variable = 19, 
		RULE_scientific = 20, RULE_number = 21;
	public static final String[] ruleNames = {
		"model", "modelDeclaration", "modelName", "imports", "importSpec", "variables", 
		"vardecl", "accesstype", "component", "equations", "equation", "derivative", 
		"expression", "multiplyingExpression", "powExpression", "atom", "func", 
		"funcname", "relop", "variable", "scientific", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'model'", "'imports'", "'variables'", "'public'", "'private'", 
		"'component'", "'equations'", "'der'", "':='", "'cos'", "'sin'", "'tan'", 
		"'acos'", "'asin'", "'atan'", "'ln'", "'log'", "'('", "')'", "'+'", "'-'", 
		"'*'", "'/'", "'>'", "'<'", "'='", "','", "'.'", null, "'^'", "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "DER", "ASSIGN", "COS", 
		"SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "LPAREN", "RPAREN", 
		"PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", "EQ", "COMMA", "POINT", "E", 
		"POW", "SEMICOLON", "COLON", "NUMBER", "ID", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "sml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public smlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModelContext extends ParserRuleContext {
		public ModelDeclarationContext modelDeclaration() {
			return getRuleContext(ModelDeclarationContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public EquationsContext equations() {
			return getRuleContext(EquationsContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			modelDeclaration();
			setState(46);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				imports();
				}
			}

			setState(48);
			variables();
			setState(49);
			equations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelDeclarationContext extends ParserRuleContext {
		public ModelNameContext modelName() {
			return getRuleContext(ModelNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(smlParser.SEMICOLON, 0); }
		public ModelDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterModelDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitModelDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitModelDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelDeclarationContext modelDeclaration() throws RecognitionException {
		ModelDeclarationContext _localctx = new ModelDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			modelName();
			setState(53);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(smlParser.ID, 0); }
		public ModelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterModelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitModelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitModelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelNameContext modelName() throws RecognitionException {
		ModelNameContext _localctx = new ModelNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(smlParser.COLON, 0); }
		public List<ImportSpecContext> importSpec() {
			return getRuleContexts(ImportSpecContext.class);
		}
		public ImportSpecContext importSpec(int i) {
			return getRuleContext(ImportSpecContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			match(COLON);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(59);
				importSpec();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportSpecContext extends ParserRuleContext {
		public ModelNameContext modelName() {
			return getRuleContext(ModelNameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(smlParser.SEMICOLON, 0); }
		public ImportSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterImportSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitImportSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitImportSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecContext importSpec() throws RecognitionException {
		ImportSpecContext _localctx = new ImportSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			modelName();
			setState(66);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(smlParser.COLON, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__2);
			setState(69);
			match(COLON);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << ID))) != 0)) {
				{
				setState(72);
				switch (_input.LA(1)) {
				case T__3:
				case T__4:
				case ID:
					{
					setState(70);
					vardecl();
					}
					break;
				case T__5:
					{
					setState(71);
					component();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(smlParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(smlParser.SEMICOLON, 0); }
		public AccesstypeContext accesstype() {
			return getRuleContext(AccesstypeContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(77);
				accesstype();
				}
			}

			setState(80);
			match(ID);
			setState(81);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccesstypeContext extends ParserRuleContext {
		public AccesstypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesstype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterAccesstype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitAccesstype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitAccesstype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesstypeContext accesstype() throws RecognitionException {
		AccesstypeContext _localctx = new AccesstypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_accesstype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public ModelNameContext modelName() {
			return getRuleContext(ModelNameContext.class,0);
		}
		public TerminalNode ID() { return getToken(smlParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(smlParser.SEMICOLON, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__5);
			setState(86);
			modelName();
			setState(87);
			match(ID);
			setState(88);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(smlParser.COLON, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public EquationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterEquations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitEquations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitEquations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationsContext equations() throws RecognitionException {
		EquationsContext _localctx = new EquationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			match(COLON);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DER || _la==ID) {
				{
				{
				setState(92);
				equation();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(smlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(smlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(smlParser.SEMICOLON, 0); }
		public DerivativeContext derivative() {
			return getRuleContext(DerivativeContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equation);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ID);
				setState(99);
				match(ASSIGN);
				setState(100);
				expression();
				setState(101);
				match(SEMICOLON);
				}
				break;
			case DER:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				derivative();
				setState(104);
				match(ASSIGN);
				setState(105);
				expression();
				setState(106);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivativeContext extends ParserRuleContext {
		public TerminalNode DER() { return getToken(smlParser.DER, 0); }
		public TerminalNode LPAREN() { return getToken(smlParser.LPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(smlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(smlParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(smlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(smlParser.COMMA, i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(smlParser.RPAREN, 0); }
		public DerivativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterDerivative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitDerivative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitDerivative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivativeContext derivative() throws RecognitionException {
		DerivativeContext _localctx = new DerivativeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_derivative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DER);
			setState(111);
			match(LPAREN);
			setState(112);
			match(ID);
			setState(113);
			match(COMMA);
			setState(114);
			match(ID);
			setState(115);
			match(COMMA);
			setState(116);
			number();
			setState(117);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(smlParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(smlParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(smlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(smlParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			multiplyingExpression();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(121);
					multiplyingExpression();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<PowExpressionContext> powExpression() {
			return getRuleContexts(PowExpressionContext.class);
		}
		public PowExpressionContext powExpression(int i) {
			return getRuleContext(PowExpressionContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(smlParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(smlParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(smlParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(smlParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			powExpression();
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIV) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(129);
					powExpression();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(smlParser.POW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_powExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			atom();
			setState(138);
			_la = _input.LA(1);
			if (_la==POW) {
				{
				setState(136);
				match(POW);
				setState(137);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(smlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(smlParser.RPAREN, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode ID() { return getToken(smlParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				scientific();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(LPAREN);
				setState(143);
				expression();
				setState(144);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(smlParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(smlParser.RPAREN, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			funcname();
			setState(151);
			match(LPAREN);
			setState(152);
			expression();
			setState(153);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(smlParser.COS, 0); }
		public TerminalNode TAN() { return getToken(smlParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(smlParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(smlParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(smlParser.ATAN, 0); }
		public TerminalNode ASIN() { return getToken(smlParser.ASIN, 0); }
		public TerminalNode LOG() { return getToken(smlParser.LOG, 0); }
		public TerminalNode LN() { return getToken(smlParser.LN, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << LN) | (1L << LOG))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(smlParser.EQ, 0); }
		public TerminalNode GT() { return getToken(smlParser.GT, 0); }
		public TerminalNode LT() { return getToken(smlParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(smlParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(smlParser.MINUS, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(159);
				match(MINUS);
				}
			}

			setState(162);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScientificContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode E() { return getToken(smlParser.E, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scientific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			number();
			setState(167);
			_la = _input.LA(1);
			if (_la==E) {
				{
				setState(165);
				match(E);
				setState(166);
				number();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(smlParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smlListener ) ((smlListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof smlVisitor ) return ((smlVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\5\2\61\n\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\b\5\bQ\n\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13`\n\13\f\13"+
		"\16\13c\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16}\n\16\f\16\16\16\u0080"+
		"\13\16\3\17\3\17\3\17\7\17\u0085\n\17\f\17\16\17\u0088\13\17\3\20\3\20"+
		"\3\20\5\20\u008d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0097"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\5\25\u00a3\n\25"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u00aa\n\26\3\27\3\27\3\27\2\2\30\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2\6\7\3\2\26\27\3\2\30"+
		"\31\3\2\f\23\3\2\32\34\u00a7\2.\3\2\2\2\4\65\3\2\2\2\69\3\2\2\2\b;\3\2"+
		"\2\2\nC\3\2\2\2\fF\3\2\2\2\16P\3\2\2\2\20U\3\2\2\2\22W\3\2\2\2\24\\\3"+
		"\2\2\2\26n\3\2\2\2\30p\3\2\2\2\32y\3\2\2\2\34\u0081\3\2\2\2\36\u0089\3"+
		"\2\2\2 \u0096\3\2\2\2\"\u0098\3\2\2\2$\u009d\3\2\2\2&\u009f\3\2\2\2(\u00a2"+
		"\3\2\2\2*\u00a6\3\2\2\2,\u00ab\3\2\2\2.\60\5\4\3\2/\61\5\b\5\2\60/\3\2"+
		"\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\5\f\7\2\63\64\5\24\13\2\64\3\3"+
		"\2\2\2\65\66\7\3\2\2\66\67\5\6\4\2\678\7!\2\28\5\3\2\2\29:\7$\2\2:\7\3"+
		"\2\2\2;<\7\4\2\2<@\7\"\2\2=?\5\n\6\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2A\t\3\2\2\2B@\3\2\2\2CD\5\6\4\2DE\7!\2\2E\13\3\2\2\2FG\7\5\2\2G"+
		"L\7\"\2\2HK\5\16\b\2IK\5\22\n\2JH\3\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2M\r\3\2\2\2NL\3\2\2\2OQ\5\20\t\2PO\3\2\2\2PQ\3\2\2\2QR\3\2"+
		"\2\2RS\7$\2\2ST\7!\2\2T\17\3\2\2\2UV\t\2\2\2V\21\3\2\2\2WX\7\b\2\2XY\5"+
		"\6\4\2YZ\7$\2\2Z[\7!\2\2[\23\3\2\2\2\\]\7\t\2\2]a\7\"\2\2^`\5\26\f\2_"+
		"^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\25\3\2\2\2ca\3\2\2\2de\7$\2\2"+
		"ef\7\13\2\2fg\5\32\16\2gh\7!\2\2ho\3\2\2\2ij\5\30\r\2jk\7\13\2\2kl\5\32"+
		"\16\2lm\7!\2\2mo\3\2\2\2nd\3\2\2\2ni\3\2\2\2o\27\3\2\2\2pq\7\n\2\2qr\7"+
		"\24\2\2rs\7$\2\2st\7\35\2\2tu\7$\2\2uv\7\35\2\2vw\5,\27\2wx\7\25\2\2x"+
		"\31\3\2\2\2y~\5\34\17\2z{\t\3\2\2{}\5\34\17\2|z\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\33\3\2\2\2\u0080~\3\2\2\2\u0081\u0086\5\36"+
		"\20\2\u0082\u0083\t\4\2\2\u0083\u0085\5\36\20\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\35\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008c\5 \21\2\u008a\u008b\7 \2\2\u008b\u008d"+
		"\5\32\16\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\37\3\2\2\2\u008e"+
		"\u0097\5*\26\2\u008f\u0097\5(\25\2\u0090\u0091\7\24\2\2\u0091\u0092\5"+
		"\32\16\2\u0092\u0093\7\25\2\2\u0093\u0097\3\2\2\2\u0094\u0097\5\"\22\2"+
		"\u0095\u0097\7$\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0090"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097!\3\2\2\2\u0098"+
		"\u0099\5$\23\2\u0099\u009a\7\24\2\2\u009a\u009b\5\32\16\2\u009b\u009c"+
		"\7\25\2\2\u009c#\3\2\2\2\u009d\u009e\t\5\2\2\u009e%\3\2\2\2\u009f\u00a0"+
		"\t\6\2\2\u00a0\'\3\2\2\2\u00a1\u00a3\7\27\2\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5)\3\2\2\2\u00a6"+
		"\u00a9\5,\27\2\u00a7\u00a8\7\37\2\2\u00a8\u00aa\5,\27\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa+\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac-\3"+
		"\2\2\2\17\60@JLPan~\u0086\u008c\u0096\u00a2\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}