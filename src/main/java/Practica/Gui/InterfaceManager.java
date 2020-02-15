/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica.Gui;

import Practica.Utilidades.ReaderFiles;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fxhnd
 */
public class InterfaceManager {
    
    public static String openProyect(){
        String texto = "";
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = selector.showOpenDialog(null);
        if(resultado==0){    
            File file = selector.getSelectedFile();
            if((file == null)||(file.getName().equals(""))){
                JOptionPane.showMessageDialog(null, "Nombre de archivo no valido","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                texto = ReaderFiles.readFile(file);
            }
        }
        return texto;
    }
    
    public static void saveProyect(String text){
        JFileChooser selector = new JFileChooser();
        selector.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resultado = selector.showOpenDialog(null);
        if(resultado==0){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto.");
            if(nombre != null){
                if(!nombre.isEmpty()){
                    ReaderFiles.writeFile(text, selector.getSelectedFile(), nombre);
                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese un nombre valido.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
