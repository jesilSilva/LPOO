package Lista2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        float numero;

        System.out.println("Informe um número:");
        numero = guardar.nextFloat();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR");

        } else {
            System.out.println("O número é IMPAR");
        }
        if (numero > 0) {
            System.out.println("O número é POSITIVO");

        } else {
            System.out.println("O número é NEGATIVO");
        }

    }

}
