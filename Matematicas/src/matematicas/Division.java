package matematicas;
/**
 * @author marcimex
 */
public class Division {
    public double dividendo,divisor,resultado;
    
    public Division(double dividendo,double divisor){
        
        this.dividendo = dividendo;
        this.divisor = divisor;
        
    }
    
    public double operacion(){
        
        return resultado=(dividendo/divisor);
        
    }
    
    public String imprimir(){
        
        return "la division entre "+dividendo+" y "+divisor+" es: "+resultado;
        
    }
}
