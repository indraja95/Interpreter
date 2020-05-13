// $ANTLR null D:\\PL\\proj2-inutalap\\ProjLang.g 2020-04-29 17:54:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "COLEQ", "DIGIT", "DO", 
		"ELSE", "END", "EQUAL", "EXC", "FALSE", "FUN", "ID", "IF", "IN", "LEFTP", 
		"LET", "LETTER", "LFB", "MULOP", "NUMBER", "RELOP", "RFB", "RIGHTP", "SC", 
		"THEN", "TRUE", "VAL", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int COLEQ=5;
	public static final int DIGIT=6;
	public static final int DO=7;
	public static final int ELSE=8;
	public static final int END=9;
	public static final int EQUAL=10;
	public static final int EXC=11;
	public static final int FALSE=12;
	public static final int FUN=13;
	public static final int ID=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int LEFTP=17;
	public static final int LET=18;
	public static final int LETTER=19;
	public static final int LFB=20;
	public static final int MULOP=21;
	public static final int NUMBER=22;
	public static final int RELOP=23;
	public static final int RFB=24;
	public static final int RIGHTP=25;
	public static final int SC=26;
	public static final int THEN=27;
	public static final int TRUE=28;
	public static final int VAL=29;
	public static final int WHILE=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\PL\\proj2-inutalap\\ProjLang.g"; }



	// $ANTLR start "input"
	// D:\\PL\\proj2-inutalap\\ProjLang.g:38:1: input returns [Expr exp] : expr SC ;
	public final Expr input() throws RecognitionException {
		Expr exp = null;


		Expr expr1 =null;

		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:38:27: ( expr SC )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:38:29: expr SC
			{
			pushFollow(FOLLOW_expr_in_input298);
			expr1=expr();
			state._fsp--;

			exp = expr1;
			match(input,SC,FOLLOW_SC_in_input302); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// D:\\PL\\proj2-inutalap\\ProjLang.g:40:1: expr returns [Expr exp] : ( IF exp2= expr THEN exp3= expr ELSE exp4= expr | LET VAL str1= ID EQUAL exp5= expr IN exp6= expr END | LET FUN str2= ID LEFTP str3= ID RIGHTP EQUAL exp7= expr IN exp8= expr END | WHILE exp9= expr DO exp10= expr | LFB exp11= expr ( SC exp12= expr )* RFB | EXC exp13= expr |str4= ID COLEQ exp14= expr |exp15= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr exp = null;


		Token str1=null;
		Token str2=null;
		Token str3=null;
		Token str4=null;
		Expr exp2 =null;
		Expr exp3 =null;
		Expr exp4 =null;
		Expr exp5 =null;
		Expr exp6 =null;
		Expr exp7 =null;
		Expr exp8 =null;
		Expr exp9 =null;
		Expr exp10 =null;
		Expr exp11 =null;
		Expr exp12 =null;
		Expr exp13 =null;
		Expr exp14 =null;
		Expr exp15 =null;

		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:40:26: ( IF exp2= expr THEN exp3= expr ELSE exp4= expr | LET VAL str1= ID EQUAL exp5= expr IN exp6= expr END | LET FUN str2= ID LEFTP str3= ID RIGHTP EQUAL exp7= expr IN exp8= expr END | WHILE exp9= expr DO exp10= expr | LFB exp11= expr ( SC exp12= expr )* RFB | EXC exp13= expr |str4= ID COLEQ exp14= expr |exp15= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LFB:
				{
				alt2=5;
				}
				break;
			case EXC:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==COLEQ) ) {
					alt2=7;
				}
				else if ( (LA2_6==ADDOP||(LA2_6 >= DO && LA2_6 <= EQUAL)||(LA2_6 >= IN && LA2_6 <= LEFTP)||LA2_6==MULOP||(LA2_6 >= RELOP && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LEFTP:
			case NUMBER:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:40:28: IF exp2= expr THEN exp3= expr ELSE exp4= expr
					{
					match(input,IF,FOLLOW_IF_in_expr317); 
					pushFollow(FOLLOW_expr_in_expr323);
					exp2=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr325); 
					pushFollow(FOLLOW_expr_in_expr331);
					exp3=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr333); 
					pushFollow(FOLLOW_expr_in_expr339);
					exp4=expr();
					state._fsp--;

					exp = new IfExp(exp2, exp3, exp4);
					}
					break;
				case 2 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:41:5: LET VAL str1= ID EQUAL exp5= expr IN exp6= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr346); 
					match(input,VAL,FOLLOW_VAL_in_expr348); 
					str1=(Token)match(input,ID,FOLLOW_ID_in_expr354); 
					match(input,EQUAL,FOLLOW_EQUAL_in_expr356); 
					pushFollow(FOLLOW_expr_in_expr362);
					exp5=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr364); 
					pushFollow(FOLLOW_expr_in_expr370);
					exp6=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr372); 
					exp = new LetValExp((str1!=null?str1.getText():null), exp5, exp6);
					}
					break;
				case 3 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:42:5: LET FUN str2= ID LEFTP str3= ID RIGHTP EQUAL exp7= expr IN exp8= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr380); 
					match(input,FUN,FOLLOW_FUN_in_expr382); 
					str2=(Token)match(input,ID,FOLLOW_ID_in_expr388); 
					match(input,LEFTP,FOLLOW_LEFTP_in_expr391); 
					str3=(Token)match(input,ID,FOLLOW_ID_in_expr397); 
					match(input,RIGHTP,FOLLOW_RIGHTP_in_expr399); 
					match(input,EQUAL,FOLLOW_EQUAL_in_expr401); 
					pushFollow(FOLLOW_expr_in_expr407);
					exp7=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr409); 
					pushFollow(FOLLOW_expr_in_expr415);
					exp8=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr417); 
					exp = new LetFunExp((str2!=null?str2.getText():null), (str3!=null?str3.getText():null), exp7, exp8);
					}
					break;
				case 4 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:43:5: WHILE exp9= expr DO exp10= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr425); 
					pushFollow(FOLLOW_expr_in_expr431);
					exp9=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr433); 
					pushFollow(FOLLOW_expr_in_expr439);
					exp10=expr();
					state._fsp--;

					exp = new WhileExp(exp9, exp10);
					}
					break;
				case 5 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:44:5: LFB exp11= expr ( SC exp12= expr )* RFB
					{
					match(input,LFB,FOLLOW_LFB_in_expr447); 
					pushFollow(FOLLOW_expr_in_expr453);
					exp11=expr();
					state._fsp--;

					// D:\\PL\\proj2-inutalap\\ProjLang.g:44:23: ( SC exp12= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SC) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\PL\\proj2-inutalap\\ProjLang.g:44:25: SC exp12= expr
							{
							match(input,SC,FOLLOW_SC_in_expr458); 
							pushFollow(FOLLOW_expr_in_expr464);
							exp12=expr();
							state._fsp--;

							exp = new SeqExp(exp11, exp12);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RFB,FOLLOW_RFB_in_expr472); 
					}
					break;
				case 6 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:45:5: EXC exp13= expr
					{
					match(input,EXC,FOLLOW_EXC_in_expr478); 
					pushFollow(FOLLOW_expr_in_expr484);
					exp13=expr();
					state._fsp--;

					exp = new NotExp(exp13);
					}
					break;
				case 7 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:46:5: str4= ID COLEQ exp14= expr
					{
					str4=(Token)match(input,ID,FOLLOW_ID_in_expr496); 
					match(input,COLEQ,FOLLOW_COLEQ_in_expr498); 
					pushFollow(FOLLOW_expr_in_expr504);
					exp14=expr();
					state._fsp--;

					exp = new AssnExp((str4!=null?str4.getText():null), exp14);
					}
					break;
				case 8 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:47:5: exp15= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr516);
					exp15=relexpr();
					state._fsp--;

					exp = exp15;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// D:\\PL\\proj2-inutalap\\ProjLang.g:49:1: relexpr returns [Expr exp] : exp16= arithexpr ( (exp17= RELOP |exp17= EQUAL ) exp18= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr exp = null;


		Token exp17=null;
		Expr exp16 =null;
		Expr exp18 =null;

		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:49:28: (exp16= arithexpr ( (exp17= RELOP |exp17= EQUAL ) exp18= arithexpr )? )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:49:30: exp16= arithexpr ( (exp17= RELOP |exp17= EQUAL ) exp18= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr535);
			exp16=arithexpr();
			state._fsp--;

			exp = exp16;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:49:69: ( (exp17= RELOP |exp17= EQUAL ) exp18= arithexpr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQUAL||LA4_0==RELOP) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:49:71: (exp17= RELOP |exp17= EQUAL ) exp18= arithexpr
					{
					// D:\\PL\\proj2-inutalap\\ProjLang.g:49:71: (exp17= RELOP |exp17= EQUAL )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==RELOP) ) {
						alt3=1;
					}
					else if ( (LA3_0==EQUAL) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// D:\\PL\\proj2-inutalap\\ProjLang.g:49:72: exp17= RELOP
							{
							exp17=(Token)match(input,RELOP,FOLLOW_RELOP_in_relexpr546); 
							}
							break;
						case 2 :
							// D:\\PL\\proj2-inutalap\\ProjLang.g:49:87: exp17= EQUAL
							{
							exp17=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relexpr553); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr560);
					exp18=arithexpr();
					state._fsp--;

					if((exp17!=null?exp17.getText():null).equals("=")) exp = new BinExp(BinOp.EQ, exp, exp18); 
																			else exp = new BinExp(BinOp.LT, exp, exp18); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// D:\\PL\\proj2-inutalap\\ProjLang.g:52:1: arithexpr returns [Expr exp] : exp19= term ( ADDOP exp20= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr exp = null;


		Token ADDOP2=null;
		Expr exp19 =null;
		Expr exp20 =null;

		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:52:30: (exp19= term ( ADDOP exp20= term )* )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:52:32: exp19= term ( ADDOP exp20= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr584);
			exp19=term();
			state._fsp--;

			exp = exp19;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:52:66: ( ADDOP exp20= term )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ADDOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:52:67: ADDOP exp20= term
					{
					ADDOP2=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr589); 
					pushFollow(FOLLOW_term_in_arithexpr595);
					exp20=term();
					state._fsp--;

					if((ADDOP2!=null?ADDOP2.getText():null).equals("+")) exp = new BinExp(BinOp.PLUS, exp, exp20); 
															else if((ADDOP2!=null?ADDOP2.getText():null).equals("-")) exp = new BinExp(BinOp.MINUS, exp, exp20); 
															else if((ADDOP2!=null?ADDOP2.getText():null).equals("|")) exp = new BinExp(BinOp.OR, exp, exp20);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// D:\\PL\\proj2-inutalap\\ProjLang.g:56:1: term returns [Expr exp] : exp21= factor ( MULOP exp22= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr exp = null;


		Token MULOP3=null;
		Expr exp21 =null;
		Expr exp22 =null;

		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:56:25: (exp21= factor ( MULOP exp22= factor )* )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:56:27: exp21= factor ( MULOP exp22= factor )*
			{
			pushFollow(FOLLOW_factor_in_term617);
			exp21=factor();
			state._fsp--;

			exp = exp21;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:56:63: ( MULOP exp22= factor )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MULOP) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:56:64: MULOP exp22= factor
					{
					MULOP3=(Token)match(input,MULOP,FOLLOW_MULOP_in_term622); 
					pushFollow(FOLLOW_factor_in_term628);
					exp22=factor();
					state._fsp--;

					if((MULOP3!=null?MULOP3.getText():null).equals("*")) exp = new BinExp(BinOp.TIMES, exp, exp22); 
															else if ((MULOP3!=null?MULOP3.getText():null).equals("/")) exp = new BinExp(BinOp.DIV, exp, exp22); 
															else if((MULOP3!=null?MULOP3.getText():null).equals("&")) exp = new BinExp(BinOp.AND, exp, exp22);
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// D:\\PL\\proj2-inutalap\\ProjLang.g:60:1: factor returns [Expr exp] : ( NUMBER | TRUE | FALSE |str5= ID |str6= ID LEFTP exp23= expr RIGHTP | LEFTP exp24= expr RIGHTP );
	public final Expr factor() throws RecognitionException {
		Expr exp = null;


		Token str5=null;
		Token str6=null;
		Token NUMBER4=null;
		Expr exp23 =null;
		Expr exp24 =null;

		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:60:27: ( NUMBER | TRUE | FALSE |str5= ID |str6= ID LEFTP exp23= expr RIGHTP | LEFTP exp24= expr RIGHTP )
			int alt7=6;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt7=1;
				}
				break;
			case TRUE:
				{
				alt7=2;
				}
				break;
			case FALSE:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4==LEFTP) ) {
					alt7=5;
				}
				else if ( (LA7_4==ADDOP||(LA7_4 >= DO && LA7_4 <= EQUAL)||LA7_4==IN||LA7_4==MULOP||(LA7_4 >= RELOP && LA7_4 <= THEN)) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LEFTP:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:60:29: NUMBER
					{
					NUMBER4=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor645); 
					exp = new IntConst(Integer.parseInt((NUMBER4!=null?NUMBER4.getText():null)));
					}
					break;
				case 2 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:61:5: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor653); 
					exp = new BoolConst(Boolean.parseBoolean("true"));
					}
					break;
				case 3 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:62:5: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor661); 
					exp = new BoolConst(Boolean.parseBoolean("false"));
					}
					break;
				case 4 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:63:5: str5= ID
					{
					str5=(Token)match(input,ID,FOLLOW_ID_in_factor673); 
					exp = new VarExp((str5!=null?str5.getText():null));
					}
					break;
				case 5 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:64:5: str6= ID LEFTP exp23= expr RIGHTP
					{
					str6=(Token)match(input,ID,FOLLOW_ID_in_factor685); 
					match(input,LEFTP,FOLLOW_LEFTP_in_factor687); 
					pushFollow(FOLLOW_expr_in_factor693);
					exp23=expr();
					state._fsp--;

					match(input,RIGHTP,FOLLOW_RIGHTP_in_factor695); 
					exp = new AppExp((str6!=null?str6.getText():null), exp23);
					}
					break;
				case 6 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:65:5: LEFTP exp24= expr RIGHTP
					{
					match(input,LEFTP,FOLLOW_LEFTP_in_factor703); 
					pushFollow(FOLLOW_expr_in_factor709);
					exp24=expr();
					state._fsp--;

					exp = exp24;
					match(input,RIGHTP,FOLLOW_RIGHTP_in_factor712); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return exp;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input298 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SC_in_input302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr317 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr323 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr325 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr331 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ELSE_in_expr333 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr346 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr348 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr354 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQUAL_in_expr356 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr364 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr370 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr380 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_FUN_in_expr382 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr388 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LEFTP_in_expr391 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ID_in_expr397 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTP_in_expr399 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_EQUAL_in_expr401 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr407 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_IN_in_expr409 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr415 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_END_in_expr417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr425 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr431 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DO_in_expr433 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LFB_in_expr447 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr453 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SC_in_expr458 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr464 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RFB_in_expr472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXC_in_expr478 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr496 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLEQ_in_expr498 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_expr504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr535 = new BitSet(new long[]{0x0000000000800402L});
	public static final BitSet FOLLOW_RELOP_in_relexpr546 = new BitSet(new long[]{0x0000000010425000L});
	public static final BitSet FOLLOW_EQUAL_in_relexpr553 = new BitSet(new long[]{0x0000000010425000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr584 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr589 = new BitSet(new long[]{0x0000000010425000L});
	public static final BitSet FOLLOW_term_in_arithexpr595 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term617 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term622 = new BitSet(new long[]{0x0000000010425000L});
	public static final BitSet FOLLOW_factor_in_term628 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUMBER_in_factor645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor685 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LEFTP_in_factor687 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_factor693 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTP_in_factor695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTP_in_factor703 = new BitSet(new long[]{0x000000005056D800L});
	public static final BitSet FOLLOW_expr_in_factor709 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RIGHTP_in_factor712 = new BitSet(new long[]{0x0000000000000002L});
}
