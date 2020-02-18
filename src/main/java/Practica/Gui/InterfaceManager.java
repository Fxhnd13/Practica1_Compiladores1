/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica.Gui;

import Practica.Utilidades.ReaderFiles;
import Practica.Utilidades.TreeManager;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.JTree;

/**
 *
 * @author fxhnd
 */
public class InterfaceManager {
    
    public static String textoInicial = null;
    public static File archivoAbierto = null;
    
    public static String openProject(String text){
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = selector.showOpenDialog(null);
        String texto ="";
        if(resultado==0){    
            archivoAbierto = selector.getSelectedFile();
            if((archivoAbierto == null)||(archivoAbierto.getName().equals(""))){
                JOptionPane.showMessageDialog(null, "Nombre de archivo no valido","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                texto = ReaderFiles.readFile(archivoAbierto);
            }
        }
        return texto;
    }
    
    public static String openProyect(String text){
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = selector.showOpenDialog(null);
        if(resultado==0){    
            archivoAbierto = selector.getSelectedFile();
            if((archivoAbierto == null)||(archivoAbierto.getName().equals(""))){
                JOptionPane.showMessageDialog(null, "Nombre de archivo no valido","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                textoInicial = ReaderFiles.readFile(archivoAbierto);
            }
        }
        return textoInicial;
    }
    
    public static void saveProyect(String text, int opcion){
        if(archivoAbierto != null){
            ReaderFiles.overWriteFile(text, archivoAbierto);
        }else{
            JFileChooser selector = new JFileChooser();
            selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int resultado = selector.showOpenDialog(null);
            if(resultado==0){
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre:.");
                if(nombre != null){
                    if(!nombre.isEmpty()){
                        switch(opcion){
                            case 1: {
                                ReaderFiles.writeFile(text, selector.getSelectedFile(), nombre, ".IDE");
                                break;
                            }
                            case 2: {
                                ReaderFiles.writeFile(text, selector.getSelectedFile(), nombre, ".csv");
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese un nombre valido.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }
    
    public static void saveProyectAs(String text, int opcion){
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resultado = selector.showOpenDialog(null);
        if(resultado==0){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto.");
            if(nombre != null){
                if(!nombre.isEmpty()){
                    switch(opcion){
                        case 1: {
                            ReaderFiles.writeFile(text, selector.getSelectedFile(), nombre, ".IDE");
                            break;
                        }
                        case 2: {
                            ReaderFiles.writeFile(text, selector.getSelectedFile(), nombre, ".csv");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public static void crearArchivo(JTree Tree){
        if(Tree.getSelectionPath()!=null){    
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del documento.");
            if((nombre != null)||(!nombre.isEmpty())){
                TreeManager.addChild(nombre, Tree);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un nombre valido.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primero seleccione la ubicacion en la que desea crear el archivo","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void eliminarArchivo(JTree Tree){
        if(Tree.getSelectionPath()!=null){    
            TreeManager.removeChild(Tree);
        }else{
            JOptionPane.showMessageDialog(null, "Primero seleccione el archivo que desea eliminar","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void modificarNombre(JTree Tree){
        if(Tree.getSelectionPath()!=null){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre nuevo.");
            if((nombre != null)||(!nombre.isEmpty())){
                TreeManager.setNodeName(nombre, Tree);
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un nombre valido.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primero seleccione el archivo/carpeta/proyecto al que desea cambiar el nombre.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
