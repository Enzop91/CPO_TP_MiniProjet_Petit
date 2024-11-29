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
    // Attribut privé pour indiquer l'état de la cellule
    private boolean etat;

    // Constructeur par défaut, initialise la cellule à "éteinte" (false)
    public CelluleLumineuse() {
        this.etat = false;
    }

    // Méthode pour activer ou inverser l'état de la cellule
    public void activerCellule() {
        this.etat = !this.etat; // Inverse l'état actuel
    }

    // Méthode pour éteindre la cellule
    public void eteindreCellule() {
        this.etat = false; // Définit l'état à "éteinte"
    }

    // Méthode pour vérifier si la cellule est éteinte
    public boolean estEteint() {
        return !this.etat; // Retourne true si la cellule est éteinte
    }

    // Méthode pour obtenir l'état actuel de la cellule
    public boolean getEtat() {
        return this.etat; // Retourne l'état actuel (true ou false)
    }

    // Redéfinition de la méthode toString pour représenter l'état de la cellule
    @Override
    public String toString() {
        return this.etat ? "X" : "O"; // "X" si allumée, "O" si éteinte
    }
}
