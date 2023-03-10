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
public class ejercicio8 {
public static void main(String[] args) {
    // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int nota;
    System.out.println("Ingrese nota :");
    nota=leer.nextInt()s;
     while(nota<0||nota>10){  // Se agregó el bloque while al método main para que se ejecute correctamente el código. 
        System.out.println("Ingrese nota :"); 
        nota=leer.nextInt();  // Se eliminó la palabra "default" para evitar un error de sintaxis. 

    }

System.out.println("la nota :" + nota + " es valida");  // Se agregó el println para mostrar el resultado de la variable "nota". 

}  

}

