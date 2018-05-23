package Lista3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio9 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        int primo = 0, num;

        System.out.println("Digite um numero: ");
        num = guardar.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = 1;
            }
        }
        if (primo == 0) {
            System.out.println("Primo!");
        } else {
            System.out.println("Não é primo!");
        }
    }
}
