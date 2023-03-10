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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int opcion;
        String salir="n";
        do {
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion :");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma es "+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La muliplicacion es "+(num1*num2));
                    break;
                case 4:
                    if (num2>0) {
                        System.out.println("La division es "+(num1/num2));
                    }else{
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir (s/n)");
                    salir=leer.next();
                    break;
            }
        } while (salir.equalsIgnoreCase("n"));
    }
    
}
