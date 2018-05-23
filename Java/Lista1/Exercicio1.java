package Lista1;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio1 {

    public static void main(String[] args) {

        double numero1, numero2;
        Scanner guardar = new Scanner(System.in);

        System.out.println("Entre com o 1º número:");
        numero1 = guardar.nextDouble();
        System.out.println("Entre com o 2º número:");
        numero2 = guardar.nextDouble();
        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Diferença: " + (numero1 - numero2));
        System.out.println("Produto: " + (numero1 * numero2));
        System.out.println("Média: " + ((numero1 + numero2) / 2));

    }

}
