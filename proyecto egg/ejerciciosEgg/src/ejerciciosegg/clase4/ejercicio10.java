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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int num;
        for(int i=0;i<4;i++){
            do{
                System.out.println("Ingrese numero "+(i+1));
                num=leer.nextInt();
            }while(num<1||num>20);
            System.out.print(num);
            for(int j=0;j<num;j++){
                System.out.print("*"); 
            }
            System.out.println("");
            
        }
    }
    
}
