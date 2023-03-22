package localux.view;

import localux.DAO.UtilisateurDAO;
import localux.model.Utilisateur;

public class Login extends javax.swing.JFrame {

    public Login() {
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

        jDialog1 = new javax.swing.JDialog();
        Entete = new javax.swing.JLabel();
        connecter = new javax.swing.JButton();
        labelPseudo = new javax.swing.JLabel();
        uiPseudo = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        uiPass = new javax.swing.JPasswordField();
        uiBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("view.Login");
        setMinimumSize(new java.awt.Dimension(577, 392));
        setResizable(false);
        getContentPane().setLayout(null);

        Entete.setBackground(new java.awt.Color(255,255,255,120));
        Entete.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Entete.setForeground(new java.awt.Color(255, 0, 0));
        Entete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/java_64.png"))); // NOI18N
        Entete.setText("Se connecter");
        Entete.setIconTextGap(22);
        Entete.setOpaque(true);
        getContentPane().add(Entete);
        Entete.setBounds(0, 0, 580, 71);

        connecter.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        connecter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/valid_20.png"))); // NOI18N
        connecter.setText("Connexion");
        connecter.setToolTipText("Envoyer le mail à son destinataire");
        connecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connecterMouseClicked(evt);
            }
        });
        getContentPane().add(connecter);
        connecter.setBounds(240, 250, 130, 26);

        labelPseudo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelPseudo.setForeground(new java.awt.Color(252, 220, 49));
        labelPseudo.setText("Utilisateur :");
        getContentPane().add(labelPseudo);
        labelPseudo.setBounds(100, 140, 100, 24);

        uiPseudo.setBackground(new java.awt.Color(255,255,255,120));
        uiPseudo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        uiPseudo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(uiPseudo);
        uiPseudo.setBounds(200, 140, 240, 32);

        labelPass.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelPass.setForeground(new java.awt.Color(252, 220, 49));
        labelPass.setText("Mot de passe :");
        getContentPane().add(labelPass);
        labelPass.setBounds(100, 180, 100, 24);

        uiPass.setBackground(new java.awt.Color(255,255,255,120));
        uiPass.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        uiPass.setForeground(new java.awt.Color(255, 255, 255));
        uiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uiPassActionPerformed(evt);
            }
        });
        getContentPane().add(uiPass);
        uiPass.setBounds(200, 180, 240, 32);

        uiBackground.setBackground(new java.awt.Color(255,255,255,70));
        uiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/fec_dark.jpg"))); // NOI18N
        uiBackground.setMaximumSize(new java.awt.Dimension(700, 430));
        uiBackground.setMinimumSize(new java.awt.Dimension(700, 430));
        uiBackground.setPreferredSize(new java.awt.Dimension(700, 430));
        getContentPane().add(uiBackground);
        uiBackground.setBounds(0, 0, 580, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void connecterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connecterMouseClicked
        // TODO add your handling code here:
        Utilisateur ut = UtilisateurDAO.loginUtilisateur(this.uiPseudo.getText(), this.uiPass.getPassword());
        if(ut.getUtPseudo()==null) {
            this.uiPseudo.setText("");
            this.uiPass.setText("");
        } else {
            MainMenu menu = new MainMenu(ut);
            menu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_connecterMouseClicked

    private void uiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uiPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uiPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entete;
    private javax.swing.JButton connecter;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPseudo;
    private javax.swing.JLabel uiBackground;
    private javax.swing.JPasswordField uiPass;
    private javax.swing.JTextField uiPseudo;
    // End of variables declaration//GEN-END:variables
}
