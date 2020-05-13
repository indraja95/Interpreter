// $ANTLR null D:\\PL\\proj2-inutalap\\ProjLang.g 2020-04-29 17:54:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\PL\\proj2-inutalap\\ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:4:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\PL\\proj2-inutalap\\ProjLang.g:6:2: ( '0' .. '9' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:10:10: ( ( DIGIT )+ )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:10:12: ( DIGIT )+
			{
			// D:\\PL\\proj2-inutalap\\ProjLang.g:10:12: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "LEFTP"
	public final void mLEFTP() throws RecognitionException {
		try {
			int _type = LEFTP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:11:8: ( '(' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:11:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFTP"

	// $ANTLR start "RIGHTP"
	public final void mRIGHTP() throws RecognitionException {
		try {
			int _type = RIGHTP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:12:9: ( ')' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:12:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTP"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:13:7: ( 'true' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:13:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:14:8: ( 'false' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:14:10: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:15:8: ( '*' | '/' | '&' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:16:8: ( '+' | '-' | '|' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:17:8: ( '=' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:17:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:18:8: ( '<' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:18:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELOP"

	// $ANTLR start "COLEQ"
	public final void mCOLEQ() throws RecognitionException {
		try {
			int _type = COLEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:19:8: ( ':=' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:19:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLEQ"

	// $ANTLR start "EXC"
	public final void mEXC() throws RecognitionException {
		try {
			int _type = EXC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:20:6: ( '!' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:20:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXC"

	// $ANTLR start "LFB"
	public final void mLFB() throws RecognitionException {
		try {
			int _type = LFB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:21:6: ( '{' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:21:8: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LFB"

	// $ANTLR start "RFB"
	public final void mRFB() throws RecognitionException {
		try {
			int _type = RFB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:22:6: ( '}' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:22:8: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RFB"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:23:5: ( ';' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:23:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:24:6: ( 'let' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:24:8: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:25:6: ( 'val' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:25:8: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:26:5: ( 'in' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:26:7: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:27:6: ( 'end' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:27:8: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:28:5: ( 'if' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:28:7: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:29:7: ( 'then' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:29:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:30:7: ( 'else' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:30:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:31:8: ( 'while' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:31:10: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:32:5: ( 'do' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:32:7: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:33:6: ( 'fun' )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:33:8: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:34:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:34:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\PL\\proj2-inutalap\\ProjLang.g:34:15: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\PL\\proj2-inutalap\\ProjLang.g:35:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\PL\\proj2-inutalap\\ProjLang.g:35:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\PL\\proj2-inutalap\\ProjLang.g:35:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\PL\\proj2-inutalap\\ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\PL\\proj2-inutalap\\ProjLang.g:1:8: ( NUMBER | LEFTP | RIGHTP | TRUE | FALSE | MULOP | ADDOP | EQUAL | RELOP | COLEQ | EXC | LFB | RFB | SC | LET | VAL | IN | END | IF | THEN | ELSE | WHILE | DO | FUN | ID | WS )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:10: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 2 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:17: LEFTP
				{
				mLEFTP(); 

				}
				break;
			case 3 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:23: RIGHTP
				{
				mRIGHTP(); 

				}
				break;
			case 4 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:30: TRUE
				{
				mTRUE(); 

				}
				break;
			case 5 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:35: FALSE
				{
				mFALSE(); 

				}
				break;
			case 6 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:41: MULOP
				{
				mMULOP(); 

				}
				break;
			case 7 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:47: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 8 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:53: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 9 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:59: RELOP
				{
				mRELOP(); 

				}
				break;
			case 10 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:65: COLEQ
				{
				mCOLEQ(); 

				}
				break;
			case 11 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:71: EXC
				{
				mEXC(); 

				}
				break;
			case 12 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:75: LFB
				{
				mLFB(); 

				}
				break;
			case 13 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:79: RFB
				{
				mRFB(); 

				}
				break;
			case 14 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:83: SC
				{
				mSC(); 

				}
				break;
			case 15 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:86: LET
				{
				mLET(); 

				}
				break;
			case 16 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:90: VAL
				{
				mVAL(); 

				}
				break;
			case 17 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:94: IN
				{
				mIN(); 

				}
				break;
			case 18 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:97: END
				{
				mEND(); 

				}
				break;
			case 19 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:101: IF
				{
				mIF(); 

				}
				break;
			case 20 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:104: THEN
				{
				mTHEN(); 

				}
				break;
			case 21 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:109: ELSE
				{
				mELSE(); 

				}
				break;
			case 22 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:114: WHILE
				{
				mWHILE(); 

				}
				break;
			case 23 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:120: DO
				{
				mDO(); 

				}
				break;
			case 24 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:123: FUN
				{
				mFUN(); 

				}
				break;
			case 25 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:127: ID
				{
				mID(); 

				}
				break;
			case 26 :
				// D:\\PL\\proj2-inutalap\\ProjLang.g:1:130: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\4\uffff\2\25\11\uffff\6\25\2\uffff\6\25\1\51\1\52\3\25\1\56\3\25\1\62"+
		"\1\63\1\64\2\uffff\1\65\2\25\1\uffff\1\70\1\71\1\25\4\uffff\1\73\1\25"+
		"\2\uffff\1\75\1\uffff\1\76\2\uffff";
	static final String DFA4_eofS =
		"\77\uffff";
	static final String DFA4_minS =
		"\1\11\3\uffff\1\150\1\141\11\uffff\1\145\1\141\1\146\1\154\1\150\1\157"+
		"\2\uffff\1\165\1\145\1\154\1\156\1\164\1\154\2\60\1\144\1\163\1\151\1"+
		"\60\1\145\1\156\1\163\3\60\2\uffff\1\60\1\145\1\154\1\uffff\2\60\1\145"+
		"\4\uffff\1\60\1\145\2\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\3\uffff\1\162\1\165\11\uffff\1\145\1\141\2\156\1\150\1\157\2\uffff"+
		"\1\165\1\145\1\154\1\156\1\164\1\154\2\172\1\144\1\163\1\151\1\172\1\145"+
		"\1\156\1\163\3\172\2\uffff\1\172\1\145\1\154\1\uffff\2\172\1\145\4\uffff"+
		"\1\172\1\145\2\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
		"\6\uffff\1\31\1\32\22\uffff\1\21\1\23\3\uffff\1\27\3\uffff\1\30\1\17\1"+
		"\20\1\22\2\uffff\1\4\1\24\1\uffff\1\25\1\uffff\1\5\1\26";
	static final String DFA4_specialS =
		"\77\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\13\4\uffff\1\6\1\uffff\1\2\1\3\1\6"+
			"\1\7\1\uffff\1\7\1\uffff\1\6\12\1\1\12\1\16\1\11\1\10\3\uffff\32\25\6"+
			"\uffff\3\25\1\24\1\22\1\5\2\25\1\21\2\25\1\17\7\25\1\4\1\25\1\20\1\23"+
			"\3\25\1\14\1\7\1\15",
			"",
			"",
			"",
			"\1\30\11\uffff\1\27",
			"\1\31\23\uffff\1\32",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"\1\34",
			"\1\36\7\uffff\1\35",
			"\1\40\1\uffff\1\37",
			"\1\41",
			"\1\42",
			"",
			"",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\66",
			"\1\67",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\72",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\74",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NUMBER | LEFTP | RIGHTP | TRUE | FALSE | MULOP | ADDOP | EQUAL | RELOP | COLEQ | EXC | LFB | RFB | SC | LET | VAL | IN | END | IF | THEN | ELSE | WHILE | DO | FUN | ID | WS );";
		}
	}

}
