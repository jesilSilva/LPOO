package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio3Lista1Cap2 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        Integer numero;
        System.out.println("Informe um número inteiro que deseja mostrar o inverso, esse número deve conter no máximo 9 dígitos:");
        numero = guardar.nextInt();

        Integer a = new Integer(numero);
        String a2 = a.toString();
        
        String a3 = "";
        
        for (int j = a2.length(); j > 0; j--) {
            a3 += a2.substring(j - 1, j);
        }
        System.out.println("numero invertido:" + a3);
    }
}
