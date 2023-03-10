/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosegg.clase4;

/**
 *
 * @author sm
 */
public class ejercicio8clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas=0,incorrectas=0;
        String cadena;
        do {
            System.out.println("Ingrese cadena(hasta 5 caracteres)");
            cadena=leer.next();
            cadena=cadena.toUpperCase();
            if (cadena.equals("&&&&&")) {
                
            }else{
                System.out.println(cadena.length()<=5);
                System.out.println(cadena.substring(0,1).equals("X"));
                System.out.println(cadena.substring(cadena.length()-1,cadena.length()).equals("O"));
                if (cadena.length()<=5 && cadena.substring(0,1).equals("X") && cadena.substring(cadena.length(), cadena.length()).equals("O")) {
                    correctas++;
                }else{
                    incorrectas++;
                }
            }
            
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de correctas son "+correctas+" y la de incorrectas son "+incorrectas);
    }
    
}
