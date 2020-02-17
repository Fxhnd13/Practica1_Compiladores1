/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica.Utilidades;

import Practica.Analisis.IDE.LexerIDE;
import Practica.Objetos.Token;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author fxhnd
 */

public class TreeManager {
    
    public static DefaultTreeModel setNodeName(String name, JTree tree){
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        selectedNode.setUserObject(name);
        return model;
    }
    
    public static DefaultTreeModel removeChild(JTree tree){
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        if(selectedNode != tree.getModel().getRoot()){
            model.removeNodeFromParent(selectedNode);
            return model;
        }else{
            JOptionPane.showMessageDialog(null, "No se puede eliminar el nodo Raíz", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return model;
    }
    
    public static DefaultTreeModel addChild(String nombre, JTree tree){
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(nombre);
        selectedNode.add(newNode);
        
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        return model;
    }
    
    public static DefaultTreeModel createJTree(ArrayList<Token> tokens){
        JTree tree = new JTree();
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode selectedNode = null;
        for(int i=0; i<tokens.size(); i++) {
            if(tokens.get(i).getLexem().equals("Proyecto")){
                i++; //lee el siguiente token en este caso el nombre del proyecto
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tokens.get(i).getLexem());
                model.setRoot(newNode);//cambia la raiz por el nodo recien creado
                selectedNode = newNode;//el nodo a partir el cual estaremos trabajando sera este
            }
            if(tokens.get(i).getLexem().equals("Carpeta")){
                i++;
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tokens.get(i).getLexem());
                selectedNode.add(newNode);
                selectedNode = newNode;
                //modificar el model del arbol
            }
            if(tokens.get(i).getLexem().equals("FinCarpeta")){
                selectedNode = selectedNode.getPreviousNode();
            }
            if(tokens.get(i).getLexem().equals("Archivo")){
                i++;
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tokens.get(i).getLexem().substring(1, tokens.get(i).getLexem().length()-1));
                selectedNode.add(newNode);
            }
        }
        return model;
    }
    
    public static DefaultTreeModel createJTree(LexerIDE analizadorJFlex){
         try{
            while(true){

                // Obtener el token analizado y mostrar su información
                Symbol sym = analizadorJFlex.next_token();
                if (!analizadorJFlex.existenTokens())
                break;
            }
        }catch (Exception e){
          System.out.println(e.toString());
        }
        ArrayList<Token> tokens = analizadorJFlex.getTokens();
        JTree tree = new JTree();
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode selectedNode = null;
        for(int i=0; i<tokens.size(); i++) {
            if(tokens.get(i).getLexem().equals("Proyecto")){
                i++; //lee el siguiente token en este caso el nombre del proyecto
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tokens.get(i).getLexem());
                model.setRoot(newNode);//cambia la raiz por el nodo recien creado
                selectedNode = newNode;//el nodo a partir el cual estaremos trabajando sera este
            }
            if(tokens.get(i).getLexem().equals("Carpeta")){
                i++;
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tokens.get(i).getLexem());
                selectedNode.add(newNode);
                selectedNode = newNode;
                //modificar el model del arbol
            }
            if(tokens.get(i).getLexem().equals("FinCarpeta")){
                selectedNode = selectedNode.getPreviousNode();
            }
            if(tokens.get(i).getLexem().equals("Archivo")){
                i++;
                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(tokens.get(i).getLexem());
                selectedNode.add(newNode);
                i++;
                //inserte aqui el codigo para manejar el path
            }
        }
        return model;
    }
    
    public static void createIDEDocument(DefaultMutableTreeNode node){
        
    }
    
}
