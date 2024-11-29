/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet;

/**
 *
 * @author louis
 */
public class GrilleDeCellules {
    // Attribut : Matrice contenant les références aux cellules lumineuses
    private CelluleLumineuse[][] matriceCellules;

    // Constructeur
    public GrilleDeCellules(int lignes, int colonnes) {
        // Initialisation de la matrice
        matriceCellules = new CelluleLumineuse[lignes][colonnes];
        
        // Création de chaque cellule lumineuse dans la matrice
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }
    
    // Redéfinition de toString pour afficher la grille
    @Override
public String toString() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < matriceCellules.length; i++) {
        for (int j = 0; j < matriceCellules[i].length; j++) {
            builder.append(matriceCellules[i][j].toString()).append(" ");
        }
        builder.append("\n");
    }
    return builder.toString();
}

    
}

