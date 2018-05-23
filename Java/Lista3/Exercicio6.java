package Lista3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio6 {

    
    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        double valor1, valor2, valor3, soma, produto, media;

        System.out.println("Informe o 1º valor:");
        valor1 = guardar.nextDouble();
        System.out.println("Informe o 2º valor:");
        valor2 = guardar.nextDouble();
        System.out.println("Informe o 3º valor:");
        valor3 = guardar.nextDouble();

        while ((valor1 < valor2) && (valor2 < valor3) && (valor1 < valor3)) {
            soma = (valor1 + valor2 + valor3);
            produto = (valor1 * valor2 * valor3);
            media = (valor1 + valor2 + valor3) / 3;

            System.out.println("A soma:" + soma);
            System.out.println("O produto:" + produto);
            System.out.println("A média:" + media);

            System.out.println("Informe o 1º valor:");
            valor1 = guardar.nextDouble();
            System.out.println("Informe o 2º valor:");
            valor2 = guardar.nextDouble();
            System.out.println("Informe o 3º valor:");
            valor3 = guardar.nextDouble();

        }
    }

}
