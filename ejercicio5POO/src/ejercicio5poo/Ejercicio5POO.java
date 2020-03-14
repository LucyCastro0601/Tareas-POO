
package ejercicio5poo;

import java.util.Scanner;

public class Ejercicio5POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       String nombres[]={"Edith","Jose","Oneyda","Jose","Evelin"} ;
       String apellidos[]={"Quintanilla","Fuentes","Rosa","Reyes","Orellana"} ;
       String carrera[]={"Produccion industrial","Produccion industrial","Produccion industrial","Computacion","Produccion industrial"} ;
       String trabajo[]={"si","si","no","no","si"} ;//Arreglo que define tres elementos apellido 
       
       for(int contador=0;contador<nombres.length;contador++){
        
           System.out.printf(" \t " +nombres[contador] +  " " +  apellidos[contador] + " " + carrera[contador] + " " + trabajo[contador] + "\n " );
        
    }
    
}
}
