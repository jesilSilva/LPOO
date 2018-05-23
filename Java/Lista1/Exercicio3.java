package Lista1;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio3 {

    public static void main(String[] args) {

        double altura, volume, raio;

        Scanner guardar = new Scanner(System.in);

        System.out.println("Informe a altura da lata:");
        altura = guardar.nextDouble();
        System.out.println("Informe o raio da lata:");
        raio = guardar.nextDouble();

        volume = (PI * Math.pow(raio, 2) * altura);

        System.out.println("O volume da lata de oléo é: " + volume);

    }
}
