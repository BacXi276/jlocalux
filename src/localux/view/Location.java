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
        addLSC = new javax.swing.JButton();
        locAbandonner = new javax.swing.JButton();
        addLAC = new javax.swing.JButton();
        titreGen = new javax.swing.JLabel();

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

        addLSC.setText("Ajouter LSC");
        addLSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLSCMouseClicked(evt);
            }
        });

        locAbandonner.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        locAbandonner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        locAbandonner.setText("Abandonner");
        locAbandonner.setToolTipText("Sortir de la fenétre d'envoi");
        locAbandonner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locAbandonnerMouseClicked(evt);
            }
        });

        addLAC.setText("Ajouter LAC");
        addLAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLACMouseClicked(evt);
            }
        });

        titreGen.setBackground(new java.awt.Color(255, 255, 255));
        titreGen.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        titreGen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreGen.setText("LOCATION");
        titreGen.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(locAbandonner)
                        .addGap(18, 18, 18)
                        .addComponent(titreGen, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addLSC)
                        .addGap(18, 18, 18)
                        .addComponent(addLAC)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollDataSys, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locAbandonner)
                    .addComponent(titreGen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLSC)
                    .addComponent(addLAC))
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 241, Short.MAX_VALUE)
                    .addComponent(scrollDataSys, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLSCMouseClicked
        LSC_Add lsc_add = new LSC_Add();
        lsc_add.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_addLSCMouseClicked

    private void addLACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLACMouseClicked
        LAC_Add lac_add = new LAC_Add();
        lac_add.setVisible(true);  
    }//GEN-LAST:event_addLACMouseClicked

    private void locAbandonnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locAbandonnerMouseClicked
        this.dispose();
    }//GEN-LAST:event_locAbandonnerMouseClicked

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
    private javax.swing.JButton addLAC;
    private javax.swing.JButton addLSC;
    private javax.swing.JButton locAbandonner;
    private javax.swing.JScrollPane scrollDataSys;
    private javax.swing.JTable tableVarSys;
    private javax.swing.JLabel titreGen;
    // End of variables declaration//GEN-END:variables
}
