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
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int num,suma,i;
        suma=0;
        i=0;
        do{
            System.out.println("Ingrese numero");
            num=leer.nextInt();
            if(num==0){
                System.out.println("Se capturo el numero cero");
                break;
            }else if(num>0){
                suma+=num;
            }

            i++;
        }while(i<20);
        System.out.println("La suma es de los numeros ingresados es: "+suma);
    }
    
}
