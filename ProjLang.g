grammar ProjLang;

fragment LETTER 
	:	'a'..'z' | 'A'..'Z';
fragment DIGIT 
	:	'0'..'9';



NUMBER 		:	DIGIT+;
LEFTP		:	'(';
RIGHTP		:	')';
TRUE		:	'true';
FALSE		:	'false';
MULOP		:	'*'	|	'/'	|	'&';
ADDOP		:	'+'	|	'-'	|	'|';
EQUAL		:	'=';
RELOP		:	'<';
COLEQ		:	':=';
EXC		:	'!';
LFB		:	'{';
RFB		:	'}';
SC		:	';';
LET		:	'let';
VAL		:	'val';
IN		:	'in';
END		:	'end';
IF		:	'if';
THEN		:	'then';
ELSE		:	'else';
WHILE		:	'while';
DO		:	'do';
FUN		:	'fun';
ID  		:	LETTER(LETTER|DIGIT)*;
WS		:	(' '|'\t'|'\n'|'\r') + {skip();};


input returns [Expr exp]  : expr {$exp = $expr.exp;} SC
		;
expr returns [Expr exp]  : IF exp2 = expr THEN exp3 = expr ELSE exp4 = expr{$exp = new IfExp($exp2.exp, $exp3.exp, $exp4.exp);}
		| LET VAL str1 = ID EQUAL exp5 = expr IN exp6 = expr END {$exp = new LetValExp($str1.text, $exp5.exp, $exp6.exp);}
		| LET FUN str2 = ID  LEFTP str3 = ID RIGHTP EQUAL exp7 = expr IN exp8 = expr END {$exp = new LetFunExp($str2.text, $str3.text, $exp7.exp, $exp8.exp);}
		| WHILE exp9 = expr DO exp10 = expr {$exp = new WhileExp($exp9.exp, $exp10.exp);}
		| LFB exp11 = expr  ( SC exp12 = expr {$exp = new SeqExp($exp11.exp, $exp12.exp);} ) * RFB
		| EXC exp13 = expr {$exp = new NotExp($exp13.exp);}
		| str4 = ID COLEQ exp14 = expr {$exp = new AssnExp($str4.text, $exp14.exp);}
		| exp15 = relexpr{$exp = $exp15.exp;}
		;
relexpr returns [Expr exp] : exp16 = arithexpr {$exp = $exp16.exp;} ( (exp17 = RELOP| exp17 = EQUAL) exp18 = arithexpr {if($exp17.text.equals("=")) $exp = new BinExp(BinOp.EQ, $exp, $exp18.exp); 
														else $exp = new BinExp(BinOp.LT, $exp, $exp18.exp); } ) ?
		;
arithexpr returns [Expr exp] : exp19 = term {$exp = $exp19.exp;} (ADDOP exp20 = term {if($ADDOP.text.equals("+")) $exp = new BinExp(BinOp.PLUS, $exp, $exp20.exp); 
										else if($ADDOP.text.equals("-")) $exp = new BinExp(BinOp.MINUS, $exp, $exp20.exp); 
										else if($ADDOP.text.equals("|")) $exp = new BinExp(BinOp.OR, $exp, $exp20.exp);})*
		;
term returns [Expr exp]	: exp21 = factor {$exp = $exp21.exp;} (MULOP exp22 = factor{if($MULOP.text.equals("*")) $exp = new BinExp(BinOp.TIMES, $exp, $exp22.exp); 
										else if ($MULOP.text.equals("/")) $exp = new BinExp(BinOp.DIV, $exp, $exp22.exp); 
										else if($MULOP.text.equals("&")) $exp = new BinExp(BinOp.AND, $exp, $exp22.exp);})*
		;
factor returns [Expr exp] : NUMBER {$exp = new IntConst(Integer.parseInt($NUMBER.text));}
		| TRUE {$exp = new BoolConst(Boolean.parseBoolean("true"));}
		| FALSE {$exp = new BoolConst(Boolean.parseBoolean("false"));}
		| str5 = ID {$exp = new VarExp($str5.text);}
		| str6 = ID LEFTP exp23 = expr RIGHTP {$exp = new AppExp($str6.text, $exp23.exp);}
		| LEFTP exp24 = expr{$exp = $exp24.exp;} RIGHTP
		;
