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
    // Attributs de la classe
    public CelluleLumineuse[][] matriceCellules; // Matrice de cellules lumineuses
    private int nbLignes; // Nombre de lignes de la grille
    private int nbColonnes; // Nombre de colonnes de la grille

    // Constructeur de la classe
    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la grille avec des cellules lumineuses
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    // Méthode pour éteindre toutes les cellules de la grille
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    // Méthode pour activer (allumer) une ligne de cellules
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    // Méthode pour activer (allumer) une colonne de cellules
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    // Méthode pour activer (allumer) la diagonale descendante
    public void activerDiagonaleDescendante() {
        int minDimension = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDimension; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    // Méthode pour activer (allumer) la diagonale montante
    public void activerDiagonaleMontante() {
        int minDimension = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDimension; i++) {
            matriceCellules[i][minDimension - 1 - i].activerCellule();
        }
    }

    // Méthode pour activer aléatoirement une ligne, colonne ou diagonale
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4); // 0, 1, 2, ou 3

        switch (choix) {
            case 0:
                activerLigneDeCellules(random.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(random.nextInt(nbColonnes));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }

    // Méthode pour mélanger la grille de manière aléatoire
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    // Méthode pour vérifier si toutes les cellules sont éteintes
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    // Redéfinition de la méthode toString pour afficher la grille de manière organisée
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("   ");
        for (int j = 0; j < nbColonnes; j++) {
            builder.append("| " + j + " ");
        }
        builder.append("|\n");

        for (int i = 0; i < nbLignes; i++) {
            builder.append("---");
            for (int j = 0; j < nbColonnes; j++) {
                builder.append("----");
            }
            builder.append("\n");

            builder.append(i + "  ");
            for (int j = 0; j < nbColonnes; j++) {
                builder.append("| " + matriceCellules[i][j].toString() + " ");
            }
            builder.append("|\n");
        }
        builder.append("---");
        for (int j = 0; j < nbColonnes; j++) {
            builder.append("----");
        }
        builder.append("\n");

        return builder.toString();
    }

    public void toggleEtatEtVoisins(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int nblignes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int nbcolonnes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



