// Generated from C:/Users/Peter/OneDrive/MSc_fv2/Fordítóprogramok/Gyakorlat/kötprog/scripting-language/src/ScriptingLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ScriptingLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MUL=3, DIV=4, INCREMENT=5, DECREMENT=6, SEMICOLON=7, COLON=8, 
		ASSIGNMENT=9, EQ=10, NE=11, OR=12, AND=13, LT=14, GT=15, LPAR=16, RPAR=17, 
		LCURLY=18, RCURLY=19, INT_KW=20, DOUBLE_KW=21, DEL_KW=22, ABS_KW=23, TIME_KW=24, 
		PRINT_KW=25, SCAN_KW=26, FOR_KW=27, WHILE_KW=28, IF_KW=29, ELSE_KW=30, 
		SWITCH_KW=31, CASE_KW=32, BREAK_KW=33, DEFAULT_KW=34, INT=35, DOUBLE=36, 
		ID=37, WS=38, COMMENT=39;
	public static final int
		RULE_start = 0, RULE_sequence = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_number_expression = 4, RULE_add_op = 5, RULE_number_factor = 6, RULE_logical_expression = 7, 
		RULE_or_op = 8, RULE_logical_factor = 9, RULE_type = 10, RULE_declaration = 11, 
		RULE_assignment = 12, RULE_declaration_and_assignment = 13, RULE_update = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sequence", "statement", "expression", "number_expression", 
			"add_op", "number_factor", "logical_expression", "or_op", "logical_factor", 
			"type", "declaration", "assignment", "declaration_and_assignment", "update"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'++'", "'--'", "';'", "':'", "'='", 
			"'=='", "'!='", "'||'", "'&&'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", 
			"'int'", "'double'", "'del'", "'abs'", "'TIME'", "'print'", "'scan'", 
			"'for'", "'while'", "'if'", "'else'", "'switch'", "'case'", "'break'", 
			"'default'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUB", "MUL", "DIV", "INCREMENT", "DECREMENT", "SEMICOLON", 
			"COLON", "ASSIGNMENT", "EQ", "NE", "OR", "AND", "LT", "GT", "LPAR", "RPAR", 
			"LCURLY", "RCURLY", "INT_KW", "DOUBLE_KW", "DEL_KW", "ABS_KW", "TIME_KW", 
			"PRINT_KW", "SCAN_KW", "FOR_KW", "WHILE_KW", "IF_KW", "ELSE_KW", "SWITCH_KW", 
			"CASE_KW", "BREAK_KW", "DEFAULT_KW", "INT", "DOUBLE", "ID", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ScriptingLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static void main(String[] args) throws Exception {
	        ScriptingLanguageLexer lex = new ScriptingLanguageLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream (lex);
	        ScriptingLanguageParser parser = new ScriptingLanguageParser(tokens);
	        parser.start();
	    }

	public ScriptingLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ScriptingLanguageParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			sequence();
			setState(31);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 243738411008L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ScriptingLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ScriptingLanguageParser.SEMICOLON, i);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Declaration_and_assignmentContext declaration_and_assignment() {
			return getRuleContext(Declaration_and_assignmentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ScriptingLanguageParser.ASSIGNMENT, 0); }
		public TerminalNode FOR_KW() { return getToken(ScriptingLanguageParser.FOR_KW, 0); }
		public TerminalNode LPAR() { return getToken(ScriptingLanguageParser.LPAR, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ScriptingLanguageParser.RPAR, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(ScriptingLanguageParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(ScriptingLanguageParser.LCURLY, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(ScriptingLanguageParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(ScriptingLanguageParser.RCURLY, i);
		}
		public TerminalNode WHILE_KW() { return getToken(ScriptingLanguageParser.WHILE_KW, 0); }
		public TerminalNode IF_KW() { return getToken(ScriptingLanguageParser.IF_KW, 0); }
		public TerminalNode ELSE_KW() { return getToken(ScriptingLanguageParser.ELSE_KW, 0); }
		public TerminalNode SWITCH_KW() { return getToken(ScriptingLanguageParser.SWITCH_KW, 0); }
		public List<TerminalNode> CASE_KW() { return getTokens(ScriptingLanguageParser.CASE_KW); }
		public TerminalNode CASE_KW(int i) {
			return getToken(ScriptingLanguageParser.CASE_KW, i);
		}
		public List<TerminalNode> INT() { return getTokens(ScriptingLanguageParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ScriptingLanguageParser.INT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ScriptingLanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ScriptingLanguageParser.COLON, i);
		}
		public TerminalNode DEFAULT_KW() { return getToken(ScriptingLanguageParser.DEFAULT_KW, 0); }
		public List<TerminalNode> BREAK_KW() { return getTokens(ScriptingLanguageParser.BREAK_KW); }
		public TerminalNode BREAK_KW(int i) {
			return getToken(ScriptingLanguageParser.BREAK_KW, i);
		}
		public TerminalNode SCAN_KW() { return getToken(ScriptingLanguageParser.SCAN_KW, 0); }
		public TerminalNode PRINT_KW() { return getToken(ScriptingLanguageParser.PRINT_KW, 0); }
		public TerminalNode DEL_KW() { return getToken(ScriptingLanguageParser.DEL_KW, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				declaration();
				setState(40);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				assignment();
				setState(43);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				declaration_and_assignment();
				setState(46);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				type();
				setState(49);
				match(ID);
				setState(50);
				match(ASSIGNMENT);
				setState(51);
				expression();
				setState(52);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(FOR_KW);
				setState(55);
				match(LPAR);
				setState(56);
				match(ID);
				setState(57);
				match(ASSIGNMENT);
				setState(58);
				expression();
				setState(59);
				match(SEMICOLON);
				setState(60);
				logical_expression();
				setState(61);
				match(SEMICOLON);
				setState(62);
				update();
				setState(63);
				match(RPAR);
				setState(64);
				match(LCURLY);
				setState(65);
				sequence();
				setState(66);
				match(RCURLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				match(WHILE_KW);
				setState(69);
				match(LPAR);
				setState(70);
				logical_expression();
				setState(71);
				match(RPAR);
				setState(72);
				match(LCURLY);
				setState(73);
				sequence();
				setState(74);
				match(RCURLY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				match(IF_KW);
				setState(77);
				logical_expression();
				setState(78);
				match(LCURLY);
				setState(79);
				sequence();
				setState(80);
				match(RCURLY);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_KW) {
					{
					setState(81);
					match(ELSE_KW);
					setState(82);
					match(LCURLY);
					setState(83);
					sequence();
					setState(84);
					match(RCURLY);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(88);
				match(SWITCH_KW);
				setState(89);
				match(LPAR);
				setState(90);
				match(ID);
				setState(91);
				match(RPAR);
				setState(92);
				match(LCURLY);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					match(CASE_KW);
					setState(94);
					match(INT);
					setState(95);
					match(COLON);
					setState(96);
					sequence();
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BREAK_KW) {
						{
						setState(97);
						match(BREAK_KW);
						setState(98);
						match(SEMICOLON);
						}
					}

					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE_KW );
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT_KW) {
					{
					setState(105);
					match(DEFAULT_KW);
					setState(106);
					match(COLON);
					setState(107);
					sequence();
					}
				}

				setState(110);
				match(RCURLY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
				match(SCAN_KW);
				setState(113);
				match(LPAR);
				setState(114);
				expression();
				setState(115);
				match(RPAR);
				setState(116);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(118);
				match(PRINT_KW);
				setState(119);
				match(LPAR);
				setState(120);
				expression();
				setState(121);
				match(RPAR);
				setState(122);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(124);
				match(DEL_KW);
				setState(125);
				match(ID);
				setState(126);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				number_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				logical_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Number_expressionContext extends ParserRuleContext {
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ScriptingLanguageParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ScriptingLanguageParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ScriptingLanguageParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ScriptingLanguageParser.SUB, i);
		}
		public Number_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterNumber_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitNumber_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitNumber_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_expressionContext number_expression() throws RecognitionException {
		Number_expressionContext _localctx = new Number_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number_expression);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				add_op();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(134);
					match(ADD);
					setState(135);
					add_op();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				add_op();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUB) {
					{
					{
					setState(142);
					match(SUB);
					setState(143);
					add_op();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Add_opContext extends ParserRuleContext {
		public List<Number_factorContext> number_factor() {
			return getRuleContexts(Number_factorContext.class);
		}
		public Number_factorContext number_factor(int i) {
			return getRuleContext(Number_factorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ScriptingLanguageParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ScriptingLanguageParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ScriptingLanguageParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ScriptingLanguageParser.DIV, i);
		}
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add_op);
		int _la;
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				number_factor();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL) {
					{
					{
					setState(152);
					match(MUL);
					setState(153);
					number_factor();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				number_factor();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(160);
					match(DIV);
					setState(161);
					number_factor();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Number_factorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode INT() { return getToken(ScriptingLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(ScriptingLanguageParser.DOUBLE, 0); }
		public TerminalNode TIME_KW() { return getToken(ScriptingLanguageParser.TIME_KW, 0); }
		public TerminalNode LPAR() { return getToken(ScriptingLanguageParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ScriptingLanguageParser.RPAR, 0); }
		public TerminalNode ABS_KW() { return getToken(ScriptingLanguageParser.ABS_KW, 0); }
		public Number_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterNumber_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitNumber_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitNumber_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_factorContext number_factor() throws RecognitionException {
		Number_factorContext _localctx = new Number_factorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number_factor);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(DOUBLE);
				}
				break;
			case TIME_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(TIME_KW);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(LPAR);
				setState(174);
				expression();
				setState(175);
				match(RPAR);
				}
				break;
			case ABS_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(ABS_KW);
				setState(178);
				match(LPAR);
				setState(179);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_expressionContext extends ParserRuleContext {
		public List<Or_opContext> or_op() {
			return getRuleContexts(Or_opContext.class);
		}
		public Or_opContext or_op(int i) {
			return getRuleContext(Or_opContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ScriptingLanguageParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ScriptingLanguageParser.OR, i);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterLogical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitLogical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitLogical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			or_op();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(183);
				match(OR);
				setState(184);
				or_op();
				}
				}
				setState(189);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Or_opContext extends ParserRuleContext {
		public List<Logical_factorContext> logical_factor() {
			return getRuleContexts(Logical_factorContext.class);
		}
		public Logical_factorContext logical_factor(int i) {
			return getRuleContext(Logical_factorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ScriptingLanguageParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ScriptingLanguageParser.AND, i);
		}
		public Or_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterOr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitOr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitOr_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_opContext or_op() throws RecognitionException {
		Or_opContext _localctx = new Or_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_or_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			logical_factor();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(191);
				match(AND);
				setState(192);
				logical_factor();
				}
				}
				setState(197);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_factorContext extends ParserRuleContext {
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(ScriptingLanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(ScriptingLanguageParser.GT, 0); }
		public TerminalNode EQ() { return getToken(ScriptingLanguageParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ScriptingLanguageParser.NE, 0); }
		public Logical_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterLogical_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitLogical_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitLogical_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_factorContext logical_factor() throws RecognitionException {
		Logical_factorContext _localctx = new Logical_factorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logical_factor);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				number_expression();
				setState(199);
				match(LT);
				setState(200);
				number_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				number_expression();
				setState(203);
				match(GT);
				setState(204);
				number_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				number_expression();
				setState(207);
				match(EQ);
				setState(208);
				number_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				number_expression();
				setState(211);
				match(NE);
				setState(212);
				number_expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_KW() { return getToken(ScriptingLanguageParser.INT_KW, 0); }
		public TerminalNode DOUBLE_KW() { return getToken(ScriptingLanguageParser.DOUBLE_KW, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==INT_KW || _la==DOUBLE_KW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			type();
			setState(219);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ScriptingLanguageParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
			setState(222);
			match(ASSIGNMENT);
			setState(223);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_and_assignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ScriptingLanguageParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declaration_and_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_and_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterDeclaration_and_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitDeclaration_and_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitDeclaration_and_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_and_assignmentContext declaration_and_assignment() throws RecognitionException {
		Declaration_and_assignmentContext _localctx = new Declaration_and_assignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaration_and_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			type();
			setState(226);
			match(ID);
			setState(227);
			match(ASSIGNMENT);
			setState(228);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(ScriptingLanguageParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ScriptingLanguageParser.DECREMENT, 0); }
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptingLanguageListener ) ((ScriptingLanguageListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptingLanguageVisitor ) return ((ScriptingLanguageVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_update);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(ID);
				setState(232);
				match(INCREMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(ID);
				setState(234);
				match(DECREMENT);
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u00ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001#\b\u0001\u000b\u0001\f\u0001$\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002W\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002d\b\u0002\u0004\u0002f\b\u0002\u000b\u0002\f\u0002g"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002m\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0080\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0089\b\u0004\n\u0004\f\u0004\u008c\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0091\b\u0004\n\u0004\f\u0004"+
		"\u0094\t\u0004\u0003\u0004\u0096\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u009b\b\u0005\n\u0005\f\u0005\u009e\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00a3\b\u0005\n\u0005\f\u0005\u00a6"+
		"\t\u0005\u0003\u0005\u00a8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00b5\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00ba\b\u0007\n\u0007\f\u0007\u00bd\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00c2\b\b\n\b\f\b\u00c5\t\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d7\b\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ec\b\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0001\u0001\u0000\u0014\u0015\u0101\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004\u007f\u0001"+
		"\u0000\u0000\u0000\u0006\u0083\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000"+
		"\u0000\u0000\n\u00a7\u0001\u0000\u0000\u0000\f\u00b4\u0001\u0000\u0000"+
		"\u0000\u000e\u00b6\u0001\u0000\u0000\u0000\u0010\u00be\u0001\u0000\u0000"+
		"\u0000\u0012\u00d6\u0001\u0000\u0000\u0000\u0014\u00d8\u0001\u0000\u0000"+
		"\u0000\u0016\u00da\u0001\u0000\u0000\u0000\u0018\u00dd\u0001\u0000\u0000"+
		"\u0000\u001a\u00e1\u0001\u0000\u0000\u0000\u001c\u00eb\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005\u0000\u0000\u0001"+
		" \u0001\u0001\u0000\u0000\u0000!#\u0003\u0004\u0002\u0000\"!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\u0080\u0003\u0006\u0003"+
		"\u0000\'(\u0003\u0016\u000b\u0000()\u0005\u0007\u0000\u0000)\u0080\u0001"+
		"\u0000\u0000\u0000*+\u0003\u0018\f\u0000+,\u0005\u0007\u0000\u0000,\u0080"+
		"\u0001\u0000\u0000\u0000-.\u0003\u001a\r\u0000./\u0005\u0007\u0000\u0000"+
		"/\u0080\u0001\u0000\u0000\u000001\u0003\u0014\n\u000012\u0005%\u0000\u0000"+
		"23\u0005\t\u0000\u000034\u0003\u0006\u0003\u000045\u0005\u0007\u0000\u0000"+
		"5\u0080\u0001\u0000\u0000\u000067\u0005\u001b\u0000\u000078\u0005\u0010"+
		"\u0000\u000089\u0005%\u0000\u00009:\u0005\t\u0000\u0000:;\u0003\u0006"+
		"\u0003\u0000;<\u0005\u0007\u0000\u0000<=\u0003\u000e\u0007\u0000=>\u0005"+
		"\u0007\u0000\u0000>?\u0003\u001c\u000e\u0000?@\u0005\u0011\u0000\u0000"+
		"@A\u0005\u0012\u0000\u0000AB\u0003\u0002\u0001\u0000BC\u0005\u0013\u0000"+
		"\u0000C\u0080\u0001\u0000\u0000\u0000DE\u0005\u001c\u0000\u0000EF\u0005"+
		"\u0010\u0000\u0000FG\u0003\u000e\u0007\u0000GH\u0005\u0011\u0000\u0000"+
		"HI\u0005\u0012\u0000\u0000IJ\u0003\u0002\u0001\u0000JK\u0005\u0013\u0000"+
		"\u0000K\u0080\u0001\u0000\u0000\u0000LM\u0005\u001d\u0000\u0000MN\u0003"+
		"\u000e\u0007\u0000NO\u0005\u0012\u0000\u0000OP\u0003\u0002\u0001\u0000"+
		"PV\u0005\u0013\u0000\u0000QR\u0005\u001e\u0000\u0000RS\u0005\u0012\u0000"+
		"\u0000ST\u0003\u0002\u0001\u0000TU\u0005\u0013\u0000\u0000UW\u0001\u0000"+
		"\u0000\u0000VQ\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0080"+
		"\u0001\u0000\u0000\u0000XY\u0005\u001f\u0000\u0000YZ\u0005\u0010\u0000"+
		"\u0000Z[\u0005%\u0000\u0000[\\\u0005\u0011\u0000\u0000\\e\u0005\u0012"+
		"\u0000\u0000]^\u0005 \u0000\u0000^_\u0005#\u0000\u0000_`\u0005\b\u0000"+
		"\u0000`c\u0003\u0002\u0001\u0000ab\u0005!\u0000\u0000bd\u0005\u0007\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000"+
		"\u0000\u0000e]\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hl\u0001\u0000\u0000\u0000"+
		"ij\u0005\"\u0000\u0000jk\u0005\b\u0000\u0000km\u0003\u0002\u0001\u0000"+
		"li\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0005\u0013\u0000\u0000o\u0080\u0001\u0000\u0000\u0000pq\u0005"+
		"\u001a\u0000\u0000qr\u0005\u0010\u0000\u0000rs\u0003\u0006\u0003\u0000"+
		"st\u0005\u0011\u0000\u0000tu\u0005\u0007\u0000\u0000u\u0080\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0019\u0000\u0000wx\u0005\u0010\u0000\u0000xy\u0003"+
		"\u0006\u0003\u0000yz\u0005\u0011\u0000\u0000z{\u0005\u0007\u0000\u0000"+
		"{\u0080\u0001\u0000\u0000\u0000|}\u0005\u0016\u0000\u0000}~\u0005%\u0000"+
		"\u0000~\u0080\u0005\u0007\u0000\u0000\u007f&\u0001\u0000\u0000\u0000\u007f"+
		"\'\u0001\u0000\u0000\u0000\u007f*\u0001\u0000\u0000\u0000\u007f-\u0001"+
		"\u0000\u0000\u0000\u007f0\u0001\u0000\u0000\u0000\u007f6\u0001\u0000\u0000"+
		"\u0000\u007fD\u0001\u0000\u0000\u0000\u007fL\u0001\u0000\u0000\u0000\u007f"+
		"X\u0001\u0000\u0000\u0000\u007fp\u0001\u0000\u0000\u0000\u007fv\u0001"+
		"\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u0080\u0005\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0003\b\u0004\u0000\u0082\u0084\u0003\u000e\u0007"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0007\u0001\u0000\u0000\u0000\u0085\u008a\u0003\n\u0005\u0000"+
		"\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0089\u0003\n\u0005\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0096\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u0092\u0003\n\u0005\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0091"+
		"\u0003\n\u0005\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0085\u0001\u0000\u0000\u0000\u0095\u008d\u0001"+
		"\u0000\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u009c\u0003\f"+
		"\u0006\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009b\u0003\f\u0006"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u00a8\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a4\u0003\f\u0006\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000"+
		"\u00a1\u00a3\u0003\f\u0006\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a7\u0097\u0001\u0000\u0000\u0000\u00a7"+
		"\u009f\u0001\u0000\u0000\u0000\u00a8\u000b\u0001\u0000\u0000\u0000\u00a9"+
		"\u00b5\u0005%\u0000\u0000\u00aa\u00b5\u0005#\u0000\u0000\u00ab\u00b5\u0005"+
		"$\u0000\u0000\u00ac\u00b5\u0005\u0018\u0000\u0000\u00ad\u00ae\u0005\u0010"+
		"\u0000\u0000\u00ae\u00af\u0003\u0006\u0003\u0000\u00af\u00b0\u0005\u0011"+
		"\u0000\u0000\u00b0\u00b5\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0017"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0010\u0000\u0000\u00b3\u00b5\u0005\u0011"+
		"\u0000\u0000\u00b4\u00a9\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b4\u00ab\u0001\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b5\r\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003\u0010\b"+
		"\u0000\u00b7\u00b8\u0005\f\u0000\u0000\u00b8\u00ba\u0003\u0010\b\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u000f\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00c3\u0003\u0012\t\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0"+
		"\u00c2\u0003\u0012\t\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u0011\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\b\u0004\u0000\u00c7\u00c8\u0005"+
		"\u000e\u0000\u0000\u00c8\u00c9\u0003\b\u0004\u0000\u00c9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0003\b\u0004\u0000\u00cb\u00cc\u0005\u000f\u0000"+
		"\u0000\u00cc\u00cd\u0003\b\u0004\u0000\u00cd\u00d7\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0003\b\u0004\u0000\u00cf\u00d0\u0005\n\u0000\u0000\u00d0"+
		"\u00d1\u0003\b\u0004\u0000\u00d1\u00d7\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0003\b\u0004\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000\u00d4\u00d5\u0003"+
		"\b\u0004\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00c6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00ca\u0001\u0000\u0000\u0000\u00d6\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7\u0013\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0007\u0000\u0000\u0000\u00d9\u0015\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0003\u0014\n\u0000\u00db\u00dc\u0005%\u0000"+
		"\u0000\u00dc\u0017\u0001\u0000\u0000\u0000\u00dd\u00de\u0005%\u0000\u0000"+
		"\u00de\u00df\u0005\t\u0000\u0000\u00df\u00e0\u0003\u0006\u0003\u0000\u00e0"+
		"\u0019\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u0014\n\u0000\u00e2\u00e3"+
		"\u0005%\u0000\u0000\u00e3\u00e4\u0005\t\u0000\u0000\u00e4\u00e5\u0003"+
		"\u0006\u0003\u0000\u00e5\u001b\u0001\u0000\u0000\u0000\u00e6\u00ec\u0003"+
		"\u0018\f\u0000\u00e7\u00e8\u0005%\u0000\u0000\u00e8\u00ec\u0005\u0005"+
		"\u0000\u0000\u00e9\u00ea\u0005%\u0000\u0000\u00ea\u00ec\u0005\u0006\u0000"+
		"\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u001d\u0001\u0000\u0000"+
		"\u0000\u0012$Vcgl\u007f\u0083\u008a\u0092\u0095\u009c\u00a4\u00a7\u00b4"+
		"\u00bb\u00c3\u00d6\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}