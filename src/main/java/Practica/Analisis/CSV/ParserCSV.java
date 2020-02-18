
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Feb 18 03:59:31 CST 2020
//----------------------------------------------------

package Practica.Analisis.CSV;

import java_cup.runtime.Symbol;
import java.util.ArrayList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Feb 18 03:59:31 CST 2020
  */
public class ParserCSV extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserCSV() {super();}

  /** Constructor which sets the default scanner. */
  public ParserCSV(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCSV(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\006\000\002\002" +
    "\005\000\002\003\002\000\002\003\005\000\002\003\005" +
    "\000\002\004\005\000\002\004\005\000\002\005\002\000" +
    "\002\005\005\000\002\005\005\000\002\006\003\000\002" +
    "\006\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\006\003\005\007\004\001\002\000\010\003" +
    "\031\004\030\005\ufffe\001\002\000\004\005\010\001\002" +
    "\000\004\002\007\001\002\000\004\002\001\001\002\000" +
    "\010\003\013\006\015\007\011\001\002\000\010\003\ufff6" +
    "\004\ufff6\005\ufff6\001\002\000\010\003\022\004\020\005" +
    "\ufff9\001\002\000\004\005\016\001\002\000\004\002\uffff" +
    "\001\002\000\010\003\ufff5\004\ufff5\005\ufff5\001\002\000" +
    "\010\003\013\006\015\007\011\001\002\000\006\002\ufffa" +
    "\005\ufffa\001\002\000\006\006\015\007\011\001\002\000" +
    "\004\005\025\001\002\000\004\005\023\001\002\000\010" +
    "\003\013\006\015\007\011\001\002\000\004\005\ufff7\001" +
    "\002\000\006\002\ufffb\005\ufffb\001\002\000\010\003\022" +
    "\004\020\005\ufff9\001\002\000\004\005\ufff8\001\002\000" +
    "\004\007\037\001\002\000\004\005\035\001\002\000\004" +
    "\005\033\001\002\000\010\003\013\006\015\007\011\001" +
    "\002\000\004\002\000\001\002\000\010\003\013\006\015" +
    "\007\011\001\002\000\004\005\ufffc\001\002\000\010\003" +
    "\031\004\030\005\ufffe\001\002\000\004\005\ufffd\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\002\005\001\001\000\004\003\031\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\013\006\011\001\001\000\002\001\001\000" +
    "\004\005\020\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\016\006\011\001\001\000" +
    "\002\001\001\000\004\006\025\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\023\006\011\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\026\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\033\006\011\001\001\000\002" +
    "\001\001\000\006\004\035\006\011\001\001\000\002\001" +
    "\001\000\004\003\037\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCSV$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCSV$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCSV$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        
        public ParserCSV(LexerCSV lex) { 
            super(lex);   
	}
        
        public void setAccion(String tipo,String mensaje,String accion){
            System.out.println(tipo+"         "+mensaje);
        }

        protected final static int _error_sync_size = 3;
        
        protected ArrayList<String> errores = new ArrayList<String>();
        
        public ArrayList<String> getErrores(){
            return errores;
        }
        
        protected int error_sync_size( ) {return _error_sync_size;}
        
        public void syntax_error(Symbol s){
            errores.add("Hubo un error sintactico en la linea: ("+(s.left+1)+") no cumple con la estructura establecida en la Columna: "+(s.right+1)); 
        }
        
        public void unrecovered_sintax_error(Symbol s)throws java.lang.Exception {
            report_fatal_error("Se termino de leer el archivo", s);
        }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserCSV$actions {
  private final ParserCSV parser;

  /** Constructor */
  CUP$ParserCSV$actions(ParserCSV parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserCSV$do_action(
    int                        CUP$ParserCSV$act_num,
    java_cup.runtime.lr_parser CUP$ParserCSV$parser,
    java.util.Stack            CUP$ParserCSV$stack,
    int                        CUP$ParserCSV$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCSV$result;

      /* select the action based on the action number */
      switch (CUP$ParserCSV$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // s4 ::= CADENA 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s4",4, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // s4 ::= ID 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s4",4, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // s3 ::= error FINLINEA s2 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s3",3, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // s3 ::= COMA s4 s3 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s3",3, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // s3 ::= 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s3",3, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // s2 ::= error FINLINEA s2 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // s2 ::= s4 s3 FINLINEA 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // s1 ::= error FINLINEA s2 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // s1 ::= COMA ID s1 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // s1 ::= 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s0 ::= error FINLINEA s2 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s0 ::= ID s1 FINLINEA s2 
            {
              Object RESULT =null;

              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          return CUP$ParserCSV$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s0 EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-1)).value;
		RESULT = start_val;
              CUP$ParserCSV$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.elementAt(CUP$ParserCSV$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCSV$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCSV$parser.done_parsing();
          return CUP$ParserCSV$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

