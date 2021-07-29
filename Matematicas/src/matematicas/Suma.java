package matematicas;
/**
 * @author Adrian
 */
public class Suma {
    public double sumando1,sumando2,sumando3,resultado;
    
   
   public Suma(double s1,double s2,double s3){
       
       sumando1=s1;
       sumando2=s2;
       sumando3=s3;
  
   }
    
    public double operacion(){
        
        return resultado=(sumando1 + sumando2 + sumando3);
        
    }
    
    public String  imprimir(){
        
        return "El resultado de la suma es: " + resultado;
        
    }
  
}
