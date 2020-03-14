


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea2_Ana_Izaguirre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num = 0;
      double num1 = 0;
      double num2 = 0;
      double t=0;
      int num3 =0;
      Scanner entrada = new Scanner(System.in);
      Recursos recu = new Recursos();
        String nombre=null;
        
      
        System.out.println(recu.saludo(nombre));
        
        System.out.println("Por favor ingrese su nota:");
        num=entrada.nextInt();
        
        num = recu.nota(num);
        
        System.out.println("Por favor ingrese el primer numero:");
        num1=entrada.nextDouble();
        System.out.println("Por favor ingrese el segundo numero:");
        num2=entrada.nextDouble();
        
        t = num1 / num2;
        
        t=recu.division(t);
        
        System.out.println(recu.division(t));
        
        System.out.println("Por favor ingrese el ultimo numero que desea enlistar: ");
        num3 = entrada.nextInt();
        
        num3 = recu.lista(num3);
        
                
    }
    
}
