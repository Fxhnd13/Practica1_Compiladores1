package Practica.Analisis.CSV;

import Practica.Objetos.Token;
import Practica.Objetos.Archivo;
import java_cup.runtime.Symbol;
import java.util.ArrayList;

%%
%class LexerCSV
%public
%cup
%char
%line
%column
%full

L = [a-zA-Z]
S = [-_@+*#]
D = [0-9]
ID = ({L}|{D}|{S})+
WHITE = ([\r\t\f])+

%{
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
%}

%eof{
 
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this.existenTokens = false;
 
%eof}

%%

<YYINITIAL>{
    "," {tokens.add(new Token(",", "COMA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.COMA, ",");}
    {ID} {tokens.add(new Token(yytext(), "ID", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ID, yytext());}
    ({ID}|("\ "))* {tokens.add(new Token(yytext(), "CADENA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.CADENA, yytext());}
    "\n" {tokens.add(new Token(yytext(), "FINLINEA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.FINLINEA, yytext());}
    {WHITE} {/*ignore*/}
    . {errores.add(new Token(yytext(), "ERROR", yyline, yycolumn));}
}