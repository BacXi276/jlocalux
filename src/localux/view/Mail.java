package localux.view;

/**
 *
 * @author patrick DUPRE
 */
import localux.technic.GestionSMTP;

// https://www.journaldev.com/2532/javamail-example-send-mail-in-java-smtp
public class Mail extends javax.swing.JDialog {

    /**
     * Creates new form mail
     *
     * @param destinataire
     */
    private GestionSMTP gestionMail;

    public Mail() {
        initComponents();
        scrollPane.getViewport().setOpaque(false);
        this.gestionMail = new GestionSMTP();
    }

    public Mail(String leDestinataire) {
        initComponents();
        scrollPane.getViewport().setOpaque(false);
        this.gestionMail = new GestionSMTP();
        destinataire.setText(leDestinataire);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Entete = new javax.swing.JLabel();
        abandonner = new javax.swing.JButton();
        envoyer = new javax.swing.JButton();
        labelMail = new javax.swing.JLabel();
        destinataire = new javax.swing.JTextField();
        labelObjet = new javax.swing.JLabel();
        objet = new javax.swing.JTextField();
        jLabelMsg = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        leMessage = new javax.swing.JTextArea();
        uiBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("view.Mail");
        setMinimumSize(new java.awt.Dimension(700, 470));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);

        Entete.setBackground(new java.awt.Color(255,255,255,120));
        Entete.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Entete.setForeground(new java.awt.Color(255, 0, 0));
        Entete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/java_64.png"))); // NOI18N
        Entete.setText("Envoyer un mail");
        Entete.setIconTextGap(22);
        Entete.setOpaque(true);
        getContentPane().add(Entete);
        Entete.setBounds(0, 0, 699, 71);

        abandonner.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        abandonner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        abandonner.setText("Abandonner");
        abandonner.setToolTipText("Sortir de la fenétre d'envoi");
        abandonner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abandonnerMouseClicked(evt);
            }
        });
        getContentPane().add(abandonner);
        abandonner.setBounds(542, 390, 132, 30);

        envoyer.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        envoyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/valid_20.png"))); // NOI18N
        envoyer.setText("Envoyer");
        envoyer.setToolTipText("Envoyer le mail à son destinataire");
        envoyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                envoyerMouseClicked(evt);
            }
        });
        getContentPane().add(envoyer);
        envoyer.setBounds(12, 390, 106, 30);

        labelMail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelMail.setForeground(new java.awt.Color(252, 220, 49));
        labelMail.setText("Destinataire");
        getContentPane().add(labelMail);
        labelMail.setBounds(12, 86, 94, 24);

        destinataire.setBackground(new java.awt.Color(255,255,255,120));
        destinataire.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        destinataire.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(destinataire);
        destinataire.setBounds(118, 83, 569, 32);

        labelObjet.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labelObjet.setForeground(new java.awt.Color(252, 220, 49));
        labelObjet.setText("Objet . . . . :");
        getContentPane().add(labelObjet);
        labelObjet.setBounds(12, 124, 94, 24);

        objet.setBackground(new java.awt.Color(255,255,255,120));
        objet.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        objet.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(objet);
        objet.setBounds(118, 121, 569, 32);

        jLabelMsg.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelMsg.setForeground(new java.awt.Color(252, 220, 49));
        jLabelMsg.setText("Mail . . . . . :");
        getContentPane().add(jLabelMsg);
        jLabelMsg.setBounds(12, 171, 94, 24);

        scrollPane.setBackground(new java.awt.Color(255,255,255,70));

        leMessage.setBackground(new java.awt.Color(255,255,255,120));
        leMessage.setColumns(20);
        leMessage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        leMessage.setForeground(new java.awt.Color(255, 255, 255));
        leMessage.setRows(5);
        scrollPane.setViewportView(leMessage);

        getContentPane().add(scrollPane);
        scrollPane.setBounds(118, 171, 569, 176);

        uiBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/fec_dark.jpg"))); // NOI18N
        uiBackground.setMaximumSize(new java.awt.Dimension(700, 430));
        uiBackground.setMinimumSize(new java.awt.Dimension(700, 430));
        uiBackground.setPreferredSize(new java.awt.Dimension(700, 430));
        getContentPane().add(uiBackground);
        uiBackground.setBounds(0, 0, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void abandonnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonnerMouseClicked
            // TODO add your handling code here:
            gestionMail.closeSMTPCon();
            gestionMail = null;
            this.dispose();
        }//GEN-LAST:event_abandonnerMouseClicked

    @SuppressWarnings("CallToPrintStackTrace")
        private void envoyerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envoyerMouseClicked
        // TODO add your handling code here:
        gestionMail.setMailTo(destinataire.getText().strip());
        gestionMail.setMailObj(objet.getText().strip());
        gestionMail.setMailMsg(leMessage.getText());// "UTF-8");
        try {
            gestionMail.sendMsg();
        } catch (Exception ev) {
            ev.printStackTrace();
        }

        }//GEN-LAST:event_envoyerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entete;
    private javax.swing.JButton abandonner;
    private javax.swing.JTextField destinataire;
    private javax.swing.JButton envoyer;
    private javax.swing.JLabel jLabelMsg;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelObjet;
    private javax.swing.JTextArea leMessage;
    private javax.swing.JTextField objet;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel uiBackground;
    // End of variables declaration//GEN-END:variables
}
