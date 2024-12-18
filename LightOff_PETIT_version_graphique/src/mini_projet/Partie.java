/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_projet;

/**
 *
 * @author louis
 */
import java.util.Scanner;

public class Partie {
    // Attributs de la classe
    private GrilleDeCellules grille; // Grille de jeu
    private int nbCoups; // Compteur de coups

    // Constructeur de la classe
    public Partie(int par, int par1) {
        this.grille = new GrilleDeCellules(7, 7); // ou les dimensions souhaitées
        this.nbCoups = 0;
    }

    // Méthode pour initialiser la partie (mélange de la grille)
    public void initialiserPartie(int par) {
        grille.melangerMatriceAleatoirement(10); // ou le nombre de tours souhaité
        System.out.println("Grille mélangée pour débuter la partie :");
        System.out.println(grille);
    }

    // Méthode pour lancer la partie (boucle de jeu)
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Entrez votre coup (L/C/D, suivi de l'indice) : ");
            String coup = scanner.nextLine().toUpperCase();
            char typeCoup = coup.charAt(0);
            int index = Integer.parseInt(coup.substring(1).trim());

            switch (typeCoup) {
                case 'L':
                    grille.activerLigneDeCellules(index);
                    break;
                case 'C':
                    grille.activerColonneDeCellules(index);
                    break;
                case 'D':
                    if (index == 0) {
                        grille.activerDiagonaleDescendante();
                    } else if (index == 1) {
                        grille.activerDiagonaleMontante();
                    }
                    break;
                default:
                    System.out.println("Coup invalide. Veuillez entrer L pour ligne, C pour colonne, ou D pour diagonale suivi de l'indice.");
                    continue;
            }

            nbCoups++;
            System.out.println("Grille après le coup " + nbCoups + " :");
            System.out.println(grille);
        }

        System.out.println("Félicitations, vous avez éteint toutes les cellules en " + nbCoups + " coups !");
    }
}

