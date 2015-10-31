grammar sml;

model	
    : modelDeclaration imports? variables equations
    ;

modelDeclaration
    : 'model' modelName SEMICOLON
    ;

modelName
    : ID
    ;

imports
    : 'imports' COLON importSpec*
    ;

importSpec
    : modelName SEMICOLON
    ;

variables
    : 'variables' COLON (vardecl | component)*
    ;

vardecl
    : accesstype? ID SEMICOLON
    ;
	
accesstype
    : 'public'
    | 'private'
    ;	
	
component
    : 'component' modelName ID SEMICOLON
    ;

equations
    : 'equations' COLON equation*
    ;

equation
    : ID ASSIGN expression SEMICOLON
    | derivative ASSIGN expression SEMICOLON
    ;

// der (equation, variable, order)
derivative
    : DER LPAREN ID COMMA ID COMMA number RPAREN
    ;

expression 
    : multiplyingExpression ((PLUS|MINUS) multiplyingExpression)*
    ;

multiplyingExpression  
    : powExpression ((TIMES|DIV) powExpression)*
    ;

powExpression
    : atom (POW expression)?
    ;

atom 
    : scientific
    | variable
    | LPAREN expression RPAREN
    | func
    | ID
    ;

func
    : funcname LPAREN expression RPAREN
    ;

funcname
    : COS | TAN | SIN | ACOS | ATAN | ASIN | LOG | LN
    ;

relop 
    : EQ | GT | LT
    ;

variable
    : MINUS? ID
    ;

scientific
    : number (E number)?
    ;

number
    : NUMBER
    ;

DER
    : 'der'
    ;

ASSIGN
    : ':='
    ;

COS
    : 'cos'
    ;
   
SIN
    : 'sin'
    ;

TAN
    : 'tan'
    ;

ACOS
    : 'acos'
    ;
   
ASIN
    : 'asin'
    ;

ATAN
    : 'atan'
    ;
LN
    : 'ln'
    ;

LOG
    : 'log'
    ;

LPAREN 
    : '('
    ;

RPAREN 
    : ')'
    ;

PLUS 
    : '+'
    ;

MINUS 
    : '-'
    ;

TIMES 
    : '*'
    ;

DIV 
    : '/'
    ;

GT 
    : '>'
    ;

LT 
    : '<'
    ;

EQ
    : '='
    ;

COMMA
    : ','
    ;   

POINT
    : '.'
    ;

E
    : 'e'
    | 'E'
    ;

POW
    : '^'
    ;

fragment DIGIT
    : ('0'..'9')
    ;

fragment LETTER
    : ('a'..'z'|'A'..'Z')
    ;

SEMICOLON
    : ';'
    ;

COLON
    : ':'
    ;

NUMBER
    : DIGIT+ (POINT DIGIT+)?
    ;

ID
    : LETTER (LETTER | DIGIT | POINT)*;

WS 
    : [ \r\n\t]+ ->skip
    ;

COMMENT
    : '#' ~('\n'|'\r')* '\r'? '\n' ->skip
    ;