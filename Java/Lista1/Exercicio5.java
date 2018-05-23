package Lista1;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        
        double numero;
        
        System.out.println("Informe um número:");
        numero = guardar.nextDouble();
        
        System.out.println("O Quadrado do número é: " + Math.pow(numero, 2));

    }

}
