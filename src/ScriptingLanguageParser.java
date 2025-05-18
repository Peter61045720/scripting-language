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


	    public static void main(String[] args) {
	        System.out.println("Grammar works");
	    }

	public ScriptingLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ast.RuntimeContext context;
		public SequenceContext sequence;
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ScriptingLanguageParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final StartContext start(ast.RuntimeContext context) throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState(), context);
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((StartContext)_localctx).sequence = sequence(context);
			 _localctx.context.addStatements(((StartContext)_localctx).sequence.node); 
			setState(32);
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
		public ast.RuntimeContext context;
		public ast.Sequence node;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SequenceContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final SequenceContext sequence(ast.RuntimeContext context) throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState(), context);
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((SequenceContext)_localctx).node =  new ast.Sequence(context); 
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				((SequenceContext)_localctx).statement = statement(context);
				 _localctx.node.addStatement(((SequenceContext)_localctx).statement.node); 
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 243738411012L) != 0) );
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
		public ast.RuntimeContext context;
		public ast.Statement node;
		public ExpressionContext expression;
		public DeclarationContext declaration;
		public AssignmentContext assignment;
		public Declaration_and_assignmentContext declaration_and_assignment;
		public Logical_expressionContext condition;
		public SequenceContext true_body;
		public SequenceContext false_body;
		public Token ID;
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
		public TerminalNode FOR_KW() { return getToken(ScriptingLanguageParser.FOR_KW, 0); }
		public TerminalNode LPAR() { return getToken(ScriptingLanguageParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ScriptingLanguageParser.ASSIGNMENT, 0); }
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
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final StatementContext statement(ast.RuntimeContext context) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), context);
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((StatementContext)_localctx).expression = expression();
				 ((StatementContext)_localctx).node =  new ast.ExpressionStatement(_localctx.context, ((StatementContext)_localctx).expression.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				((StatementContext)_localctx).declaration = declaration(context);
				setState(46);
				match(SEMICOLON);
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).declaration.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((StatementContext)_localctx).assignment = assignment(context);
				setState(50);
				match(SEMICOLON);
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).assignment.node; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				((StatementContext)_localctx).declaration_and_assignment = declaration_and_assignment(context);
				setState(54);
				match(SEMICOLON);
				 ((StatementContext)_localctx).node =  ((StatementContext)_localctx).declaration_and_assignment.node; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(FOR_KW);
				setState(58);
				match(LPAR);
				setState(59);
				match(ID);
				setState(60);
				match(ASSIGNMENT);
				setState(61);
				expression();
				setState(62);
				match(SEMICOLON);
				setState(63);
				logical_expression();
				setState(64);
				match(SEMICOLON);
				setState(65);
				update(context);
				setState(66);
				match(RPAR);
				setState(67);
				match(LCURLY);
				setState(68);
				sequence(context);
				setState(69);
				match(RCURLY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(WHILE_KW);
				setState(72);
				match(LPAR);
				setState(73);
				logical_expression();
				setState(74);
				match(RPAR);
				setState(75);
				match(LCURLY);
				setState(76);
				sequence(context);
				setState(77);
				match(RCURLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 ast.Statement false_body_node = null; 
				setState(80);
				match(IF_KW);
				setState(81);
				((StatementContext)_localctx).condition = logical_expression();
				setState(82);
				match(LCURLY);
				setState(83);
				((StatementContext)_localctx).true_body = sequence(context);
				setState(84);
				match(RCURLY);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_KW) {
					{
					setState(85);
					match(ELSE_KW);
					setState(86);
					match(LCURLY);
					setState(87);
					((StatementContext)_localctx).false_body = sequence(context);
					setState(88);
					match(RCURLY);
					 false_body_node = ((StatementContext)_localctx).false_body.node; 
					}
				}

				 ((StatementContext)_localctx).node =  new ast.If(_localctx.context, ((StatementContext)_localctx).condition.node, ((StatementContext)_localctx).true_body.node, false_body_node); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				match(SWITCH_KW);
				setState(96);
				match(LPAR);
				setState(97);
				match(ID);
				setState(98);
				match(RPAR);
				setState(99);
				match(LCURLY);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					match(CASE_KW);
					setState(101);
					match(INT);
					setState(102);
					match(COLON);
					setState(103);
					sequence(context);
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BREAK_KW) {
						{
						setState(104);
						match(BREAK_KW);
						setState(105);
						match(SEMICOLON);
						}
					}

					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CASE_KW );
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT_KW) {
					{
					setState(112);
					match(DEFAULT_KW);
					setState(113);
					match(COLON);
					setState(114);
					sequence(context);
					}
				}

				setState(117);
				match(RCURLY);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				match(SCAN_KW);
				setState(120);
				match(LPAR);
				setState(121);
				((StatementContext)_localctx).ID = match(ID);
				setState(122);
				match(RPAR);
				setState(123);
				match(SEMICOLON);
				 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.context, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				match(PRINT_KW);
				setState(126);
				match(LPAR);
				setState(127);
				((StatementContext)_localctx).expression = expression();
				setState(128);
				match(RPAR);
				setState(129);
				match(SEMICOLON);
				 ((StatementContext)_localctx).node =  new ast.Print(_localctx.context, ((StatementContext)_localctx).expression.node); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				match(DEL_KW);
				setState(133);
				((StatementContext)_localctx).ID = match(ID);
				setState(134);
				match(SEMICOLON);
				 ((StatementContext)_localctx).node =  new ast.Delete(_localctx.context, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
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
		public ast.Expression node;
		public Number_expressionContext number_expression;
		public Logical_expressionContext logical_expression;
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((ExpressionContext)_localctx).number_expression = number_expression();
				 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).number_expression.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((ExpressionContext)_localctx).logical_expression = logical_expression();
				 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).logical_expression.node; 
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
		public ast.Expression node;
		public Add_opContext first_op;
		public Token ADD;
		public Add_opContext next_op;
		public Token SUB;
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
			int _alt;
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((Number_expressionContext)_localctx).first_op = add_op();
				 ((Number_expressionContext)_localctx).node =  ((Number_expressionContext)_localctx).first_op.node; 
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ADD) {
					{
					{
					setState(148);
					((Number_expressionContext)_localctx).ADD = match(ADD);
					setState(149);
					((Number_expressionContext)_localctx).next_op = add_op();
					 ((Number_expressionContext)_localctx).node =  new ast.BinaryOperation((((Number_expressionContext)_localctx).ADD!=null?((Number_expressionContext)_localctx).ADD.getText():null), _localctx.node, ((Number_expressionContext)_localctx).next_op.node); 
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((Number_expressionContext)_localctx).first_op = add_op();
				 ((Number_expressionContext)_localctx).node =  ((Number_expressionContext)_localctx).first_op.node; 
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159);
						((Number_expressionContext)_localctx).SUB = match(SUB);
						setState(160);
						((Number_expressionContext)_localctx).next_op = add_op();
						 ((Number_expressionContext)_localctx).node =  new ast.BinaryOperation((((Number_expressionContext)_localctx).SUB!=null?((Number_expressionContext)_localctx).SUB.getText():null), _localctx.node, ((Number_expressionContext)_localctx).next_op.node); 
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public ast.Expression node;
		public Number_factorContext first_op;
		public Token MUL;
		public Number_factorContext next_op;
		public Token DIV;
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((Add_opContext)_localctx).first_op = number_factor();
				 ((Add_opContext)_localctx).node =  ((Add_opContext)_localctx).first_op.node; 
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL) {
					{
					{
					setState(172);
					((Add_opContext)_localctx).MUL = match(MUL);
					setState(173);
					((Add_opContext)_localctx).next_op = number_factor();
					 ((Add_opContext)_localctx).node =  new ast.BinaryOperation((((Add_opContext)_localctx).MUL!=null?((Add_opContext)_localctx).MUL.getText():null), _localctx.node, ((Add_opContext)_localctx).next_op.node); 
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((Add_opContext)_localctx).first_op = number_factor();
				 ((Add_opContext)_localctx).node =  ((Add_opContext)_localctx).first_op.node; 
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(183);
					((Add_opContext)_localctx).DIV = match(DIV);
					setState(184);
					((Add_opContext)_localctx).next_op = number_factor();
					 ((Add_opContext)_localctx).node =  new ast.BinaryOperation((((Add_opContext)_localctx).DIV!=null?((Add_opContext)_localctx).DIV.getText():null), _localctx.node, ((Add_opContext)_localctx).next_op.node); 
					}
					}
					setState(191);
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
		public ast.Expression node;
		public Token ID;
		public Token INT;
		public Token DOUBLE;
		public ExpressionContext expression;
		public Token ABS_KW;
		public Number_factorContext number_factor;
		public Token SUB;
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
		public Number_factorContext number_factor() {
			return getRuleContext(Number_factorContext.class,0);
		}
		public TerminalNode SUB() { return getToken(ScriptingLanguageParser.SUB, 0); }
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((Number_factorContext)_localctx).ID = match(ID);
				 ((Number_factorContext)_localctx).node =  new ast.Variable((((Number_factorContext)_localctx).ID!=null?((Number_factorContext)_localctx).ID.getText():null)); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				((Number_factorContext)_localctx).INT = match(INT);
				 ((Number_factorContext)_localctx).node =  new ast.Constant("int", (((Number_factorContext)_localctx).INT!=null?((Number_factorContext)_localctx).INT.getText():null)); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				((Number_factorContext)_localctx).DOUBLE = match(DOUBLE);
				 ((Number_factorContext)_localctx).node =  new ast.Constant("double", (((Number_factorContext)_localctx).DOUBLE!=null?((Number_factorContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case TIME_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(TIME_KW);
				 ((Number_factorContext)_localctx).node =  new ast.Time(); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(LPAR);
				setState(203);
				((Number_factorContext)_localctx).expression = expression();
				setState(204);
				match(RPAR);
				 ((Number_factorContext)_localctx).node =  ((Number_factorContext)_localctx).expression.node; 
				}
				break;
			case ABS_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				((Number_factorContext)_localctx).ABS_KW = match(ABS_KW);
				setState(208);
				match(LPAR);
				setState(209);
				((Number_factorContext)_localctx).number_factor = number_factor();
				setState(210);
				match(RPAR);
				 ((Number_factorContext)_localctx).node =  new ast.UnaryOperation((((Number_factorContext)_localctx).ABS_KW!=null?((Number_factorContext)_localctx).ABS_KW.getText():null), ((Number_factorContext)_localctx).number_factor.node); 
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				((Number_factorContext)_localctx).SUB = match(SUB);
				setState(214);
				((Number_factorContext)_localctx).number_factor = number_factor();
				 ((Number_factorContext)_localctx).node =  new ast.UnaryOperation((((Number_factorContext)_localctx).SUB!=null?((Number_factorContext)_localctx).SUB.getText():null), ((Number_factorContext)_localctx).number_factor.node); 
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
		public ast.Expression node;
		public Or_opContext first_op;
		public Token OR;
		public Or_opContext next_op;
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
			setState(219);
			((Logical_expressionContext)_localctx).first_op = or_op();
			 ((Logical_expressionContext)_localctx).node =  ((Logical_expressionContext)_localctx).first_op.node; 
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(221);
				((Logical_expressionContext)_localctx).OR = match(OR);
				setState(222);
				((Logical_expressionContext)_localctx).next_op = or_op();
				 ((Logical_expressionContext)_localctx).node =  new ast.BinaryOperation((((Logical_expressionContext)_localctx).OR!=null?((Logical_expressionContext)_localctx).OR.getText():null), _localctx.node, ((Logical_expressionContext)_localctx).next_op.node); 
				}
				}
				setState(229);
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
		public ast.Expression node;
		public Logical_factorContext first_op;
		public Token AND;
		public Logical_factorContext next_op;
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
			setState(230);
			((Or_opContext)_localctx).first_op = logical_factor();
			 ((Or_opContext)_localctx).node =  ((Or_opContext)_localctx).first_op.node; 
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(232);
				((Or_opContext)_localctx).AND = match(AND);
				setState(233);
				((Or_opContext)_localctx).next_op = logical_factor();
				 ((Or_opContext)_localctx).node =  new ast.BinaryOperation((((Or_opContext)_localctx).AND!=null?((Or_opContext)_localctx).AND.getText():null), _localctx.node, ((Or_opContext)_localctx).next_op.node); 
				}
				}
				setState(240);
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
		public ast.Expression node;
		public Number_expressionContext number_expression;
		public Number_expressionContext lhs;
		public Token LT;
		public Number_expressionContext rhs;
		public Token GT;
		public Token EQ;
		public Token NE;
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((Logical_factorContext)_localctx).number_expression = number_expression();
				 ((Logical_factorContext)_localctx).node =  ((Logical_factorContext)_localctx).number_expression.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((Logical_factorContext)_localctx).lhs = number_expression();
				setState(245);
				((Logical_factorContext)_localctx).LT = match(LT);
				setState(246);
				((Logical_factorContext)_localctx).rhs = number_expression();
				 ((Logical_factorContext)_localctx).node =  new ast.BinaryOperation((((Logical_factorContext)_localctx).LT!=null?((Logical_factorContext)_localctx).LT.getText():null), ((Logical_factorContext)_localctx).lhs.node, ((Logical_factorContext)_localctx).rhs.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((Logical_factorContext)_localctx).lhs = number_expression();
				setState(250);
				((Logical_factorContext)_localctx).GT = match(GT);
				setState(251);
				((Logical_factorContext)_localctx).rhs = number_expression();
				 ((Logical_factorContext)_localctx).node =  new ast.BinaryOperation((((Logical_factorContext)_localctx).GT!=null?((Logical_factorContext)_localctx).GT.getText():null), ((Logical_factorContext)_localctx).lhs.node, ((Logical_factorContext)_localctx).rhs.node); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				((Logical_factorContext)_localctx).lhs = number_expression();
				setState(255);
				((Logical_factorContext)_localctx).EQ = match(EQ);
				setState(256);
				((Logical_factorContext)_localctx).rhs = number_expression();
				 ((Logical_factorContext)_localctx).node =  new ast.BinaryOperation((((Logical_factorContext)_localctx).EQ!=null?((Logical_factorContext)_localctx).EQ.getText():null), ((Logical_factorContext)_localctx).lhs.node, ((Logical_factorContext)_localctx).rhs.node); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				((Logical_factorContext)_localctx).lhs = number_expression();
				setState(260);
				((Logical_factorContext)_localctx).NE = match(NE);
				setState(261);
				((Logical_factorContext)_localctx).rhs = number_expression();
				 ((Logical_factorContext)_localctx).node =  new ast.BinaryOperation((((Logical_factorContext)_localctx).NE!=null?((Logical_factorContext)_localctx).NE.getText():null), ((Logical_factorContext)_localctx).lhs.node, ((Logical_factorContext)_localctx).rhs.node); 
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
		public String value;
		public Token INT_KW;
		public Token DOUBLE_KW;
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
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				((TypeContext)_localctx).INT_KW = match(INT_KW);
				 ((TypeContext)_localctx).value =  (((TypeContext)_localctx).INT_KW!=null?((TypeContext)_localctx).INT_KW.getText():null); 
				}
				break;
			case DOUBLE_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				((TypeContext)_localctx).DOUBLE_KW = match(DOUBLE_KW);
				 ((TypeContext)_localctx).value =  (((TypeContext)_localctx).DOUBLE_KW!=null?((TypeContext)_localctx).DOUBLE_KW.getText():null); 
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
	public static class DeclarationContext extends ParserRuleContext {
		public ast.RuntimeContext context;
		public ast.Declaration node;
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DeclarationContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final DeclarationContext declaration(ast.RuntimeContext context) throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState(), context);
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((DeclarationContext)_localctx).type = type();
			setState(273);
			((DeclarationContext)_localctx).ID = match(ID);
			 ((DeclarationContext)_localctx).node =  new ast.Declaration(_localctx.context, ((DeclarationContext)_localctx).type.value, (((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null)); 
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
		public ast.RuntimeContext context;
		public ast.Assignment node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ScriptingLanguageParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AssignmentContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final AssignmentContext assignment(ast.RuntimeContext context) throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState(), context);
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			((AssignmentContext)_localctx).ID = match(ID);
			setState(277);
			match(ASSIGNMENT);
			setState(278);
			((AssignmentContext)_localctx).expression = expression();
			 ((AssignmentContext)_localctx).node =  new ast.Assignment(_localctx.context, (((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).expression.node); 
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
		public ast.RuntimeContext context;
		public ast.DeclarationAndAssignment node;
		public TypeContext type;
		public Token ID;
		public ExpressionContext expression;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(ScriptingLanguageParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Declaration_and_assignmentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Declaration_and_assignmentContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final Declaration_and_assignmentContext declaration_and_assignment(ast.RuntimeContext context) throws RecognitionException {
		Declaration_and_assignmentContext _localctx = new Declaration_and_assignmentContext(_ctx, getState(), context);
		enterRule(_localctx, 26, RULE_declaration_and_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((Declaration_and_assignmentContext)_localctx).type = type();
			setState(282);
			((Declaration_and_assignmentContext)_localctx).ID = match(ID);
			setState(283);
			match(ASSIGNMENT);
			setState(284);
			((Declaration_and_assignmentContext)_localctx).expression = expression();
			 ((Declaration_and_assignmentContext)_localctx).node =  new ast.DeclarationAndAssignment(_localctx.context, ((Declaration_and_assignmentContext)_localctx).type.value, (((Declaration_and_assignmentContext)_localctx).ID!=null?((Declaration_and_assignmentContext)_localctx).ID.getText():null), ((Declaration_and_assignmentContext)_localctx).expression.node); 
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
		public ast.RuntimeContext context;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(ScriptingLanguageParser.ID, 0); }
		public TerminalNode INCREMENT() { return getToken(ScriptingLanguageParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(ScriptingLanguageParser.DECREMENT, 0); }
		public UpdateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public UpdateContext(ParserRuleContext parent, int invokingState, ast.RuntimeContext context) {
			super(parent, invokingState);
			this.context = context;
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

	public final UpdateContext update(ast.RuntimeContext context) throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState(), context);
		enterRule(_localctx, 28, RULE_update);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				assignment(context);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(ID);
				setState(289);
				match(INCREMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				match(ID);
				setState(291);
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
		"\u0004\u0001\'\u0127\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\'\b\u0001\u000b\u0001\f\u0001(\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0004\u0002m\b\u0002\u000b\u0002"+
		"\f\u0002n\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002t\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0089\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0091\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0099"+
		"\b\u0004\n\u0004\f\u0004\u009c\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a4\b\u0004\n\u0004"+
		"\f\u0004\u00a7\t\u0004\u0003\u0004\u00a9\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b1\b\u0005"+
		"\n\u0005\f\u0005\u00b4\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bc\b\u0005\n\u0005\f\u0005"+
		"\u00bf\t\u0005\u0003\u0005\u00c1\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00da\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e2"+
		"\b\u0007\n\u0007\f\u0007\u00e5\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00ed\b\b\n\b\f\b\u00f0\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0109\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u010f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0125\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u013c"+
		"\u0000\u001e\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004"+
		"\u0088\u0001\u0000\u0000\u0000\u0006\u0090\u0001\u0000\u0000\u0000\b\u00a8"+
		"\u0001\u0000\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00d9\u0001"+
		"\u0000\u0000\u0000\u000e\u00db\u0001\u0000\u0000\u0000\u0010\u00e6\u0001"+
		"\u0000\u0000\u0000\u0012\u0108\u0001\u0000\u0000\u0000\u0014\u010e\u0001"+
		"\u0000\u0000\u0000\u0016\u0110\u0001\u0000\u0000\u0000\u0018\u0114\u0001"+
		"\u0000\u0000\u0000\u001a\u0119\u0001\u0000\u0000\u0000\u001c\u0124\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0006\u0000"+
		"\uffff\uffff\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000\u0000"+
		"\u0000\"&\u0006\u0001\uffff\uffff\u0000#$\u0003\u0004\u0002\u0000$%\u0006"+
		"\u0001\uffff\uffff\u0000%\'\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000"+
		"+,\u0006\u0002\uffff\uffff\u0000,\u0089\u0001\u0000\u0000\u0000-.\u0003"+
		"\u0016\u000b\u0000./\u0005\u0007\u0000\u0000/0\u0006\u0002\uffff\uffff"+
		"\u00000\u0089\u0001\u0000\u0000\u000012\u0003\u0018\f\u000023\u0005\u0007"+
		"\u0000\u000034\u0006\u0002\uffff\uffff\u00004\u0089\u0001\u0000\u0000"+
		"\u000056\u0003\u001a\r\u000067\u0005\u0007\u0000\u000078\u0006\u0002\uffff"+
		"\uffff\u00008\u0089\u0001\u0000\u0000\u00009:\u0005\u001b\u0000\u0000"+
		":;\u0005\u0010\u0000\u0000;<\u0005%\u0000\u0000<=\u0005\t\u0000\u0000"+
		"=>\u0003\u0006\u0003\u0000>?\u0005\u0007\u0000\u0000?@\u0003\u000e\u0007"+
		"\u0000@A\u0005\u0007\u0000\u0000AB\u0003\u001c\u000e\u0000BC\u0005\u0011"+
		"\u0000\u0000CD\u0005\u0012\u0000\u0000DE\u0003\u0002\u0001\u0000EF\u0005"+
		"\u0013\u0000\u0000F\u0089\u0001\u0000\u0000\u0000GH\u0005\u001c\u0000"+
		"\u0000HI\u0005\u0010\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005\u0011"+
		"\u0000\u0000KL\u0005\u0012\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0005"+
		"\u0013\u0000\u0000N\u0089\u0001\u0000\u0000\u0000OP\u0006\u0002\uffff"+
		"\uffff\u0000PQ\u0005\u001d\u0000\u0000QR\u0003\u000e\u0007\u0000RS\u0005"+
		"\u0012\u0000\u0000ST\u0003\u0002\u0001\u0000T[\u0005\u0013\u0000\u0000"+
		"UV\u0005\u001e\u0000\u0000VW\u0005\u0012\u0000\u0000WX\u0003\u0002\u0001"+
		"\u0000XY\u0005\u0013\u0000\u0000YZ\u0006\u0002\uffff\uffff\u0000Z\\\u0001"+
		"\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0006\u0002\uffff\uffff\u0000^\u0089\u0001"+
		"\u0000\u0000\u0000_`\u0005\u001f\u0000\u0000`a\u0005\u0010\u0000\u0000"+
		"ab\u0005%\u0000\u0000bc\u0005\u0011\u0000\u0000cl\u0005\u0012\u0000\u0000"+
		"de\u0005 \u0000\u0000ef\u0005#\u0000\u0000fg\u0005\b\u0000\u0000gj\u0003"+
		"\u0002\u0001\u0000hi\u0005!\u0000\u0000ik\u0005\u0007\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000"+
		"ld\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000os\u0001\u0000\u0000\u0000pq\u0005\"\u0000"+
		"\u0000qr\u0005\b\u0000\u0000rt\u0003\u0002\u0001\u0000sp\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005\u0013"+
		"\u0000\u0000v\u0089\u0001\u0000\u0000\u0000wx\u0005\u001a\u0000\u0000"+
		"xy\u0005\u0010\u0000\u0000yz\u0005%\u0000\u0000z{\u0005\u0011\u0000\u0000"+
		"{|\u0005\u0007\u0000\u0000|\u0089\u0006\u0002\uffff\uffff\u0000}~\u0005"+
		"\u0019\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0080\u0003\u0006"+
		"\u0003\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081\u0082\u0005\u0007"+
		"\u0000\u0000\u0082\u0083\u0006\u0002\uffff\uffff\u0000\u0083\u0089\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\u0016\u0000\u0000\u0085\u0086\u0005"+
		"%\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0089\u0006\u0002"+
		"\uffff\uffff\u0000\u0088*\u0001\u0000\u0000\u0000\u0088-\u0001\u0000\u0000"+
		"\u0000\u00881\u0001\u0000\u0000\u0000\u00885\u0001\u0000\u0000\u0000\u0088"+
		"9\u0001\u0000\u0000\u0000\u0088G\u0001\u0000\u0000\u0000\u0088O\u0001"+
		"\u0000\u0000\u0000\u0088_\u0001\u0000\u0000\u0000\u0088w\u0001\u0000\u0000"+
		"\u0000\u0088}\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000\u0000\u0000"+
		"\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u008b\u0003\b\u0004\u0000\u008b"+
		"\u008c\u0006\u0003\uffff\uffff\u0000\u008c\u0091\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0003\u000e\u0007\u0000\u008e\u008f\u0006\u0003\uffff\uffff"+
		"\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008a\u0001\u0000\u0000"+
		"\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0091\u0007\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0003\n\u0005\u0000\u0093\u009a\u0006\u0004\uffff\uffff"+
		"\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000"+
		"\u0096\u0097\u0006\u0004\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000"+
		"\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u00a9\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0003\n\u0005\u0000\u009e\u00a5\u0006\u0004\uffff\uffff"+
		"\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a1\u0003\n\u0005\u0000"+
		"\u00a1\u00a2\u0006\u0004\uffff\uffff\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u0092\u0001\u0000\u0000\u0000\u00a8\u009d\u0001\u0000\u0000"+
		"\u0000\u00a9\t\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\f\u0006\u0000"+
		"\u00ab\u00b2\u0006\u0005\uffff\uffff\u0000\u00ac\u00ad\u0005\u0003\u0000"+
		"\u0000\u00ad\u00ae\u0003\f\u0006\u0000\u00ae\u00af\u0006\u0005\uffff\uffff"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\f\u0006\u0000"+
		"\u00b6\u00bd\u0006\u0005\uffff\uffff\u0000\u00b7\u00b8\u0005\u0004\u0000"+
		"\u0000\u00b8\u00b9\u0003\f\u0006\u0000\u00b9\u00ba\u0006\u0005\uffff\uffff"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00aa\u0001\u0000\u0000"+
		"\u0000\u00c0\u00b5\u0001\u0000\u0000\u0000\u00c1\u000b\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005%\u0000\u0000\u00c3\u00da\u0006\u0006\uffff\uffff"+
		"\u0000\u00c4\u00c5\u0005#\u0000\u0000\u00c5\u00da\u0006\u0006\uffff\uffff"+
		"\u0000\u00c6\u00c7\u0005$\u0000\u0000\u00c7\u00da\u0006\u0006\uffff\uffff"+
		"\u0000\u00c8\u00c9\u0005\u0018\u0000\u0000\u00c9\u00da\u0006\u0006\uffff"+
		"\uffff\u0000\u00ca\u00cb\u0005\u0010\u0000\u0000\u00cb\u00cc\u0003\u0006"+
		"\u0003\u0000\u00cc\u00cd\u0005\u0011\u0000\u0000\u00cd\u00ce\u0006\u0006"+
		"\uffff\uffff\u0000\u00ce\u00da\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0017\u0000\u0000\u00d0\u00d1\u0005\u0010\u0000\u0000\u00d1\u00d2\u0003"+
		"\f\u0006\u0000\u00d2\u00d3\u0005\u0011\u0000\u0000\u00d3\u00d4\u0006\u0006"+
		"\uffff\uffff\u0000\u00d4\u00da\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0002\u0000\u0000\u00d6\u00d7\u0003\f\u0006\u0000\u00d7\u00d8\u0006\u0006"+
		"\uffff\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00c2\u0001"+
		"\u0000\u0000\u0000\u00d9\u00c4\u0001\u0000\u0000\u0000\u00d9\u00c6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00c8\u0001\u0000\u0000\u0000\u00d9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d9\u00cf\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001"+
		"\u0000\u0000\u0000\u00da\r\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u0010"+
		"\b\u0000\u00dc\u00e3\u0006\u0007\uffff\uffff\u0000\u00dd\u00de\u0005\f"+
		"\u0000\u0000\u00de\u00df\u0003\u0010\b\u0000\u00df\u00e0\u0006\u0007\uffff"+
		"\uffff\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u000f\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u0012"+
		"\t\u0000\u00e7\u00ee\u0006\b\uffff\uffff\u0000\u00e8\u00e9\u0005\r\u0000"+
		"\u0000\u00e9\u00ea\u0003\u0012\t\u0000\u00ea\u00eb\u0006\b\uffff\uffff"+
		"\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u0011\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\b\u0004\u0000"+
		"\u00f2\u00f3\u0006\t\uffff\uffff\u0000\u00f3\u0109\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0003\b\u0004\u0000\u00f5\u00f6\u0005\u000e\u0000\u0000\u00f6"+
		"\u00f7\u0003\b\u0004\u0000\u00f7\u00f8\u0006\t\uffff\uffff\u0000\u00f8"+
		"\u0109\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\b\u0004\u0000\u00fa\u00fb"+
		"\u0005\u000f\u0000\u0000\u00fb\u00fc\u0003\b\u0004\u0000\u00fc\u00fd\u0006"+
		"\t\uffff\uffff\u0000\u00fd\u0109\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003"+
		"\b\u0004\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0101\u0003\b\u0004"+
		"\u0000\u0101\u0102\u0006\t\uffff\uffff\u0000\u0102\u0109\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0003\b\u0004\u0000\u0104\u0105\u0005\u000b\u0000\u0000"+
		"\u0105\u0106\u0003\b\u0004\u0000\u0106\u0107\u0006\t\uffff\uffff\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u00f1\u0001\u0000\u0000\u0000"+
		"\u0108\u00f4\u0001\u0000\u0000\u0000\u0108\u00f9\u0001\u0000\u0000\u0000"+
		"\u0108\u00fe\u0001\u0000\u0000\u0000\u0108\u0103\u0001\u0000\u0000\u0000"+
		"\u0109\u0013\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0014\u0000\u0000"+
		"\u010b\u010f\u0006\n\uffff\uffff\u0000\u010c\u010d\u0005\u0015\u0000\u0000"+
		"\u010d\u010f\u0006\n\uffff\uffff\u0000\u010e\u010a\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0015\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0003\u0014\n\u0000\u0111\u0112\u0005%\u0000\u0000\u0112"+
		"\u0113\u0006\u000b\uffff\uffff\u0000\u0113\u0017\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0005%\u0000\u0000\u0115\u0116\u0005\t\u0000\u0000\u0116"+
		"\u0117\u0003\u0006\u0003\u0000\u0117\u0118\u0006\f\uffff\uffff\u0000\u0118"+
		"\u0019\u0001\u0000\u0000\u0000\u0119\u011a\u0003\u0014\n\u0000\u011a\u011b"+
		"\u0005%\u0000\u0000\u011b\u011c\u0005\t\u0000\u0000\u011c\u011d\u0003"+
		"\u0006\u0003\u0000\u011d\u011e\u0006\r\uffff\uffff\u0000\u011e\u001b\u0001"+
		"\u0000\u0000\u0000\u011f\u0125\u0003\u0018\f\u0000\u0120\u0121\u0005%"+
		"\u0000\u0000\u0121\u0125\u0005\u0005\u0000\u0000\u0122\u0123\u0005%\u0000"+
		"\u0000\u0123\u0125\u0005\u0006\u0000\u0000\u0124\u011f\u0001\u0000\u0000"+
		"\u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u001d\u0001\u0000\u0000\u0000\u0013([jns\u0088\u0090\u009a"+
		"\u00a5\u00a8\u00b2\u00bd\u00c0\u00d9\u00e3\u00ee\u0108\u010e\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}