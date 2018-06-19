package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio6Lista1Cap2 {

    
    public static void main(String[] args) {
        
        System.out.println("O exercício foi feito por suposição porque na lista não contém a figura 2.7");

        Scanner guardar = new Scanner(System.in);
        
        int num1, num2;
        
        double quo1,quo2;
        System.out.println("Entre com o Primeiro Número:");
        num1 = guardar.nextInt();
        
        System.out.println("Entre com o Segundo Número:");
        num2 = guardar.nextInt();
        
        System.out.println("Soma: " + (num1 + num2));

        System.out.println("Produto: " + (num1 * num2));
        System.out.println("Diferença: " + (num1 - num2));
        quo1=num1;
        quo2=num2;
        System.out.println("Divisão: " + ((quo1 / quo2)));

    }

}
