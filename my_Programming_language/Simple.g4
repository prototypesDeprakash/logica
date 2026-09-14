grammar Simple;

program
    : line* EOF
    ;

line
    : functionDeclaration
    | statement
    | ifBlock
    | whileBlock
    | forBlock
    ;

//
// =========================
// FUNCTIONS
// =========================
//

// public void myscript() { ... }
// private void myscript() { ... }
// void myscript() { ... }

functionDeclaration
    : accessModifier? VOID ID '(' ')' block
    ;

accessModifier
    : PUBLIC
    | PRIVATE
    ;

//
// =========================
// STATEMENTS
// =========================
//

statement
    : variableDeclaration
    | assignment
    | functionCall
    | printStatement
    ;

//
// =========================
// VARIABLES
// =========================
//

variableDeclaration
    : type ID '=' expression ';'
    ;

variableDeclarationNoSemicolon
    : type ID '=' expression
    ;

type
    : INT_TYPE
    | BOOLEAN_TYPE
    | STRING_TYPE
    ;

assignment
    : ID '=' expression ';'
    ;

assignmentNoSemicolon
    : ID '=' expression
    ;

//
// =========================
// FUNCTION CALL
// =========================
//

functionCall
    : ID '(' argumentList? ')' ';'
    ;

functionCallNoSemicolon
    : ID '(' argumentList? ')'
    ;

//
// =========================
// PRINT
// =========================
//

printStatement
    : PRINTLN '(' expression? ')' ';'
    ;

//
// =========================
// IF
// =========================
//

ifBlock
    : IF '(' expression ')' block
      (ELSE (ifBlock | block))?
    ;

//
// =========================
// WHILE
// =========================
//

whileBlock
    : WHILE '(' expression ')' block
    ;

//
// =========================
// FOR
// =========================
//

forBlock
    : FOR '(' forInit? ';' expression? ';' forUpdate? ')' block
    ;

forInit
    : variableDeclarationNoSemicolon
    | assignmentNoSemicolon
    ;

forUpdate
    : assignmentNoSemicolon
    | increment
    | decrement
    | functionCallNoSemicolon
    ;

increment
    : ID '++'
    ;

decrement
    : ID '--'
    ;

//
// =========================
// BLOCK
// =========================
//

block
    : '{' line* '}'
    ;

//
// =========================
// ARGUMENTS
// =========================
//

argumentList
    : expression (',' expression)*
    ;

//
// =========================
// EXPRESSIONS
// =========================
//

expression
    : expression '+' expression
    | expression '-' expression
    | expression '*' expression
    | expression '/' expression

    | expression '<' expression
    | expression '>' expression
    | expression '<=' expression
    | expression '>=' expression

    | expression '==' expression
    | expression '!=' expression

    | expression '&&' expression
    | expression '||' expression

    | '!' expression

    | '(' expression ')'

    | ID
    | INT
    | STRING
    | TRUE
    | FALSE
    ;

//
// =========================
// KEYWORDS
// =========================
//

PUBLIC
    : 'public'
    ;

PRIVATE
    : 'private'
    ;

VOID
    : 'void'
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

INT_TYPE
    : 'int'
    ;

BOOLEAN_TYPE
    : 'boolean'
    ;

STRING_TYPE
    : 'string'
    ;

//
// System.out.println is ONE special language token.
// It is NOT a class/object lookup.
//
PRINTLN
    : 'System.out.println'
    ;

//
// =========================
// IDENTIFIERS / VALUES
// =========================
//

ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

INT
    : [0-9]+
    ;

STRING
    : '"' ~["\r\n]* '"'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;