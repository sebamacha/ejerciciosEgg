/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase4;

import java.util.Scanner;

/**
Implementar un programa que le pida dos números enteros al usuario y 
* determine si ambos o alguno de ellos es mayor a 25.
 */
public class clase_4_ejer6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el 1° numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese el 2°numero");
        int num2 = leer.nextInt();
        if (num1 > 25) {
            System.out.println("el numero 1° " + num1 + " es mayor a 25 ");
        } else {
            System.out.println("el numero 1° " + num1 + " es menor a 25");
            if (num2 > 25) {
                System.out.println("el numero 2° " + num2 + " es mayor a 25 ");
            } else {
                System.out.println("el numero 2° " + num2 + "es menor a 25");
            }
        }

    }

}
