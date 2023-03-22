/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package localux.view;

/**
 *
 * @author b.bailly
 */
public class Location extends javax.swing.JFrame {

    /**
     * Creates new form Location
     */
    public Location() {
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

        scrollDataSys = new javax.swing.JScrollPane();
        tableVarSys = new javax.swing.JTable();
        entete = new javax.swing.JPanel();
        logoLCN = new javax.swing.JLabel();
        titreGen = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollDataSys.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        scrollDataSys.setOpaque(false);

        tableVarSys.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tableVarSys.setForeground(new java.awt.Color(255, 255, 255));
        tableVarSys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VARIABLE SYSTÈME", "CONTENU DE LA VARIABLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVarSys.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tableVarSys.setGridColor(new java.awt.Color(255, 255, 255));
        tableVarSys.setOpaque(false);
        tableVarSys.getTableHeader().setResizingAllowed(false);
        tableVarSys.getTableHeader().setReorderingAllowed(false);
        scrollDataSys.setViewportView(tableVarSys);

        entete.setBackground(new java.awt.Color(255, 255, 255));
        entete.setOpaque(false);

        logoLCN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/btslcn_x100.png"))); // NOI18N

        titreGen.setBackground(new java.awt.Color(255, 255, 255));
        titreGen.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        titreGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreGen.setText("Projet client lourd et ressources en Java");
        titreGen.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        adresse.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        adresse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adresse.setText("<html><center>BTS SIO SLAM<br>\n\nLycée Claude Nougaro<br>\n\n82300 MONTEILS</center></html>"); // NOI18N

        javax.swing.GroupLayout enteteLayout = new javax.swing.GroupLayout(entete);
        entete.setLayout(enteteLayout);
        enteteLayout.setHorizontalGroup(
            enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enteteLayout.createSequentialGroup()
                .addGap(0, 104, Short.MAX_VALUE)
                .addComponent(titreGen, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(enteteLayout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(logoLCN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(enteteLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        enteteLayout.setVerticalGroup(
            enteteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enteteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titreGen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoLCN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(entete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollDataSys, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(entete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(scrollDataSys, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Location().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresse;
    private javax.swing.JPanel entete;
    private javax.swing.JLabel logoLCN;
    private javax.swing.JScrollPane scrollDataSys;
    private javax.swing.JTable tableVarSys;
    private javax.swing.JLabel titreGen;
    // End of variables declaration//GEN-END:variables
}
