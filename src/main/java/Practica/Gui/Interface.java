/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica.Gui;

import Practica.Analisis.CSV.LexerCSV;
import Practica.Analisis.CSV.ParserCSV;
import Practica.Analisis.IDE.LexerIDE;
import Practica.Analisis.IDE.ParserIDE;
import Practica.Analisis.SQL.LexerSQL;
import Practica.Analisis.SQL.ParserSQL;
import static Practica.Gui.InterfaceManager.archivoAbierto;
import static Practica.Gui.InterfaceManager.textoInicial;
import Practica.Objetos.Token;
import Practica.Utilidades.ReaderFiles;
import Practica.Utilidades.TreeManager;
import java.awt.Color;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author fxhnd
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoErrores = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextDialog = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HacerArbolButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextoProyecto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        AnalizarCSVButton = new javax.swing.JButton();
        AnalizarSQLButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextSQL = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AbrirProyectoButton = new javax.swing.JMenuItem();
        GuardarProyectoButton = new javax.swing.JMenuItem();
        GuardarProyectoComoButton = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CrearArchivoButton = new javax.swing.JMenuItem();
        EliminarArchivoButton = new javax.swing.JMenuItem();
        CambiarNombreArchivoButton = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        DialogoErrores.setSize(new java.awt.Dimension(800, 300));

        TextDialog.setColumns(20);
        TextDialog.setRows(5);
        jScrollPane3.setViewportView(TextDialog);

        javax.swing.GroupLayout DialogoErroresLayout = new javax.swing.GroupLayout(DialogoErrores.getContentPane());
        DialogoErrores.getContentPane().setLayout(DialogoErroresLayout);
        DialogoErroresLayout.setHorizontalGroup(
            DialogoErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        DialogoErroresLayout.setVerticalGroup(
            DialogoErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("<Sin Proyecto>");
        Tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tree);

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane2.setViewportView(Text);

        jLabel1.setText("Orden SQL");

        jLabel2.setText("Archivo CSV Abierto");

        HacerArbolButton.setText("Hacer Arbol");
        HacerArbolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HacerArbolButtonActionPerformed(evt);
            }
        });

        TextoProyecto.setEditable(false);
        TextoProyecto.setColumns(20);
        TextoProyecto.setRows(5);
        jScrollPane4.setViewportView(TextoProyecto);

        jLabel3.setText("Estructura proyecto abierto");

        AnalizarCSVButton.setText("Analizar csv");
        AnalizarCSVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarCSVButtonActionPerformed(evt);
            }
        });

        AnalizarSQLButton.setText("Analizar SQL");
        AnalizarSQLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarSQLButtonActionPerformed(evt);
            }
        });

        TextSQL.setColumns(20);
        TextSQL.setRows(5);
        jScrollPane5.setViewportView(TextSQL);

        jMenu1.setText("Proyecto");

        AbrirProyectoButton.setText("Abrir");
        AbrirProyectoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirProyectoButtonActionPerformed(evt);
            }
        });
        jMenu1.add(AbrirProyectoButton);

        GuardarProyectoButton.setText("Guardar");
        GuardarProyectoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProyectoButtonActionPerformed(evt);
            }
        });
        jMenu1.add(GuardarProyectoButton);

        GuardarProyectoComoButton.setText("Guardar Como...");
        GuardarProyectoComoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProyectoComoButtonActionPerformed(evt);
            }
        });
        jMenu1.add(GuardarProyectoComoButton);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Archivo");

        CrearArchivoButton.setText("Crear");
        CrearArchivoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearArchivoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(CrearArchivoButton);

        EliminarArchivoButton.setText("Eliminar");
        EliminarArchivoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarArchivoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(EliminarArchivoButton);

        CambiarNombreArchivoButton.setText("Cambiar Nombre");
        CambiarNombreArchivoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarNombreArchivoButtonActionPerformed(evt);
            }
        });
        jMenu2.add(CambiarNombreArchivoButton);

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(HacerArbolButton)
                                .addGap(18, 18, 18)
                                .addComponent(AnalizarCSVButton)
                                .addGap(18, 18, 18)
                                .addComponent(AnalizarSQLButton)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HacerArbolButton)
                                .addComponent(AnalizarCSVButton)
                                .addComponent(AnalizarSQLButton)))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreeMouseClicked
        
    }//GEN-LAST:event_TreeMouseClicked

    private void AbrirProyectoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirProyectoButtonActionPerformed
        this.TextoProyecto.setText(InterfaceManager.openProject(TextoProyecto.getText()));
    }//GEN-LAST:event_AbrirProyectoButtonActionPerformed

    private void GuardarProyectoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProyectoButtonActionPerformed
        InterfaceManager.saveProyect(this.TextoProyecto.getText(),1);
    }//GEN-LAST:event_GuardarProyectoButtonActionPerformed

    private void CrearArchivoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearArchivoButtonActionPerformed
        InterfaceManager.crearArchivo(Tree);
        TextoProyecto.setText(TreeManager.createIDEDocument((DefaultMutableTreeNode) Tree.getModel().getRoot(),0));
    }//GEN-LAST:event_CrearArchivoButtonActionPerformed

    private void EliminarArchivoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarArchivoButtonActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Se han detectado cambios en el archivo abierto actualmente, ¿desea guardarlos?", "Advertencia", JOptionPane.WARNING_MESSAGE);
        if(opcion == JOptionPane.OK_OPTION){
            InterfaceManager.eliminarArchivo(Tree);
        }
        TextoProyecto.setText(TreeManager.createIDEDocument((DefaultMutableTreeNode) Tree.getModel().getRoot(),0));
    }//GEN-LAST:event_EliminarArchivoButtonActionPerformed

    private void HacerArbolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HacerArbolButtonActionPerformed
        String texto = this.TextoProyecto.getText(); //obtiene el texto del textArea
        LexerIDE lexer = new LexerIDE(new StringReader(texto));
        lexer.analizar();//analiza lexicamente 
        ParserIDE parser = null;
        try {
            if(lexer.getErrores().isEmpty()){//si no hay errores lexicos entonces analiza sintacticamente
                parser = new ParserIDE(new LexerIDE(new StringReader(texto)));
                parser.parse();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo errores", "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            if(lexer.getErrores().isEmpty()&&parser.getErrores().isEmpty()){//si no hay errores lexicos ni sintacticos arma el arbol
                Tree.setModel(TreeManager.createJTree(new LexerIDE(new StringReader(texto))));
            }else{
                if(lexer.getErrores().isEmpty()){
                    mostrarErroresSintacticos(parser.getErrores());//si hay errores y no son lexicos entonces muestra los erroers sintacticos
                }else{
                    MostrarErroresLexicos(lexer.getErrores());//si hay errores lexicos los muestra
                }
            }
        }
    }//GEN-LAST:event_HacerArbolButtonActionPerformed

    private void CambiarNombreArchivoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarNombreArchivoButtonActionPerformed
        InterfaceManager.modificarNombre(Tree);
        if(Tree.getModel().getRoot()!=null){
            TextoProyecto.setText(TreeManager.createIDEDocument((DefaultMutableTreeNode) Tree.getModel().getRoot(),0));
        }
    }//GEN-LAST:event_CambiarNombreArchivoButtonActionPerformed

    private void GuardarProyectoComoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProyectoComoButtonActionPerformed
        InterfaceManager.saveProyectAs(TextoProyecto.getText(), 1);
    }//GEN-LAST:event_GuardarProyectoComoButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.Text.setText(InterfaceManager.openProyect(Text.getText()));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        InterfaceManager.saveProyect(this.Text.getText(), 2);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void AnalizarCSVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarCSVButtonActionPerformed
        String texto = this.Text.getText(); //obtiene el texto del textArea
        LexerCSV lexer = new LexerCSV(new StringReader(texto));
        lexer.analizar();//analiza lexicamente 
        ParserCSV parser = null;
        try {
            if(lexer.getErrores().isEmpty()){//si no hay errores lexicos entonces analiza sintacticamente
                parser = new ParserCSV(new LexerCSV(new StringReader(texto)));
                parser.parse();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo errores", "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            if(lexer.getErrores().isEmpty()&&parser.getErrores().isEmpty()){//si no hay errores lexicos ni sintacticos arma el arbol
                JOptionPane.showMessageDialog(null, "Se ha analizado con éxito, no hay errores.");
            }else{
                if(lexer.getErrores().isEmpty()){
                    mostrarErroresSintacticos(parser.getErrores());//si hay errores y no son lexicos entonces muestra los erroers sintacticos
                }else{
                    MostrarErroresLexicos(lexer.getErrores());//si hay errores lexicos los muestra
                }
            }
        }
    }//GEN-LAST:event_AnalizarCSVButtonActionPerformed

    private void AnalizarSQLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarSQLButtonActionPerformed
        String texto = this.TextSQL.getText(); //obtiene el texto del textArea
        LexerSQL lexer = new LexerSQL(new StringReader(texto));
        lexer.analizar();//analiza lexicamente 
        ParserSQL parser = null;
        try {
            if(lexer.getErrores().isEmpty()){//si no hay errores lexicos entonces analiza sintacticamente
                parser = new ParserSQL(new LexerSQL(new StringReader(texto)));
                parser.parse();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo errores", "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            if(lexer.getErrores().isEmpty()&&parser.getErrores().isEmpty()){//si no hay errores lexicos ni sintacticos arma el arbol
                JOptionPane.showMessageDialog(null, "Se ha analizado con éxito, no hay errores.");
            }else{
                if(lexer.getErrores().isEmpty()){
                    mostrarErroresSintacticos(parser.getErrores());//si hay errores y no son lexicos entonces muestra los erroers sintacticos
                }else{
                    MostrarErroresLexicos(lexer.getErrores());//si hay errores lexicos los muestra
                }
            }
        }
    }//GEN-LAST:event_AnalizarSQLButtonActionPerformed
    
    public void MostrarErroresLexicos(ArrayList<Token> errores){
        String texto = this.TextDialog.getText();
        for (Token token : errores) {
            texto+="Token:("+token.getType()+")|Lexema:("+token.getLexem()+")|Columna:("+token.getColumn()+")|Linea:("+token.getLine()+")\n";
        }
        this.TextDialog.setText(texto);
        this.TextDialog.setForeground(Color.RED);
        this.DialogoErrores.setVisible(true);
    }
    
    public void mostrarErroresSintacticos(ArrayList<String> errores){
        String texto = this.TextDialog.getText();
        for (String text : errores) {
            texto+=text+")\n";
        }
        this.TextDialog.setText(texto);
        this.TextDialog.setForeground(Color.RED);
        this.DialogoErrores.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirProyectoButton;
    private javax.swing.JButton AnalizarCSVButton;
    private javax.swing.JButton AnalizarSQLButton;
    private javax.swing.JMenuItem CambiarNombreArchivoButton;
    private javax.swing.JMenuItem CrearArchivoButton;
    private javax.swing.JDialog DialogoErrores;
    private javax.swing.JMenuItem EliminarArchivoButton;
    private javax.swing.JMenuItem GuardarProyectoButton;
    private javax.swing.JMenuItem GuardarProyectoComoButton;
    private javax.swing.JButton HacerArbolButton;
    private javax.swing.JTextArea Text;
    private javax.swing.JTextArea TextDialog;
    private javax.swing.JTextArea TextSQL;
    private javax.swing.JTextArea TextoProyecto;
    private javax.swing.JTree Tree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
