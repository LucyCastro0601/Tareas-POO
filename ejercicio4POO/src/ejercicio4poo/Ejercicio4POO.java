
package ejercicio4poo;

import java.util.Scanner;


public class Ejercicio4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       String nombres[]  = new String[10]; //Arreglo que define tres elementos apellido
    
        System.out.println("Guardando nombres ");
        for(int i=0; i<=9; i++){
            System.out.println((i+1)+".Escriba un nombre");
            nombres[i] = entrada.next();
        }
        System.out.println("\nImprimiendo");
        for(String i: nombres){
            System.out.println(i);
            
        }
        
    }
}
