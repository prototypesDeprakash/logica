grammar Simple;

// ============================================================
// PROGRAM
// ============================================================

program
    : topLevelItem* EOF
    ;

topLevelItem
    : functionDeclaration
    | statement
    | ifBlock
    | whileBlock
    | forBlock
    ;

// ============================================================
// FUNCTIONS
// ============================================================

// public void myscript() { }
// private int calculate(int x) { return x + 1; }
// void test() { }

functionDeclaration
    : accessModifier? returnType ID '(' parameterList? ')' block
    ;

accessModifier
    : PUBLIC
    | PRIVATE
    ;

returnType
    : type
    | VOID
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : type ID
    ;

// ============================================================
// BLOCK
// ============================================================

block
    : '{' blockItem* '}'
    ;

blockItem
    : statement
    | ifBlock
    | whileBlock
    | forBlock
    ;

// ============================================================
// STATEMENTS
// ============================================================

statement
    : variableDeclaration
    | expressionStatement
    | printStatement
    | returnStatement
    | breakStatement
    | continueStatement
    ;

// ============================================================
// VARIABLES
// ============================================================

// int x = 10;
// boolean ready = true;
// double water = 0.5;
// String name = "hello";
// int[] numbers = new int[10];
// int[] numbers = {1, 2, 3};

variableDeclaration
    : type ID ('=' expression)? ';'
    ;

variableDeclarationNoSemicolon
    : type ID ('=' expression)?
    ;

// ============================================================
// TYPES
// ============================================================

// int
// double
// boolean
// String
// int[]
// double[]
// boolean[]
// String[]

type
    : baseType ('[' ']')?
    ;

baseType
    : INT_TYPE
    | DOUBLE_TYPE
    | BOOLEAN_TYPE
    | STRING_TYPE
    ;

// ============================================================
// EXPRESSIONS / ASSIGNMENT
// ============================================================

expression
    : assignmentExpression
    ;

assignmentExpression
    : logicalOrExpression
    | assignmentTarget assignmentOperator assignmentExpression
    ;

assignmentTarget
    : qualifiedName
    | arrayAccess
    ;

assignmentOperator
    : '='
    | '+='
    | '-='
    | '*='
    | '/='
    | '%='
    ;

// ============================================================
// BOOLEAN LOGIC
// ============================================================

logicalOrExpression
    : logicalAndExpression
    | logicalOrExpression '||' logicalAndExpression
    ;

logicalAndExpression
    : equalityExpression
    | logicalAndExpression '&&' equalityExpression
    ;

equalityExpression
    : relationalExpression
    | equalityExpression '==' relationalExpression
    | equalityExpression '!=' relationalExpression
    ;

relationalExpression
    : additiveExpression
    | relationalExpression '<' additiveExpression
    | relationalExpression '>' additiveExpression
    | relationalExpression '<=' additiveExpression
    | relationalExpression '>=' additiveExpression
    ;

additiveExpression
    : multiplicativeExpression
    | additiveExpression '+' multiplicativeExpression
    | additiveExpression '-' multiplicativeExpression
    ;

multiplicativeExpression
    : unaryExpression
    | multiplicativeExpression '*' unaryExpression
    | multiplicativeExpression '/' unaryExpression
    | multiplicativeExpression '%' unaryExpression
    ;

unaryExpression
    : postfixExpression
    | '!' unaryExpression
    | '+' unaryExpression
    | '-' unaryExpression
    | '++' assignmentTarget
    | '--' assignmentTarget
    ;

// ============================================================
// POSTFIX
// ============================================================

postfixExpression
    : primaryExpression
    | postfixExpression '++'
    | postfixExpression '--'
    | postfixExpression '[' expression ']'
    ;

// ============================================================
// PRIMARY EXPRESSIONS
// ============================================================

primaryExpression
    : literal
    | functionCall
    | qualifiedName
    | arrayCreation
    | arrayInitializer
    | '(' expression ')'
    ;

// ============================================================
// FUNCTION CALL
// ============================================================

// move();
// turnLeft();
// move(x);
// getWorldSize();
// setPosition(x, y);

functionCall
    : ID '(' argumentList? ')'
    ;

argumentList
    : expression (',' expression)*
    ;

// ============================================================
// NAMES
// ============================================================

// x
// worldSize
// Entities.Pumpkin
// Items.Water
// Grounds.Soil

qualifiedName
    : ID ('.' ID)*
    ;

// ============================================================
// ARRAYS
// ============================================================

// new int[10]
// new double[20]
// new boolean[5]
// new String[10]

// new int[]{1, 2, 3}

arrayCreation
    : NEW baseType '[' expression ']' 
    | NEW baseType '[' ']' arrayInitializer
    ;

arrayInitializer
    : '{' expressionList? '}'
    ;

expressionList
    : expression (',' expression)*
    ;

// ============================================================
// ARRAY ACCESS
// ============================================================

// numbers[0]
// numbers[i]
// matrix[0]     (one-dimensional for now)

arrayAccess
    : qualifiedName '[' expression ']'
    ;

// ============================================================
// PRINT
// ============================================================

// Special language feature.
// This is NOT interpreted as a Java class/object.

printStatement
    : PRINTLN '(' expression? ')' ';'
    ;

// ============================================================
// RETURN
// ============================================================

returnStatement
    : RETURN expression? ';'
    ;

// ============================================================
// BREAK / CONTINUE
// ============================================================

breakStatement
    : BREAK ';'
    ;

continueStatement
    : CONTINUE ';'
    ;

// ============================================================
// IF
// ============================================================

ifBlock
    : IF '(' expression ')' block
      (ELSE (ifBlock | block))?
    ;

// ============================================================
// WHILE
// ============================================================

whileBlock
    : WHILE '(' expression ')' block
    ;

// ============================================================
// FOR
// ============================================================

forBlock
    : FOR '(' forInit? ';' expression? ';' forUpdate? ')' block
    ;

forInit
    : variableDeclarationNoSemicolon
    | expressionList
    ;

forUpdate
    : expressionList
    ;

// ============================================================
// LITERALS
// ============================================================

literal
    : INT
    | DOUBLE
    | STRING
    | TRUE
    | FALSE
    | NULL
    ;

// ============================================================
// KEYWORDS
// ============================================================

PUBLIC
    : 'public'
    ;

PRIVATE
    : 'private'
    ;

VOID
    : 'void'
    ;

INT_TYPE
    : 'int'
    ;

DOUBLE_TYPE
    : 'double'
    ;

BOOLEAN_TYPE
    : 'boolean'
    ;

STRING_TYPE
    : 'String'
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;

WHILE
    : 'while'
    ;

FOR
    : 'for'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

NULL
    : 'null'
    ;

NEW
    : 'new'
    ;

RETURN
    : 'return'
    ;

BREAK
    : 'break'
    ;

CONTINUE
    : 'continue'
    ;

// ============================================================
// SPECIAL PRINT
// ============================================================

// One special token.
// It is NOT a real System class or object.

PRINTLN
    : 'System.out.println'
    ;

// ============================================================
// NUMBERS
// ============================================================

DOUBLE
    : [0-9]+ '.' [0-9]+
    ;

INT
    : [0-9]+
    ;

// ============================================================
// STRING
// ============================================================

STRING
    : '"' (~["\\\r\n] | '\\' .)* '"'
    ;

// ============================================================
// IDENTIFIER
// ============================================================

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

// ============================================================
// COMMENTS
// ============================================================

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// ============================================================
// WHITESPACE
// ============================================================

WS
    : [ \t\r\n]+ -> skip
    ;