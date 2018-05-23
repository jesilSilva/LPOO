package Lista2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        float numero1, numero2, numero3;
        String opcao;

        System.out.println("Informe o 1º número:");
        numero1 = guardar.nextFloat();
        System.out.println("Informe o 2º número:");
        numero2 = guardar.nextFloat();
        System.out.println("Informe o 3º número:");
        numero3 = guardar.nextFloat();

        System.out.println("Informe C para Crescente ou D para Decrescente:");
        opcao = guardar.next();

        if (opcao.equalsIgnoreCase("c")) {

            if (((numero1 < numero2) && (numero1 < numero3) && (numero2 < numero3))) {
                System.out.println("A ordem crescente é:" + numero1 + "," + numero2 + "," + numero3);
            } else if (((numero1 < numero2) && (numero1 < numero3) && (numero3 < numero2))) {
                System.out.println("A ordem crescente é:" + numero1 + "," + numero3 + "," + numero2);
            } else if ((numero2 < numero1) && (numero2 < numero3) && (numero1 < numero3)) {
                System.out.println("A ordem crescente é:" + numero2 + "," + numero1 + "," + numero3);
            } else if ((numero2 < numero1) && (numero2 < numero3) && (numero3 < numero1)) {
                System.out.println("A ordem crescente é:" + numero2 + "," + numero3 + "," + numero1);
            } else if ((numero3 < numero1) && (numero3 < numero2) && (numero1 < numero2)) {
                System.out.println("A ordem crescente é:" + numero3 + "," + numero1 + "," + numero2);
            } else if ((numero3 < numero1) && (numero3 < numero2) && (numero2 < numero1)) {
                System.out.println("A ordem crescente é:" + numero3 + "," + numero2 + "," + numero1);
            }

        } else if (opcao.equalsIgnoreCase("d")) {
            if (((numero1 > numero2) && (numero1 > numero3) && (numero2 > numero3))) {
                System.out.println("A ordem decrescente é:" + numero1 + "," + numero2 + "," + numero3);
            } else if (((numero1 > numero2) && (numero1 > numero3) && (numero3 > numero2))) {
                System.out.println("A ordem decrescente é:" + numero1 + "," + numero3 + "," + numero2);
            } else if ((numero2 > numero1) && (numero2 > numero3) && (numero1 > numero3)) {
                System.out.println("A ordem decrescente é:" + numero2 + "," + numero1 + "," + numero3);
            } else if ((numero2 > numero1) && (numero2 > numero3) && (numero3 > numero1)) {
                System.out.println("A ordem decrescente é:" + numero2 + "," + numero3 + "," + numero1);
            } else if ((numero3 > numero1) && (numero3 > numero2) && (numero1 > numero2)) {
                System.out.println("A ordem decrescente é:" + numero3 + "," + numero1 + "," + numero2);
            } else if ((numero3 > numero1) && (numero3 > numero2) && (numero2 > numero1)) {
                System.out.println("A ordem decrescente é:" + numero3 + "," + numero2 + "," + numero1);
            }
        }

    }

}
