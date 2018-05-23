package Lista1;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio4 {

    public static void main(String[] args) {

        float a, b, c;

        Scanner guardar = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        a = guardar.nextFloat();
        System.out.println("Informe o valor de B:");
        b = guardar.nextFloat();
        c = a;
        a = b;
        b = c;
        System.out.println("Valor de A : " + a);
        System.out.println("Valor de B : " + b);

    }

}
