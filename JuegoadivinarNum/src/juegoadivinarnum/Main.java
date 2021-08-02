package juegoadivinarnum;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Adrian
 */
public class Main {

  
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vidas = 3;
        int variable = 10;
        boolean res = true;

        do {

            System.out.println("Intente adivinar el numero. ");
            System.out.println("Ingrese un numero: ");
            int n = entrada.nextInt();

            Random num = new Random();
            int i = num.nextInt(variable) + 1;
            System.out.println("El numero es: " + i);

            if (n == i) {
                System.out.println("Felicidades Ganaste");
                System.out.println("PV = " + vidas);
                break;
            } else {
                System.out.println("Intentalo de nuevo");
                System.out.println("PV = " + (vidas - 1));
                vidas = vidas - 1;
            }

            if (vidas == 0) {
                System.out.println("Lo lamento perdiste tus vidas");
                res = false;
            }

        } while (res);

    }
}
