/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mini_projet;

/**
 *
 * @author enzop
 */
public class Mini_Projet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        // Test initial des états des cellules
        System.out.println("État initial des cellules :");
        System.out.println("Cellule 1 : " + cellule1); // Devrait afficher "O" (éteinte)
        System.out.println("Cellule 2 : " + cellule2); // Devrait afficher "O" (éteinte)

        // Activation des cellules
        cellule1.activerCellule();
        cellule2.activerCellule();

        System.out.println("\nAprès activation des cellules :");
        System.out.println("Cellule 1 : " + cellule1); // Devrait afficher "X" (allumée)
        System.out.println("Cellule 2 : " + cellule2); // Devrait afficher "X" (allumée)

        // Extinction de la cellule 1, cellule 2 reste inchangée
        cellule1.eteindreCellule();

        System.out.println("\nAprès extinction de la cellule 1 :");
        System.out.println("Cellule 1 : " + cellule1); // Devrait afficher "O" (éteinte)
        System.out.println("Cellule 2 : " + cellule2); // Devrait afficher "X" (allumée)

        // Vérification des méthodes estEteint() et getEtat()
        System.out.println("\nVérification des états :");
        System.out.println("Cellule 1 est éteinte ? " + cellule1.estEteint()); // Devrait être true
        System.out.println("Cellule 2 est éteinte ? " + cellule2.estEteint()); // Devrait être false

        System.out.println("Cellule 1 état brut : " + cellule1.getEtat()); // Devrait être false
        System.out.println("Cellule 2 état brut : " + cellule2.getEtat()); // Devrait être true

        // Activation de la cellule 1 à nouveau
        cellule1.activerCellule();

        System.out.println("\nAprès réactivation de la cellule 1 :");
        System.out.println("Cellule 1 : " + cellule1); // Devrait afficher "X" (allumée)
        
        cellule2.activerCellule();

        System.out.println("\nAprès réactivation de la cellule 2 :");
        System.out.println("Cellule 2 : " + cellule2); // Devrait afficher "X" (allumée)
    }
}
