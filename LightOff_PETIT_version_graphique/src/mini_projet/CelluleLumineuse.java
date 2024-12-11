/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet;

/**
 *
 * @author enzop
 */
public class CelluleLumineuse {
    // Attribut représentant l'état de la cellule (allumée ou éteinte)
    private boolean estAllumee;

    // Constructeur initialisant la cellule en état éteint
    public CelluleLumineuse() {
        estAllumee = false; // Cellule éteinte par défaut
    }

    // Méthode pour activer (allumer) la cellule
    public void activerCellule() {
        estAllumee = !estAllumee; // Inverse l'état de la cellule
    }

    // Méthode pour éteindre la cellule
    public void eteindreCellule() {
        estAllumee = false; // Éteint la cellule
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return !estAllumee;
    }

    // Méthode pour obtenir l'état brut de la cellule
    public boolean getEtat() {
        return estAllumee;
    }

    // Redéfinition de la méthode toString pour afficher l'état de la cellule
    @Override
    public String toString() {
        return estAllumee ? "X" : "O"; // "X" si allumée, "O" si éteinte
    }

    public void toggle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean estAllumee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

