/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaitercopa1564beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class VaiTerCopa1564Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int N = 0;
        while (teclado.hasNextInt()) {
            N = teclado.nextInt();
            if (N == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas copas");
            }
        } 
    }
    
}
