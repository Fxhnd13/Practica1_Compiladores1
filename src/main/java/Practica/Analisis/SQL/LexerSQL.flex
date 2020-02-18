package Practica.Analisis.SQL;

import Practica.Objetos.Token;
import Practica.Objetos.Archivo;
import java_cup.runtime.Symbol;
import java.util.ArrayList;

%%
%class LexerSQL
%public
%cup
%char
%line
%column
%full

L = [a-zA-Z]
S = [-_@+*#]
TD = [0-9]
D = [1-9]
C = ["<=","<",">",">=","<>"]
ID = ({L})({L}|{D}|{S})*
WHITE = ([\n\r\t\f])+

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
    "SELECCIONAR" {tokens.add(new Token("SELECCIONAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.SELECCIONAR,"SELECCIONAR");}
    "INSERTAR" {tokens.add(new Token("INSERTAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.INSERTAR, "INSERTAR");}
    "ELIMINAR" {tokens.add(new Token("ELIMINAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ELIMINAR, "ELIMINAR");}
    "EN" {tokens.add(new Token("EN","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.EN, "EN");}
    "FILTRAR" {tokens.add(new Token("FILTRAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.FILTRAR, "FILTRAR");}
    "VALORES" {tokens.add(new Token("VALORES","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.VALORES, "VALORES");}
    "ACTUALIZAR" {tokens.add(new Token("ACTUALIZAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ACTUALIZAR, "ACTUALIZAR");}
    "ASIGNAR" {tokens.add(new Token("ASIGNAR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ASIGNAR, "ASIGNAR");}
    "AND" {tokens.add(new Token("AND","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.AND, "AND");}
    "OR" {tokens.add(new Token("OR","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.OR, "OR");}
    "(" {tokens.add(new Token("(","PARENTESISA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PARENTESISA,"(");}
    ")" {tokens.add(new Token(")","PARENTESISC", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PARENTESISC,")");}
    ("\"")({L}|{C}|{TD}|{S}|("\ "))*("\"") {tokens.add(new Token(yytext(), "CADENA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.CADENA, yytext());}
    "," {tokens.add(new Token(",","COMA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.COMA, ",");}
    "*" {tokens.add(new Token("*","TODO", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.TODO, "*");}
    ";" {tokens.add(new Token(";","FINLINEA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.FINLINEA, ";");}
    "=" {tokens.add(new Token("=", "ASIGNACION", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ASIGNACION, "=");}
    ({D})({TD})* {tokens.add(new Token(yytext(), "NUMERO", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.NUM, yytext());}
    {ID} {tokens.add(new Token(yytext(), "ID", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ID, yytext());}
    ({ID})((".")({ID}))* {tokens.add(new Token(yytext(), "PATH", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PATH, yytext());}
    {C} {tokens.add(new Token(yytext(), "OPERADOR", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.OPERADOR, yytext());}
    {WHITE} {/* ignore */}
    ("\ ") {/*ignore*/}
    . {errores.add(new Token(yytext(), "ERROR", yyline, yycolumn));}
}