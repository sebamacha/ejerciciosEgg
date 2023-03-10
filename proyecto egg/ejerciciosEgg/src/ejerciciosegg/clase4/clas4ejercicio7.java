/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase4;

import java.util.Scanner;

/**
 * Considera que estás desarrollando una web para una empresa que fabrica
 * motores (suponemos que se trata del tipo de motor de una bomba para mover
 * fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un
 * valor entre 1 y 4. El programa debe mostrar lo siguiente: o	Si el tipo de
 * motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”. o
 * Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba
 * de gasolina”. o	Si el tipo de motor es 3, mostrar un mensaje indicando “La
 * bomba es una bomba de hormigón”. o	Si el tipo de motor es 4, mostrar un
 * mensaje indicando “La bomba es una bomba de pasta alimenticia”. o	Si no se
 * cumple ninguno de los valores anteriores mostrar el mensaje “No existe un
 * valor válido para tipo de bomba”
 */
public class clas4ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Se debió inicializar el objeto Scanner con la palabra reservada 'new'
        int opcion;
        System.out.println("ingrese una opcion para cat. de motor 1-2-3-4");
        int num1 = sc.nextInt();



        opcion = num1;
        switch (num1) {
            case 1 -> {
                int tipoBomba = 1;
                System.out.println("La bomba es una bomba de agua");
                break;
            }
            case 2 -> {
                int tipoBomba = 2;
                System.out.println("La bomba es una bomba de gasolina");
                break;
            }
            case 3 -> {
                int tipoBomba = 3;
                System.out.println("La bomba es una bomba de hormigón");
                break
            }

            case 4 -> {
                int tipoBomba= 4; 
                break;

                System.out.println("La bomba es una bomba de pasta alimenticia");
            }
            default;
            System.out.println("No existe un valor válido para tipo de bomba")
       /* if (num1 != 1 && num1 != 2 && num1 != 3 && num1 != 4) {
            System.out.println("No existe un valor válido para tipo de bomba");*/
        }

    }

}
        }