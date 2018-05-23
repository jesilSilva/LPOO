package Lista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio_10 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = guardar.nextInt();

        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i <= num; i++) {
            numeros.add(i);
        }
        int contador;
        int numero = 0;
        for (Integer i : numeros) {
            contador = 0;
            for (int i2 = 1; i2 <= i; i2++) {
                if (i % i2 == 0) {
                    contador++;
                    numero = i2;
                }
            }
            if (contador == 2) {
                System.out.println("O Número: " + numero + " é primo ");
            }
        }
    }
}
