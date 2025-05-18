grammar ScriptingLanguage;

options {
    language = Java;
}

@members {
    public static void main(String[] args) {
        System.out.println("Grammar works");
    }
}

start [ast.RuntimeContext context]
    : sequence[context] { $context.addStatements($sequence.node); } EOF
    ;

sequence [ast.RuntimeContext context] returns [ast.Sequence node]
    :   { $node = new ast.Sequence(context); }
        (
            statement[context]
            { $node.addStatement($statement.node); }
        )+
    ;

statement [ast.RuntimeContext context] returns [ast.Statement node]
    : expression SEMICOLON { $node = new ast.ExpressionStatement($context, $expression.node); }
    | declaration[context] SEMICOLON { $node = $declaration.node; }
    | assignment[context] SEMICOLON { $node = $assignment.node; }
    | declaration_and_assignment[context] SEMICOLON { $node = $declaration_and_assignment.node; }
    | FOR_KW LPAR ID ASSIGNMENT expression SEMICOLON logical_expression SEMICOLON update[context] RPAR LCURLY sequence[context] RCURLY // TODO: implement for loop
    |
        WHILE_KW LPAR condition=logical_expression RPAR LCURLY while_body=sequence[context] RCURLY
        { $node = new ast.While($context, $condition.node, $while_body.node); }
    |
        { ast.Statement false_body_node = null; }
        IF_KW condition=logical_expression LCURLY true_body=sequence[context] RCURLY
        ( ELSE_KW LCURLY false_body=sequence[context] RCURLY { false_body_node = $false_body.node; } )?
        { $node = new ast.If($context, $condition.node, $true_body.node, false_body_node); }
    | SWITCH_KW LPAR ID RPAR LCURLY ( CASE_KW INT COLON sequence[context] (BREAK_KW SEMICOLON)? )+ ( DEFAULT_KW COLON sequence[context] )? RCURLY // TODO: implement switch statement
    | SCAN_KW LPAR ID RPAR SEMICOLON { $node = new ast.Scan($context, $ID.text); }
    | PRINT_KW LPAR expression RPAR SEMICOLON { $node = new ast.Print($context, $expression.node); }
    | DEL_KW ID SEMICOLON { $node = new ast.Delete($context, $ID.text); }
    ;

expression returns [ast.Expression node]
    : number_expression     { $node = $number_expression.node; }
    | logical_expression    { $node = $logical_expression.node; }
    ;

number_expression returns [ast.Expression node]
    :
        first_op=add_op { $node = $first_op.node; }
        (
            ADD next_op=add_op
            { $node = new ast.BinaryOperation($ADD.text, $node, $next_op.node); }
        )*
    |
        first_op=add_op { $node = $first_op.node; }
        (
            SUB next_op=add_op
            { $node = new ast.BinaryOperation($SUB.text, $node, $next_op.node); }
        )*
    ;

add_op returns [ast.Expression node]
    :
        first_op=number_factor { $node = $first_op.node; }
        (
            MUL next_op=number_factor
            { $node = new ast.BinaryOperation($MUL.text, $node, $next_op.node); }
        )*
    |
        first_op=number_factor { $node = $first_op.node; }
        (
            DIV next_op=number_factor
            { $node = new ast.BinaryOperation($DIV.text, $node, $next_op.node); }
        )*
    ;

number_factor returns [ast.Expression node]
    : ID                                { $node = new ast.Variable($ID.text); }
    | INT                               { $node = new ast.Constant("int", $INT.text); }
    | DOUBLE                            { $node = new ast.Constant("double", $DOUBLE.text); }
    | TIME_KW                           { $node = new ast.Time(); }
    | LPAR expression RPAR              { $node = $expression.node; }
    | ABS_KW LPAR number_factor RPAR    { $node = new ast.UnaryOperation($ABS_KW.text, $number_factor.node); }
    | SUB number_factor                 { $node = new ast.UnaryOperation($SUB.text, $number_factor.node); }
    | ID INCREMENT                      { $node = new ast.Increment($ID.text); }
    | ID DECREMENT                      { $node = new ast.Decrement($ID.text); }
    | INCREMENT ID                      { $node = new ast.Increment($ID.text); }
    | DECREMENT ID                      { $node = new ast.Decrement($ID.text); }
    ;

logical_expression returns [ast.Expression node]
    :
        first_op=or_op { $node = $first_op.node; }
        (
            OR next_op=or_op
            { $node = new ast.BinaryOperation($OR.text, $node, $next_op.node); }
        )*
    ;

or_op returns [ast.Expression node]
    :
        first_op=logical_factor { $node = $first_op.node; }
        (
            AND next_op=logical_factor
            { $node = new ast.BinaryOperation($AND.text, $node, $next_op.node); }
        )*
    ;

logical_factor returns [ast.Expression node]
    : number_expression                              { $node = $number_expression.node; }
    | lhs=number_expression LT rhs=number_expression { $node = new ast.BinaryOperation($LT.text, $lhs.node, $rhs.node); }
    | lhs=number_expression GT rhs=number_expression { $node = new ast.BinaryOperation($GT.text, $lhs.node, $rhs.node); }
    | lhs=number_expression EQ rhs=number_expression { $node = new ast.BinaryOperation($EQ.text, $lhs.node, $rhs.node); }
    | lhs=number_expression NE rhs=number_expression { $node = new ast.BinaryOperation($NE.text, $lhs.node, $rhs.node); }
    ;

type returns [String value]
    : INT_KW    { $value = $INT_KW.text; }
    | DOUBLE_KW { $value = $DOUBLE_KW.text; }
    ;

declaration [ast.RuntimeContext context] returns [ast.Declaration node]
    : type ID { $node = new ast.Declaration($context, $type.value, $ID.text); }
    ;

assignment [ast.RuntimeContext context] returns [ast.Assignment node]
    : ID ASSIGNMENT expression { $node = new ast.Assignment($context, $ID.text, $expression.node); }
    ;

declaration_and_assignment [ast.RuntimeContext context] returns [ast.DeclarationAndAssignment node]
    : type ID ASSIGNMENT expression { $node = new ast.DeclarationAndAssignment($context, $type.value, $ID.text, $expression.node); }
    ;

update [ast.RuntimeContext context]
    : assignment[context]
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
COMMENT     : '#' (~[\n])* -> skip ;
