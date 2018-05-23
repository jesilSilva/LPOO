package Lista3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        int numero, somaPar = 0, somaImpar = 0;

        System.out.println("Digite um número maior que 1000 para encerrar: ");
        numero = guardar.nextInt();

        while (numero <= 1000) {
            double resto = numero % 2;
            if (resto == 0) {
                somaPar = somaPar + numero;

            } else {
                somaImpar = somaImpar + numero;

            }
            System.out.println("Digite um número maior a 1000 para encerrar: ");
            numero = guardar.nextInt();
        }

        System.out.println("A soma total dos números pares é :" + somaPar);
        System.out.println("A soma total dos números impares é :" + somaImpar);

    }

}
