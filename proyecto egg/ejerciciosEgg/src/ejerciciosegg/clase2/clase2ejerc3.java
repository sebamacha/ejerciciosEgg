package ejerciciosegg.clase2;

sebas/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios1;

import static java.lang.System.in;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author sm
 */
public class clase2ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    
    String frase;
    
    System.out.println("Ingrese la frase a convertir a mayuscula");
    
    frase = leer.nextLine();
    
    System.out.println(frase.toUpperCase());
    System.out.println(frase.toLowerCase());
    }
        
       
    }
    
}
