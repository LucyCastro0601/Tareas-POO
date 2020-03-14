
public class Recursos {
    
    public String saludo(String nombre){
        
        String saludo = "Estoy aprendiendo, pero seré el mejor programador del mundo";
        
        return saludo;
    }
    
    public int nota (int i){
        
        
        if(i <  70){
            System.out.println("Usted reprobo ");
        }else{
            System.out.println("Usted aprobo");
        } 
        return i;
        
    }
    
     public double division(double n1){

        return n1;        
        }

     
     public int lista( int nume3){
         System.out.println("Su lista de numeros es:");
         int i = 0;
         for( i = 1; i<=nume3; i++){
             System.out.printf("\n %d ", i );
         }
       
         return i ;
        
    }

}
