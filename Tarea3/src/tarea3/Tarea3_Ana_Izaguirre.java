/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;
import java.lang.String;
/**
 *
 * @author usuario
 */
public class Tarea3_Ana_Izaguirre {

    public static void main(String[] args) {
        // TODO code application logic here
         Estudiantes persona = new Estudiantes();
         
    persona.setNombre("Ana\n");
    persona.setApellido("Izaguirre\n");
    persona.setEdad (19);
    persona.setSexo ("F\n");
    
    System.out.printf("Nombre: " + persona.getNombre() );
    System.out.printf("Apellido: " + persona.getApellido() );
    System.out.printf("Edad: " + persona.getEdad() );
    System.out.printf("\nSexo: " + persona.getSexo() );
    
    }

    private static class Estudiantes {

    
    private String nombre ;
    private String apellido ;
    private int edad ;
    private String sexo ;   

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
        }
    }
    

