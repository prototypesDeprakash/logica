grammar Simple;

program
    : line* EOF
    ;

line
    : statement
    | ifBlock
    | whileBlock
    | forBlock
    ;

statement
    : variableDeclaration
    | assignment
    | functionCall
    ;

variableDeclaration
    : INT_TYPE ID '=' expression ';'
    ;

assignment
    : ID '=' expression ';'
    ;

functionCall
    : ID '(' argumentList? ')' ';'
    ;

ifBlock
    : IF '(' expression ')' block
      (ELSE (ifBlock | block))?
    ;

whileBlock
    : WHILE '(' expression ')' block
    ;

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

variableDeclarationNoSemicolon
    : INT_TYPE ID '=' expression
    ;

assignmentNoSemicolon
    : ID '=' expression
    ;

increment
    : ID '++'
    ;

decrement
    : ID '--'
    ;

functionCallNoSemicolon
    : ID '(' argumentList? ')'
    ;

block
    : '{' line* '}'
    ;

argumentList
    : expression (',' expression)*
    ;

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