package Lista2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        float numero1, numero2, numero3, media;

        System.out.println("Informe 1º nota");
        numero1 = guardar.nextFloat();

        System.out.println("Informe 2º nota");
        numero2 = guardar.nextFloat();

        System.out.println("Informe 3º nota");
        numero3 = guardar.nextFloat();

        if ((numero1 > numero2) && (numero1 > numero3)) {
            System.out.println("A maior nota é: " + numero1);
        } else if ((numero2 > numero1) && (numero2 > numero3)) {
            System.out.println("A maior nota é: " + numero2);

        } else if ((numero3 > numero1) && (numero3 > numero2)) {
            System.out.println("A maior nota é: " + numero3);
        }
        media = ((numero1 + numero2 + numero3) / 3);
        System.out.println("A média das notas é: " + media);

    }
}
