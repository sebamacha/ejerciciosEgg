/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase2;

import java.util.Scanner;

/**Escribir un programa que pida tu nombre, 
 * lo guarde en una variable y lo muestre por pantalla.

 */
public class clase1ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nomb = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre  = nomb.next();
        System.out.println("su nombre es:" + nombre);
    }
   
}
