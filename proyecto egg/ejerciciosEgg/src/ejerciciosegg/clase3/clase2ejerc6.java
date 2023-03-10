/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase3;

import java.util.Scanner;

/**
 *
 * @author sm
 */
public class clase2ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); //Creamos un objeto Scanner que recibirá los datos por teclado

    //Pedimos al usuario que ingrese un número entero
    System.out.println("Ingrese un número entero: "); 
    int num = sc.nextInt(); //Leemos el valor ingresado y lo almacenamos en la variable num

    //Mostramos el doble, triple y raíz cuadrada del número ingresado por el usuario 
    System.out.println("El doble de " + num + " es " + (2*num)); 
    System.out.println("El triple de " + num + " es " + (3*num)); 
    System.out.println("La raíz cuadrada de " + num + " es " + Math.sqrt(num));  

    }
    
}
