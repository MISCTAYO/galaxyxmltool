/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltoolgui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author msproteo
 */
public class HelpToolexample extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form HelpToolexample
     */
    public HelpToolexample() {
        setTitle("Tool Example Help");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        this.getContentPane().setBackground(new Color(115, 115, 115));
        UIManager.put("ComboBox.background", new Color(150,148,13));
        UIManager.put("TextField.background", new Color(150,148,13));
        UIManager.put("TextField.foreground", new Color(255,255,255));
        UIManager.put("Button.background",new Color(43, 49, 67));
        UIManager.put("Button.background",new Color(43, 49, 67));
        UIManager.put("Label.foreground ",new Color(150,148,13));
        UIManager.put("TextArea.background", new Color(150,148,13));
        this.setAlwaysOnTop(true);
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        helpinputfilesexample = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        helpinputfilesexampleparameters = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        helpoutputfilesexample = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        helpmoreinformations = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Working Example");

        jLabel6.setText("Input Files");

        helpinputfilesexample.setColumns(20);
        helpinputfilesexample.setRows(5);
        helpinputfilesexample.setText("| **These input files can be used in the purview \"URL/Text:\" of the tool \"Get Data/Upload File\",**\n| **by checking the box \"Convert spaces to tabs: YES\"**\n\nfile1.txt\n\tModel input file::\n\t\n\t\tcolonne1 colonne2 col3 etc\n\t\telement1.1 element1.2 el1.3 ...\n\t\telement2.1 elem2.2 el1.3 ...\n\t\telem3.1 3.2 el1.3 ...");
        helpinputfilesexample.setAutoscrolls(false);
        jScrollPane4.setViewportView(helpinputfilesexample);

        jLabel7.setText("Parameters");

        helpinputfilesexampleparameters.setColumns(20);
        helpinputfilesexampleparameters.setRows(5);
        helpinputfilesexampleparameters.setText("Parameter 1  -> **content**\n\nParameter 2  -> **content**");
        helpinputfilesexampleparameters.setAutoscrolls(false);
        jScrollPane5.setViewportView(helpinputfilesexampleparameters);

        jLabel8.setText("Output Files");

        helpoutputfilesexample.setColumns(20);
        helpoutputfilesexample.setRows(5);
        helpoutputfilesexample.setText("output.pdf\n.. image:: ./static/images/output.png\n        :width: 500\n        :height: 400\n\noutput.txt\n========== ========== ===== ===\ncolonne1   colonne 2  col3  etc\n========== ========== ===== ===\nelement1.1 element1.2 el1.3 ...\nelement2.1 elem 2.2   el1.3 ...\nelem3.1       3.2     el1.3 ...\n========== ========== ===== ===\noutput.other::\n\tSomething");
        helpoutputfilesexample.setAutoscrolls(false);
        jScrollPane6.setViewportView(helpoutputfilesexample);

        jLabel9.setText("More Details");

        helpmoreinformations.setColumns(20);
        helpmoreinformations.setRows(5);
        helpmoreinformations.setText("More information about formatting can be found here: \nhttp://docutils.sourceforge.net/docs/ref/rst/restructuredtext.html");
        helpmoreinformations.setAutoscrolls(false);
        jScrollPane7.setViewportView(helpmoreinformations);

        jButton1.setText("Validate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    	GalaxyToolMain.toolhelp.setHelpinputfilesexample(helpinputfilesexample.getText());
    	GalaxyToolMain.toolhelp.setHelpinputfilesexampleparameters(helpinputfilesexampleparameters.getText());
    	GalaxyToolMain.toolhelp.setHelpoutputfilesexample(helpoutputfilesexample.getText());
    	GalaxyToolMain.toolhelp.setHelpmoreinformations(helpmoreinformations.getText());
    	this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HelpToolexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpToolexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpToolexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpToolexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpToolexample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea helpinputfilesexample;
    private javax.swing.JTextArea helpinputfilesexampleparameters;
    private javax.swing.JTextArea helpmoreinformations;
    private javax.swing.JTextArea helpoutputfilesexample;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
