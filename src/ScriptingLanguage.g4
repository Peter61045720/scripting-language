grammar ScriptingLanguage;

options {
    language = Java;
}

@members {
    public static void main(String[] args) throws Exception {
        ScriptingLanguageLexer lex = new ScriptingLanguageLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream (lex);
        ScriptingLanguageParser parser = new ScriptingLanguageParser(tokens);
        parser.start();
    }
}

start
    : sequence EOF
    ;

sequence
    : ( statement )+
    ;

statement
    : expression
    | declaration SEMICOLON
    | assignment SEMICOLON
    | declaration_and_assignment SEMICOLON
    | type ID ASSIGNMENT expression SEMICOLON
    | FOR_KW LPAR ID ASSIGNMENT expression SEMICOLON logical_expression SEMICOLON update RPAR LCURLY sequence RCURLY
    | WHILE_KW LPAR logical_expression RPAR LCURLY sequence RCURLY
    | IF_KW logical_expression LCURLY sequence RCURLY ( ELSE_KW LCURLY sequence RCURLY )?
    | SWITCH_KW LPAR ID RPAR LCURLY ( CASE_KW INT COLON sequence (BREAK_KW SEMICOLON)? )+ ( DEFAULT_KW COLON sequence )? RCURLY
    | SCAN_KW LPAR expression RPAR SEMICOLON
    | PRINT_KW LPAR expression RPAR SEMICOLON
    | DEL_KW ID SEMICOLON
    ;

expression
    : number_expression
    | logical_expression
    ;

number_expression
    : add_op ( ADD add_op )*
    | add_op ( SUB add_op )*
    ;

add_op
    : number_factor ( MUL number_factor )*
    | number_factor ( DIV number_factor )*
    ;

number_factor
    : ID
    | INT
    | DOUBLE
    | TIME_KW
    | LPAR expression RPAR
    | ABS_KW LPAR  RPAR
    ;

logical_expression
    : or_op ( OR or_op )*
    ;

or_op
    : logical_factor ( AND logical_factor )*
    ;

logical_factor
    : number_expression LT number_expression
    | number_expression GT number_expression
    | number_expression EQ number_expression
    | number_expression NE number_expression
    ;

type
    : INT_KW
    | DOUBLE_KW
    ;

declaration
    : type ID
    ;

assignment
    : ID ASSIGNMENT expression
    ;

declaration_and_assignment
    : type ID ASSIGNMENT expression
    ;

update
    : assignment
    | ID INCREMENT
    | ID DECREMENT
    ;

ADD         : '+';
SUB         : '-';
MUL         : '*';
DIV         : '/';
INCREMENT   : '++';
DECREMENT   : '--';
SEMICOLON   : ';';
COLON       : ':';
ASSIGNMENT  : '=';
EQ          : '==';
NE          : '!=';
OR          : '||';
AND         : '&&';
LT          : '<';
GT          : '>';
LPAR        : '(';
RPAR        : ')';
LCURLY      : '{';
RCURLY      : '}';
INT_KW      : 'int';
DOUBLE_KW   : 'double';
DEL_KW      : 'del';
ABS_KW      : 'abs';
TIME_KW     : 'TIME';
PRINT_KW    : 'print';
SCAN_KW     : 'scan';
FOR_KW      : 'for';
WHILE_KW    : 'while';
IF_KW       : 'if';
ELSE_KW     : 'else';
SWITCH_KW   : 'switch';
CASE_KW     : 'case';
BREAK_KW    : 'break';
DEFAULT_KW  : 'default';
INT         : [0-9]+;
DOUBLE      : [0-9]+ '.' [0-9]+;
ID          : [a-zA-Z]( [_0-9a-zA-Z]+ )?;
WS          : [ \t\n\r]+ -> skip;
COMMENT     : '#' (~[\n])* ->skip ;
