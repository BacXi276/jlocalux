/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package localux.view;

/**
 *
 * @author b.bailly
 */
public class Vehicule_Add extends javax.swing.JFrame {

    /**
     * Creates new form Vehicule_Add
     */
    public Vehicule_Add() {
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

        Vehicule_AddAbandonner = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Vehicule_AddImmat = new javax.swing.JTextField();
        Vehicule_AddDateAchat = new javax.swing.JTextField();
        Vehicule_AddNumLoc = new javax.swing.JTextField();
        Vehicule_AddValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vehicule_AddAbandonner.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Vehicule_AddAbandonner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        Vehicule_AddAbandonner.setText("Abandonner");
        Vehicule_AddAbandonner.setToolTipText("Sortir de la fenétre d'envoi");
        Vehicule_AddAbandonner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vehicule_AddAbandonnerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Vehicule_AddAbandonnerMouseEntered(evt);
            }
        });

        jLabel2.setText("Ajouter Véhicule");

        jLabel1.setText("Immatriculation:");

        jLabel3.setText("Date Achat:");

        jLabel4.setText("Num Location:");

        Vehicule_AddImmat.setText("jTextField1");

        Vehicule_AddDateAchat.setText("jTextField1");

        Vehicule_AddNumLoc.setText("jTextField1");

        Vehicule_AddValider.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Vehicule_AddValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/valid_20.png"))); // NOI18N
        Vehicule_AddValider.setText("Valider");
        Vehicule_AddValider.setToolTipText("Envoyer le mail à son destinataire");
        Vehicule_AddValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vehicule_AddValiderMouseClicked(evt);
            }
        });
        Vehicule_AddValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehicule_AddValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Vehicule_AddAbandonner)
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(Vehicule_AddValider)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vehicule_AddNumLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vehicule_AddImmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vehicule_AddDateAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicule_AddAbandonner)
                    .addComponent(jLabel2)
                    .addComponent(Vehicule_AddValider))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicule_AddImmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicule_AddDateAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vehicule_AddNumLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Vehicule_AddAbandonnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vehicule_AddAbandonnerMouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_Vehicule_AddAbandonnerMouseClicked

    private void Vehicule_AddAbandonnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vehicule_AddAbandonnerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Vehicule_AddAbandonnerMouseEntered

    private void Vehicule_AddValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vehicule_AddValiderMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Vehicule_AddValiderMouseClicked

    private void Vehicule_AddValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehicule_AddValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Vehicule_AddValiderActionPerformed

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
            java.util.logging.Logger.getLogger(Vehicule_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicule_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicule_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicule_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicule_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Vehicule_AddAbandonner;
    private javax.swing.JTextField Vehicule_AddDateAchat;
    private javax.swing.JTextField Vehicule_AddImmat;
    private javax.swing.JTextField Vehicule_AddNumLoc;
    private javax.swing.JButton Vehicule_AddValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
