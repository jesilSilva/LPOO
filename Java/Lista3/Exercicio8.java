package Lista3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio8 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        int n;

        System.out.println("Informe um número:");
        n = guardar.nextInt();
        for (int par = 0; n >= par; par++) {

            if (par % 2 == 0) {
                System.out.println("Os números pares são:" + par);

            }

        }
        System.out.println("----------------------###########--------------------------");

        for (int impar = 0; n >= impar; impar++) {

            if (impar % 2 == 1) {
                System.out.println("Os números impares são:" + impar);

            }
        }
    }

}
