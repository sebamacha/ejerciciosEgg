/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase4;

import java.util.Scanner;

/**
 *
 * @author sm
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite ");
        int limit=leer.nextInt();
        int suma=0;
        do {
            System.out.println("Ingrese un numero");
            suma+=leer.nextInt();
        } while (limit>suma);
        System.out.println("La suma es "+suma);
        
    }
    
}
