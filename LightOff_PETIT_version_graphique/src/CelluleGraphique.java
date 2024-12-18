
import java.awt.Graphics;
import javax.swing.JButton;
import mini_projet.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author louis
 */
    import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;

public class CelluleGraphique extends JButton {
    int largeur; // largeur en pixel de la cellule
    int hauteur; // hauteur en pixel de la cellule
    CelluleLumineuse celluleLumineuseAssociee;

    // Constructeur
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
        this.largeur = l;
        this.hauteur = h;
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.addActionListener(e -> toggleLight());
        this.setContentAreaFilled(false);
        this.setOpaque(true);
    }

    // Méthode pour basculer l'état de la lumière
    private void toggleLight() {
        celluleLumineuseAssociee.activerCellule(); // Utilisation de la méthode existante pour inverser l'état
        repaint();
    }
    

    // Méthode gérant le dessin de la cellule
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (celluleLumineuseAssociee.getEtat()) {
            setBackground(Color.GREEN); // Couleur quand la lumière est allumée
        } else {
            setBackground(Color.BLACK); // Couleur quand la lumière est éteinte
        }
    }
    
}


