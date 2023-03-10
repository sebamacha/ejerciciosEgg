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
public class ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese numero para realizar un cuadrado");
        num=leer.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i==0||i==num-1) {
                    System.out.print("*");
                }else if (j==0||j==num-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
    
}
