/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase2;

/**
 *
 * @author sm
 */
   

import java.util.Scanner;

 public class clase1Ejerc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de los números es " + suma);
    }
}

