package matematicas;

import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class Main {

  
    
    public static void main(String[] args) {
        Suma opSuma;
        Resta opResta;
        Multiplicacion opMulti;
        Division opDivi;
   
       Scanner ent = new Scanner(System.in);
       Scanner res =new Scanner(System.in);
       
       boolean val = true;
       
       
       while (val){
           System.out.println("suma=1;resta=2;mutiplicacion=3;division=4");
           System.out.println("Ingrese la operacion a realizarce");
           int oper=ent.nextInt();
           
           switch(oper){
               case 1:
                   System.out.println("Ingrese sumando 1");
                   int s1 = ent.nextInt();
                   System.out.println("Ingrese sumando 2");
                   int s2 = ent.nextInt();
                   System.out.println("Ingrese sumando 3");
                   int s3 = ent.nextInt();
                   opSuma = new Suma(s1,s2,s3);
                   opSuma.operacion();
                   System.out.println(opSuma.imprimir());
                   break;
               case 2:
                   System.out.println("Ingrese minuendo");
                   int m1 = ent.nextInt();
                   System.out.println("Ingrese Sustraendo");
                   int sus = ent.nextInt();
                   opResta =new Resta(m1,sus);
                   opResta.operacion();
                   System.out.println(opResta.imprimir());   
                   break;
               case 3:
                   System.out.println("Ingrese multiplicando");
                   int multiplicando = ent.nextInt();
                   System.out.println("Ingrese el multiplicador");
                   int multiplicador = ent.nextInt();
                   opMulti = new Multiplicacion(multiplicando,multiplicador);
                   opMulti.operacion();
                   System.out.println(opMulti.imprimir());
                   break;
               case 4:
                   System.out.println("Ingrese el dividendo");
                   int dividendo = ent.nextInt();
                   System.out.println("Ingrese el divisor");
                   int divisor = ent.nextInt();
                   opDivi = new  Division(dividendo,divisor);
                   opDivi.operacion();
                   System.out.println(opDivi.imprimir());
                   break;
               default:
                   System.out.println("Opreacion Ingresada es incorrecta");
           } 
           
           System.out.println("******************************");
           System.out.println("1 = si ; 0 = no");
           System.out.println("Desea vover a realizar otra operacion");
           int com = res.nextInt();
           
           if (com==0){
               val = false;
           }
            
       }
       
        System.out.println("*--------------------------------------------*");
        System.out.println("Gracias por usar OperaMATH calculadora basica.");
        System.out.println("By:Adrian");
    }
    
}
