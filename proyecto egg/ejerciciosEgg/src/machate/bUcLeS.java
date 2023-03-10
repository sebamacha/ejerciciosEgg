/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package machate;

import java.util.Scanner;

/**
 *
 * @author sm
 */
public class bUcLeS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int num; 
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un numero posito");
            num = leer.nextInt();
            if  ( num > 1000) {
                System.out.println("Este programa podria tardar mucho, continuar? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    ///break;
                }
            }
        } while (num<= 0 || num >= 1000);
   
    
    int j, suma;
    for( int i=1; i<=num; i++){
        if( i%2 != 0);
        ///continue;
        
        suma = 0;
        j = 1;
        while (j<=i) {
        suma += j;
        j++;
        }
        System.out.println("la suma de los " + i + " numeros naturales es: " + suma);
       }
    }
}
