
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 12 10:03:11 CST 2020
//----------------------------------------------------

package Practica.Analisis.IDE;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 12 10:03:11 CST 2020
  */
public class ParserIDE extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserIDE() {super();}

  /** Constructor which sets the default scanner. */
  public ParserIDE(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserIDE(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\002\014\000\002\002" +
    "\005\000\002\003\004\000\002\004\016\000\002\004\013" +
    "\000\002\004\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\006\003\004\011\006\001\002\000\004\012" +
    "\053\001\002\000\004\002\052\001\002\000\004\004\007" +
    "\001\002\000\004\015\010\001\002\000\004\014\011\001" +
    "\002\000\004\017\012\001\002\000\004\012\013\001\002" +
    "\000\004\011\015\001\002\000\004\011\047\001\002\000" +
    "\010\003\020\006\021\010\016\001\002\000\004\015\034" +
    "\001\002\000\006\002\ufffe\011\ufffe\001\002\000\004\012" +
    "\032\001\002\000\004\015\022\001\002\000\004\014\023" +
    "\001\002\000\004\017\024\001\002\000\004\012\025\001" +
    "\002\000\004\011\015\001\002\000\004\011\027\001\002" +
    "\000\004\007\030\001\002\000\004\012\031\001\002\000" +
    "\006\002\ufffc\011\ufffc\001\002\000\004\011\015\001\002" +
    "\000\006\002\ufffb\011\ufffb\001\002\000\004\014\035\001" +
    "\002\000\004\017\036\001\002\000\004\016\037\001\002" +
    "\000\004\014\040\001\002\000\004\013\041\001\002\000" +
    "\004\020\042\001\002\000\004\013\043\001\002\000\004" +
    "\021\044\001\002\000\004\012\045\001\002\000\004\011" +
    "\015\001\002\000\006\002\ufffd\011\ufffd\001\002\000\004" +
    "\005\050\001\002\000\004\012\051\001\002\000\004\002" +
    "\000\001\002\000\004\002\001\001\002\000\004\011\015" +
    "\001\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\013\001\001\000\002\001\001\000\004\004\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\003\025\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\032\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\045\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\053\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserIDE$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserIDE$actions(this);
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
    return action_obj.CUP$ParserIDE$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        
        public ParserIDE(LexerIDE lex) { 
            super(lex);   
	}
        
        public void setAccion(String tipo,String mensaje,String accion){
            System.out.println(tipo+"         "+mensaje);
        }
        
        /*public void syntax_error(Symbol s){
            setAccion("ERROR","Error Sintaxis token: " + s.right,"");
        }*/

        public void syntax_error(Symbol s){
            System.out.println("La Cadena: " + s.value + " en la Linea: " + (s.left+1) + ", Columna: "+(s.right+1)+ " esta fuera de contexto.");
        }
        

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$ParserIDE$actions {
  private final ParserIDE parser;

  /** Constructor */
  CUP$ParserIDE$actions(ParserIDE parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserIDE$do_action(
    int                        CUP$ParserIDE$act_num,
    java_cup.runtime.lr_parser CUP$ParserIDE$parser,
    java.util.Stack            CUP$ParserIDE$stack,
    int                        CUP$ParserIDE$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserIDE$result;

      /* select the action based on the action number */
      switch (CUP$ParserIDE$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // s2 ::= error MAYOR s1 
            {
              Object RESULT =null;

              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-2)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          return CUP$ParserIDE$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // s2 ::= CARPETA nombre ASIGNACION CADENA MAYOR s1 MENOR FINCARPETA MAYOR 
            {
              Object RESULT =null;

              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-8)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          return CUP$ParserIDE$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // s2 ::= ARCHIVO nombre ASIGNACION CADENA ubicacion ASIGNACION COMILLA PATH COMILLA SLASH MAYOR s1 
            {
              Object RESULT =null;

              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("s2",2, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-11)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          return CUP$ParserIDE$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // s1 ::= MENOR s2 
            {
              Object RESULT =null;

              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("s1",1, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-1)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          return CUP$ParserIDE$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s0 ::= error MAYOR s1 
            {
              Object RESULT =null;

              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-2)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          return CUP$ParserIDE$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s0 ::= MENOR PROYECTO nombre ASIGNACION CADENA MAYOR s1 MENOR FINPROYECTO MAYOR 
            {
              Object RESULT =null;

              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("s0",0, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-9)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          return CUP$ParserIDE$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s0 EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-1)).value;
		RESULT = start_val;
              CUP$ParserIDE$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.elementAt(CUP$ParserIDE$top-1)), ((java_cup.runtime.Symbol)CUP$ParserIDE$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserIDE$parser.done_parsing();
          return CUP$ParserIDE$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

