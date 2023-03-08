package localux.technic;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

// Héritage de la classe de rendu par défaut d'une cellule d'un tableau Swing
public class CTableRendu extends DefaultTableCellRenderer {

    public CTableRendu() {
        // force la propriété opaque à vrai
        super.setOpaque(true);
    }

    // Redéfinit la méthode héritée : getTableCellRendererComponent
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // récupére le composant dans la classe mère
        Component cellComp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Passe la police en 12 / gras
        Font f = cellComp.getFont();
        cellComp.setFont(f.deriveFont(f.getStyle() | Font.BOLD, 12));

        // Initialise la couleur de la police : Si la ligne est paire ...
        if (row % 2 == 0) {
            cellComp.setForeground(new java.awt.Color(255, 255, 204));
        } else {
            cellComp.setForeground(new Color(252, 220, 49));
        }
        if(isSelected) {
            cellComp.setBackground(new java.awt.Color(255,255,255,120));
        } else {
            cellComp.setBackground(new java.awt.Color(255,255,255,0));
        }
        return cellComp;
    }

}
