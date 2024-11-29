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
import java.util.Random;

import java.util.Random;

public class GrilleDeCellules {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        int minDimension = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDimension; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        int minDimension = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDimension; i++) {
            matriceCellules[i][minDimension - 1 - i].activerCellule();
        }
    }

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

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

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

    public static void main(String[] args) {
        GrilleDeCellules grille = new GrilleDeCellules(7, 7);

        System.out.println("Grille initiale :");
        System.out.println(grille);

        grille.activerLigneDeCellules(2);
        System.out.println("Après activation de la ligne 2 :");
        System.out.println(grille);

        grille.activerColonneDeCellules(1);
        System.out.println("Après activation de la colonne 1 :");
        System.out.println(grille);

        grille.activerDiagonaleDescendante();
        System.out.println("Après activation de la diagonale descendante :");
        System.out.println(grille);

        grille.activerDiagonaleMontante();
        System.out.println("Après activation de la diagonale montante :");
        System.out.println(grille);

        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Après activation aléatoire :");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(10);
        System.out.println("Après mélange de la matrice (10 tours) :");
        System.out.println(grille);

        System.out.println("Toutes les cellules sont-elles éteintes ? " + grille.cellulesToutesEteintes());
    }
}



