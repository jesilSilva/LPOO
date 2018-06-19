package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */

public class Exercicio8Lista1Cap2 {

    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("informe o 1º número:");
        numero1 = guardar.nextInt();
        
        System.out.println("informe o 2º número:");
        numero2 = guardar.nextInt();
        
        System.out.println("informe o 3º número:");
        numero3 = guardar.nextInt();

        System.out.println("A soma é:" + (numero1 + numero2 + numero3));
        System.out.println("A média é:" + (numero1 + numero2 + numero3) / 3);
        System.out.println("O produto é:" + (numero1 * numero2 * numero3));
        
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("O número maior é:" + numero1);
            
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("O número maior é:" + numero2);
            
        } else if (numero3 >= numero1 && numero3 >= numero2) {
            System.out.println("O número maior é:" + numero3);
        }

        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("O número menor é:" + numero1);
            
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("O número menor é:" + numero2);
            
        } else if (numero3 <= numero1 && numero3 <= numero2) {
            System.out.println("O número menor é:" + numero3);
        }

    }

}


