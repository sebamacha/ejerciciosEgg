/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase4;

import java.util.Scanner;

/**
Crear un programa que dado un número determine si es par o impar.
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);

        System.out.println("Inrgese numero :");
        int num=leer.nextInt();
        if (num%2!=0) {
            System.out.println("Es impar");
        }else{
            System.out.println("Es par");
        }
        
        
        
    }
    
}
