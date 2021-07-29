/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;
/**
 * @author Adrian
 */
public class Multiplicacion {
      public double multiplicando,multiplicador,resultado;
    
    
    public Multiplicacion(double multiplicando,double multiplicador){
        
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
        
    }
    
    public double operacion(){
        
        return resultado=(multiplicando*multiplicador);
        
    }
    
    public String imprimir(){
        
        return "La Multiplicacion entre  "+multiplicando+" por "+multiplicador +" El resultado es: "+resultado; 
        
    }
}
