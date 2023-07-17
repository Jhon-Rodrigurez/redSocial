/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.unab.pubunab.vistas;

/**
 *
 * @author ingel
 */
public class JFrameMuro extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMruo
     */
    public JFrameMuro() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jpMuro = new javax.swing.JPanel();
        jlImagen = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jbVer = new javax.swing.JButton();
        jspContenido = new javax.swing.JScrollPane();
        jtaContenido = new javax.swing.JTextArea();
        jlMegusta = new javax.swing.JLabel();
        jlComentario = new javax.swing.JLabel();
        jlCompartir = new javax.swing.JLabel();
        jbMegusta = new javax.swing.JButton();
        jbComentar = new javax.swing.JButton();
        jbCompartir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMuro.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpMuro.add(jlImagen, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpMuro.add(jlNombre, gridBagConstraints);

        jbVer.setText("Ver");
        jbVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jpMuro.add(jbVer, gridBagConstraints);

        jtaContenido.setEditable(false);
        jtaContenido.setColumns(20);
        jtaContenido.setRows(5);
        jspContenido.setViewportView(jtaContenido);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jspContenido, gridBagConstraints);

        jlMegusta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMegusta.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jlMegusta, gridBagConstraints);

        jlComentario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlComentario.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jlComentario, gridBagConstraints);

        jlCompartir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCompartir.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jlCompartir, gridBagConstraints);

        jbMegusta.setText("Me gusta");
        jbMegusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMegustaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jbMegusta, gridBagConstraints);

        jbComentar.setText("Comentario");
        jbComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComentarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jbComentar, gridBagConstraints);

        jbCompartir.setText("Compartir");
        jbCompartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompartirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        jpMuro.add(jbCompartir, gridBagConstraints);

        getContentPane().add(jpMuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbVerActionPerformed

    private void jbMegustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMegustaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMegustaActionPerformed

    private void jbComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComentarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbComentarActionPerformed

    private void jbCompartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompartirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCompartirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMuro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbComentar;
    public javax.swing.JButton jbCompartir;
    public javax.swing.JButton jbMegusta;
    public javax.swing.JButton jbVer;
    public javax.swing.JLabel jlComentario;
    public javax.swing.JLabel jlCompartir;
    public javax.swing.JLabel jlImagen;
    public javax.swing.JLabel jlMegusta;
    public javax.swing.JLabel jlNombre;
    public javax.swing.JPanel jpMuro;
    public javax.swing.JScrollPane jspContenido;
    public javax.swing.JTextArea jtaContenido;
    // End of variables declaration//GEN-END:variables
}