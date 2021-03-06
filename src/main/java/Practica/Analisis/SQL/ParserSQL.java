
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Feb 19 02:24:04 CST 2020
//----------------------------------------------------

package Practica.Analisis.SQL;

import java_cup.runtime.Symbol;
import java.util.ArrayList;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Feb 19 02:24:04 CST 2020
  */
public class ParserSQL extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public ParserSQL() {super();}

  /** Constructor which sets the default scanner. */
  public ParserSQL(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserSQL(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\042\000\002\002\004\000\002\002\005\000\002\004" +
    "\002\000\002\004\004\000\002\003\007\000\002\003\012" +
    "\000\002\003\010\000\002\003\006\000\002\005\003\000" +
    "\002\005\004\000\002\006\002\000\002\006\005\000\002" +
    "\007\002\000\002\007\004\000\002\010\006\000\002\011" +
    "\002\000\002\011\007\000\002\011\007\000\002\012\002" +
    "\000\002\012\006\000\002\013\004\000\002\014\002\000" +
    "\002\014\005\000\002\015\006\000\002\016\002\000\002" +
    "\016\004\000\002\017\003\000\002\017\003\000\002\020" +
    "\002\000\002\020\007\000\002\021\002\000\002\021\007" +
    "\000\002\022\003\000\002\022\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\122\000\012\004\006\007\004\011\010\014\007\001" +
    "\002\000\004\005\105\001\002\000\004\020\101\001\002" +
    "\000\006\023\070\025\067\001\002\000\004\005\064\001" +
    "\002\000\004\005\013\001\002\000\004\002\012\001\002" +
    "\000\004\002\001\001\002\000\004\030\014\001\002\000" +
    "\004\012\015\001\002\000\004\025\016\001\002\000\004" +
    "\013\057\001\002\000\006\006\020\020\ufff5\001\002\000" +
    "\004\025\022\001\002\000\004\020\ufffb\001\002\000\006" +
    "\013\024\027\025\001\002\000\004\020\ufff4\001\002\000" +
    "\006\024\uffe1\026\uffe1\001\002\000\006\024\uffe0\026\uffe0" +
    "\001\002\000\006\024\031\026\027\001\002\000\016\006" +
    "\uffe6\016\uffe6\017\uffe6\020\uffe6\021\uffe6\022\uffe6\001\002" +
    "\000\010\020\ufff2\021\033\022\034\001\002\000\016\006" +
    "\uffe7\016\uffe7\017\uffe7\020\uffe7\021\uffe7\022\uffe7\001\002" +
    "\000\004\020\ufff3\001\002\000\004\025\046\001\002\000" +
    "\004\025\035\001\002\000\006\013\024\027\025\001\002" +
    "\000\006\024\031\026\027\001\002\000\006\020\uffe3\022" +
    "\041\001\002\000\004\020\ufff0\001\002\000\004\025\042" +
    "\001\002\000\006\013\024\027\025\001\002\000\006\024" +
    "\031\026\027\001\002\000\006\020\uffe3\022\041\001\002" +
    "\000\004\020\uffe2\001\002\000\006\013\024\027\025\001" +
    "\002\000\006\024\031\026\027\001\002\000\006\020\uffe5" +
    "\021\052\001\002\000\004\020\ufff1\001\002\000\004\025" +
    "\053\001\002\000\006\013\024\027\025\001\002\000\006" +
    "\024\031\026\027\001\002\000\006\020\uffe5\021\052\001" +
    "\002\000\004\020\uffe4\001\002\000\006\024\031\026\027" +
    "\001\002\000\010\006\uffe9\017\061\020\uffe9\001\002\000" +
    "\004\025\016\001\002\000\006\006\uffea\020\uffea\001\002" +
    "\000\006\006\uffe8\020\uffe8\001\002\000\004\030\065\001" +
    "\002\000\006\006\020\020\ufff5\001\002\000\004\020\ufffa" +
    "\001\002\000\006\005\ufff7\017\075\001\002\000\004\005" +
    "\ufff9\001\002\000\004\005\072\001\002\000\004\030\073" +
    "\001\002\000\006\006\020\020\ufff5\001\002\000\004\020" +
    "\ufffd\001\002\000\004\025\077\001\002\000\004\005\ufff8" +
    "\001\002\000\010\005\ufff7\016\ufff7\017\075\001\002\000" +
    "\006\005\ufff6\016\ufff6\001\002\000\014\002\uffff\004\006" +
    "\007\004\011\010\014\007\001\002\000\004\020\104\001" +
    "\002\000\004\002\000\001\002\000\004\002\ufffe\001\002" +
    "\000\004\030\106\001\002\000\006\010\uffef\015\110\001" +
    "\002\000\004\010\114\001\002\000\004\025\111\001\002" +
    "\000\006\016\ufff7\017\075\001\002\000\004\016\113\001" +
    "\002\000\004\010\uffee\001\002\000\004\015\115\001\002" +
    "\000\006\024\031\026\027\001\002\000\004\016\124\001" +
    "\002\000\006\016\uffec\017\120\001\002\000\006\024\031" +
    "\026\027\001\002\000\004\016\uffed\001\002\000\006\016" +
    "\uffec\017\120\001\002\000\004\016\uffeb\001\002\000\004" +
    "\020\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\122\000\006\002\010\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\070\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\015\016" +
    "\001\001\000\002\001\001\000\004\007\020\001\001\000" +
    "\004\010\022\001\001\000\002\001\001\000\004\022\025" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\017\027\001\001\000\002\001\001\000\004" +
    "\011\031\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\022\035\001\001" +
    "\000\004\017\036\001\001\000\004\021\037\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\022\042\001\001" +
    "\000\004\017\043\001\001\000\004\021\044\001\001\000" +
    "\002\001\001\000\004\022\046\001\001\000\004\017\047" +
    "\001\001\000\004\020\050\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\022\053\001\001\000\004\017\054" +
    "\001\001\000\004\020\055\001\001\000\002\001\001\000" +
    "\004\017\057\001\001\000\004\016\061\001\001\000\004" +
    "\015\062\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\065\001\001\000\002\001\001" +
    "\000\004\006\075\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\073\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\077\001\001\000\002\001\001\000\006\003\101\004\102" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\106\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\111\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\013\115\017\116\001\001\000\002\001\001\000\004\014" +
    "\120\001\001\000\004\017\121\001\001\000\002\001\001" +
    "\000\004\014\122\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserSQL$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserSQL$actions(this);
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
    return action_obj.CUP$ParserSQL$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        
        public ParserSQL(LexerSQL lex) { 
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
class CUP$ParserSQL$actions {
  private final ParserSQL parser;

  /** Constructor */
  CUP$ParserSQL$actions(ParserSQL parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$ParserSQL$do_action(
    int                        CUP$ParserSQL$act_num,
    java_cup.runtime.lr_parser CUP$ParserSQL$parser,
    java.util.Stack            CUP$ParserSQL$stack,
    int                        CUP$ParserSQL$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserSQL$result;

      /* select the action based on the action number */
      switch (CUP$ParserSQL$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // operadorCondicion ::= OPERADOR 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("operadorCondicion",16, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // operadorCondicion ::= ASIGNACION 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("operadorCondicion",16, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // comparacionListOr ::= OR ID operadorCondicion value comparacionListOr 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListOr",15, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // comparacionListOr ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListOr",15, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // comparacionListAnd ::= AND ID operadorCondicion value comparacionListAnd 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListAnd",14, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // comparacionListAnd ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListAnd",14, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // value ::= NUM 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("value",13, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // value ::= CADENA 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("value",13, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // listAsigValueP ::= COMA listAsigValue 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listAsigValueP",12, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // listAsigValueP ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listAsigValueP",12, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // listAsigValue ::= ID ASIGNACION value listAsigValueP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listAsigValue",11, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-3)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // valueListP ::= COMA value valueListP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("valueListP",10, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // valueListP ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("valueListP",10, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // valueList ::= value valueListP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("valueList",9, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // listColumn2 ::= PARENTESISA ID listColumnP PARENTESISC 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listColumn2",8, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-3)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // listColumn2 ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listColumn2",8, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // comparacionListP ::= OR ID operadorCondicion value comparacionListOr 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListP",7, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // comparacionListP ::= AND ID operadorCondicion value comparacionListAnd 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListP",7, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // comparacionListP ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionListP",7, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // comparacionList ::= ID operadorCondicion value comparacionListP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("comparacionList",6, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-3)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // condiciones ::= FILTRAR comparacionList 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("condiciones",5, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // condiciones ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("condiciones",5, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // listColumnP ::= COMA ID listColumnP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listColumnP",4, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // listColumnP ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listColumnP",4, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // listColumn ::= ID listColumnP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listColumn",3, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // listColumn ::= TODO 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("listColumn",3, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // orden ::= ELIMINAR EN PATH condiciones 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("orden",1, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-3)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // orden ::= ACTUALIZAR EN PATH ASIGNAR listAsigValue condiciones 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("orden",1, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-5)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // orden ::= INSERTAR EN PATH listColumn2 VALORES PARENTESISA valueList PARENTESISC 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("orden",1, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-7)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // orden ::= SELECCIONAR listColumn EN PATH condiciones 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("orden",1, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-4)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // ordenP ::= orden FINLINEA 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("ordenP",2, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // ordenP ::= 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("ordenP",2, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= orden FINLINEA ordenP 
            {
              Object RESULT =null;

              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-2)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          return CUP$ParserSQL$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)).value;
		RESULT = start_val;
              CUP$ParserSQL$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.elementAt(CUP$ParserSQL$top-1)), ((java_cup.runtime.Symbol)CUP$ParserSQL$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserSQL$parser.done_parsing();
          return CUP$ParserSQL$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

