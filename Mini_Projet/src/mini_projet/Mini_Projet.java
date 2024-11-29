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

        CelluleLumineuse cellule = new CelluleLumineuse();
        System.out.println(cellule); // Devrait afficher "O" (éteinte)
        
        cellule.activerCellule();
        System.out.println(cellule); // Devrait afficher "X" (allumée)
        
        cellule.eteindreCellule();
        System.out.println(cellule); // Devrait afficher "O" (éteinte)
        
        System.out.println("État actuel : " + (cellule.getEtat() ? "Allumée" : "Éteinte"));
        System.out.println("Est éteinte ? " + cellule.estEteint());
    }
}
