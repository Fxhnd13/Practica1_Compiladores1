/* The following code was generated by JFlex 1.6.1 */

package Practica.Analisis.SQL;

import Practica.Objetos.Token;
import Practica.Objetos.Archivo;
import java_cup.runtime.Symbol;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>LexerSQL.flex</tt>
 */
public class LexerSQL implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\6\1\6\1\41\1\6\1\6\22\0\1\33\1\0\1\32"+
    "\1\2\4\0\1\30\1\31\1\35\1\2\1\34\1\2\1\40\1\0"+
    "\1\3\11\4\1\0\1\36\1\5\1\37\1\5\1\0\1\2\1\16"+
    "\1\1\1\12\1\27\1\10\1\22\1\26\1\1\1\13\2\1\1\11"+
    "\1\21\1\15\1\14\2\1\1\17\1\7\1\20\1\24\1\23\3\1"+
    "\1\25\4\0\1\2\1\0\32\1\12\0\1\41\u1fa2\0\1\41\1\41"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\7\2\1\6"+
    "\1\7\1\1\1\10\1\11\1\12\1\13\1\14\1\0"+
    "\2\2\1\15\1\2\1\16\5\2\1\0\1\17\1\20"+
    "\5\2\1\21\32\2\1\22\1\2\1\23\1\24\1\2"+
    "\1\25\1\26\4\2\1\27\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[80];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\42\0\210\0\252\0\314"+
    "\0\356\0\u0110\0\u0132\0\u0154\0\u0176\0\42\0\42\0\u0198"+
    "\0\42\0\42\0\42\0\42\0\42\0\u01ba\0\u01dc\0\u01fe"+
    "\0\104\0\u0220\0\104\0\u0242\0\u0264\0\u0286\0\u02a8\0\u02ca"+
    "\0\u0198\0\42\0\u02ec\0\u030e\0\u0330\0\u0352\0\u0374\0\u0396"+
    "\0\104\0\u03b8\0\u03da\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484"+
    "\0\u04a6\0\u04c8\0\u04ea\0\u050c\0\u052e\0\u0550\0\u0572\0\u0594"+
    "\0\u05b6\0\u05d8\0\u05fa\0\u061c\0\u063e\0\u0660\0\u0682\0\u06a4"+
    "\0\u06c6\0\u06e8\0\u070a\0\104\0\u072c\0\104\0\104\0\u074e"+
    "\0\104\0\104\0\u0770\0\u0792\0\u07b4\0\u07d6\0\104\0\104";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[80];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\2\1\4\1\5\1\6\1\7\1\10"+
    "\2\3\1\11\1\12\1\3\1\13\3\3\1\14\1\15"+
    "\4\3\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\2\44\0\2\3\1\0\1\3\2\0\21\3"+
    "\5\0\1\3\2\0\1\26\4\0\2\4\43\0\1\6"+
    "\34\0\2\3\1\0\1\3\2\0\1\3\1\27\17\3"+
    "\5\0\1\3\2\0\1\26\2\0\2\3\1\0\1\3"+
    "\2\0\2\3\1\30\3\3\1\31\12\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\6\3"+
    "\1\32\12\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\10\3\1\33\10\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\1\34"+
    "\2\3\1\35\2\3\1\36\12\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\4\3\1\37"+
    "\14\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\7\3\1\40\11\3\5\0\1\3\2\0"+
    "\1\26\2\0\5\41\1\0\21\41\2\0\1\42\3\41"+
    "\1\0\1\41\3\0\1\43\5\0\21\43\13\0\2\3"+
    "\1\0\1\3\2\0\2\3\1\44\16\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\4\3"+
    "\1\45\14\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\1\46\20\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\4\3\1\47"+
    "\14\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\11\3\1\50\7\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\20\3\1\51"+
    "\5\0\1\3\2\0\1\26\2\0\2\3\1\0\1\3"+
    "\2\0\2\3\1\52\16\3\5\0\1\3\2\0\1\26"+
    "\2\0\2\3\1\0\1\3\2\0\2\3\1\53\16\3"+
    "\5\0\1\3\2\0\1\26\2\0\2\43\1\0\1\43"+
    "\2\0\21\43\5\0\1\43\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\1\3\1\54\17\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\12\3"+
    "\1\55\6\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\1\3\1\56\17\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\17\3"+
    "\1\57\1\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\15\3\1\60\3\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\11\3"+
    "\1\61\7\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\5\3\1\62\13\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\3\3"+
    "\1\63\15\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\4\3\1\64\14\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\10\3"+
    "\1\65\10\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\6\3\1\66\12\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\7\3"+
    "\1\67\11\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\10\3\1\70\10\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\10\3"+
    "\1\71\10\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\3\3\1\72\15\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\6\3"+
    "\1\73\12\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\11\3\1\74\7\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\7\3"+
    "\1\75\11\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\2\3\1\76\16\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\7\3"+
    "\1\77\11\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\1\3\1\100\17\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\4\3"+
    "\1\101\14\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\7\3\1\102\11\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\7\3"+
    "\1\103\11\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\10\3\1\104\10\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\4\3"+
    "\1\105\14\3\5\0\1\3\2\0\1\26\2\0\2\3"+
    "\1\0\1\3\2\0\10\3\1\106\10\3\5\0\1\3"+
    "\2\0\1\26\2\0\2\3\1\0\1\3\2\0\1\107"+
    "\20\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\5\3\1\110\13\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\10\3\1\111"+
    "\10\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\10\3\1\112\10\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\16\3\1\113"+
    "\2\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\6\3\1\114\12\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\7\3\1\115"+
    "\11\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\7\3\1\116\11\3\5\0\1\3\2\0"+
    "\1\26\2\0\2\3\1\0\1\3\2\0\10\3\1\117"+
    "\10\3\5\0\1\3\2\0\1\26\2\0\2\3\1\0"+
    "\1\3\2\0\10\3\1\120\10\3\5\0\1\3\2\0"+
    "\1\26\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2040];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\10\1\2\11\1\1\5\11"+
    "\1\0\12\1\1\0\1\11\56\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[80];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    private ArrayList<Token> tokens = new ArrayList<Token>();
    private ArrayList<Token> errores = new ArrayList<Token>();
    private boolean existenTokens = false;
 
    public void analizar(){
        try{
            while(true){

                // Obtener el token analizado y mostrar su información
                Symbol sym = this.next_token();
                if (!this.existenTokens())
                break;
            }
        }catch (Exception e){
          System.out.println(e.toString());
        }
    }

    public boolean existenTokens(){
        return this.existenTokens;
    }

    public ArrayList<Token> getTokens(){
        return this.tokens;
    }

    public ArrayList<Token> getErrores(){
        return this.errores;
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerSQL(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 154) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
     
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this.existenTokens = false;
 
  yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { errores.add(new Token(yytext(), "ERROR", yyline, yycolumn));
            }
          case 25: break;
          case 2: 
            { tokens.add(new Token(yytext(), "ID", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ID, yytext());
            }
          case 26: break;
          case 3: 
            { tokens.add(new Token(yytext(), "NUMERO", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.NUM, yytext());
            }
          case 27: break;
          case 4: 
            { tokens.add(new Token(yytext(), "OPERADOR", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.OPERADOR, yytext());
            }
          case 28: break;
          case 5: 
            { /* ignore */
            }
          case 29: break;
          case 6: 
            { tokens.add(new Token("(","PARENTESISA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PARENTESISA,"(");
            }
          case 30: break;
          case 7: 
            { tokens.add(new Token(")","PARENTESISC", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PARENTESISC,")");
            }
          case 31: break;
          case 8: 
            { /*ignore*/
            }
          case 32: break;
          case 9: 
            { tokens.add(new Token(",","COMA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.COMA, ",");
            }
          case 33: break;
          case 10: 
            { tokens.add(new Token("*","TODO", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.TODO, "*");
            }
          case 34: break;
          case 11: 
            { tokens.add(new Token(";","FINLINEA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.FINLINEA, ";");
            }
          case 35: break;
          case 12: 
            { tokens.add(new Token("=", "ASIGNACION", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ASIGNACION, "=");
            }
          case 36: break;
          case 13: 
            { tokens.add(new Token("EN","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.EN, "EN");
            }
          case 37: break;
          case 14: 
            { tokens.add(new Token("OR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.OR, "OR");
            }
          case 38: break;
          case 15: 
            { tokens.add(new Token(yytext(), "CADENA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.CADENA, yytext());
            }
          case 39: break;
          case 16: 
            { tokens.add(new Token(yytext(), "PATH", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PATH, yytext());
            }
          case 40: break;
          case 17: 
            { tokens.add(new Token("AND","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.AND, "AND");
            }
          case 41: break;
          case 18: 
            { tokens.add(new Token("ASIGNAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ASIGNAR, "ASIGNAR");
            }
          case 42: break;
          case 19: 
            { tokens.add(new Token("FILTRAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.FILTRAR, "FILTRAR");
            }
          case 43: break;
          case 20: 
            { tokens.add(new Token("VALORES","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.VALORES, "VALORES");
            }
          case 44: break;
          case 21: 
            { tokens.add(new Token("ELIMINAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ELIMINAR, "ELIMINAR");
            }
          case 45: break;
          case 22: 
            { tokens.add(new Token("INSERTAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.INSERTAR, "INSERTAR");
            }
          case 46: break;
          case 23: 
            { tokens.add(new Token("ACTUALIZAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ACTUALIZAR, "ACTUALIZAR");
            }
          case 47: break;
          case 24: 
            { tokens.add(new Token("SELECCIONAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.SELECCIONAR,"SELECCIONAR");
            }
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
