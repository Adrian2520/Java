package matematicas;
/**
 * @author Adrian
 */
public class Resta {
    
        public double minuendo,sustraendo,resultado;
    
    public Resta (double m,double s){
        
        minuendo=m;
        sustraendo=s;
        
    } 
    
    public double operacion(){
        
        return resultado=(minuendo-sustraendo);
        
    }
    
    public String imprimir(){
        
        return "El resultado de la resta es: "+resultado;
        
    } 
}
