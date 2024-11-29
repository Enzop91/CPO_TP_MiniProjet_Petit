/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet;

import java.util.Random;

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

 public void activerLigneDeCellules(int idLigne) {
    for (int j = 0; j < matriceCellules[idLigne].length; j++) {
        matriceCellules[idLigne][j].activerCellule();
    }
}
public void activerColonneDeCellules(int idColonne) {
    for (int i = 0; i < matriceCellules.length; i++) {
        matriceCellules[i][idColonne].activerCellule();
    }
}
public void activerDiagonaleDescendante() {
    int minDimension = Math.min(matriceCellules.length, matriceCellules[0].length);
    for (int i = 0; i < minDimension; i++) {
        matriceCellules[i][i].activerCellule();
    }
}
public void activerDiagonaleMontante() {
    int minDimension = Math.min(matriceCellules.length, matriceCellules[0].length);
    for (int i = 0; i < minDimension; i++) {
        matriceCellules[i][minDimension - 1 - i].activerCellule();
    }
}
public void activerLigneColonneOuDiagonaleAleatoire() {
    Random random = new Random();
    int choix = random.nextInt(4); // 0, 1, 2, ou 3

    switch (choix) {
        case 0:
            activerLigneDeCellules(random.nextInt(matriceCellules.length));
            break;
        case 1:
            activerColonneDeCellules(random.nextInt(matriceCellules[0].length));
            break;
        case 2:
            activerDiagonaleDescendante();
            break;
        case 3:
            activerDiagonaleMontante();
            break;
    }
}
public void melangerMatriceAleatoirement(int nbTours) {
    for (int i = 0; i < nbTours; i++) {
        activerLigneColonneOuDiagonaleAleatoire();
    }
}
   
}

