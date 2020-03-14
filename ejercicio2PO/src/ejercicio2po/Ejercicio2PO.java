
package ejercicio2po;

import java.util.Scanner;


public class Ejercicio2PO {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         double num1 = 0;
         double num2 = 0; 
         double suma, resta, multiplicacion = 0;
         double division = 0; 
         
         System.out.println("Ingrese el primer numero");
         num1 = entrada.nextInt();
         System.out.println("Ingrese el segundo numero");
         num2 = entrada.nextInt();
         
         suma = num1 + num2;
         resta = num1 - num2;
         multiplicacion = num1 * num2;
   
         if (num2 != 0){
                division = num1 / num2;
         }
    // Imprimimos en consola los resultados
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La division es: " + division);
        
  }
    }
    

