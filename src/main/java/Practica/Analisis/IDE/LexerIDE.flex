package Practica.Analisis.IDE;

import Practica.Objetos.Token;
import Practica.Objetos.Archivo;
import java_cup.runtime.Symbol;
import java.util.ArrayList;

%%
%class LexerIDE
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
WHITE = ([\n\r\t\f])+
EXT = ".csv"

%{
    private ArrayList<Token> tokens = new ArrayList<Token>();
    private ArrayList<Token> errores = new ArrayList<Token>();
    private boolean existenTokens = false;
 
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
    "PROYECTO" {tokens.add(new Token("Proyecto","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PROYECTO,"PROYECTO");}
    "CARPETA" {tokens.add(new Token("Carpeta","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.CARPETA, "CARPETA");}
    "ARCHIVO" {tokens.add(new Token("Archivo","PALABRA_RESERVADA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.ARCHIVO, "ARCHIVO");}
    ("<")("\ ")*("/")("\ ")*("PROYECTO")("\ ")*(">") {this.existenTokens = true; return symbol(sym.FINPROYECTO, "/PROYECTO");}
    ("<")("\ ")*("/")("\ ")*("CARPETA")("\ ")*(">") {tokens.add(new Token("FinCarpeta","FINCARPETA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.FINCARPETA, "/CARPETA");}
    "nombre" {this.existenTokens = true; return symbol(sym.nombre, "nombre");}
    "ubicacion" {this.existenTokens = true; return symbol(sym.ubicacion, "ubicacion");}
    "<" {this.existenTokens = true; return symbol(sym.MENOR, "<");}
    ">" {this.existenTokens = true; return symbol(sym.MAYOR, ">");}
    "=" {this.existenTokens = true; return symbol(sym.ASIGNACION, "=");}
    ("\"")((("/")({ID})(("\ ")+({ID}))*)+)({EXT})("\"") {tokens.add(new Token(yytext(),"PATH", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.PATH, yytext());}
    ("\"")({ID}|("\ "))*("\"") {tokens.add(new Token(yytext(), "CADENA", yyline, yycolumn)); this.existenTokens = true; return symbol(sym.CADENA, yytext());}
    "/" {this.existenTokens = true; return symbol(sym.SLASH);}
    {WHITE} {/* ignore */}
    ("\ ") {/*ignore*/}
    . {errores.add(new Token(yytext(), "ERROR", yyline, yycolumn));}
}