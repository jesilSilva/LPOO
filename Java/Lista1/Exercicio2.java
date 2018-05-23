package Lista1;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio2 {

    public static void main(String[] args) {
        float c, f;
        Scanner guardar = new Scanner(System.in);
        
        System.out.println("Informe a temperatua em Graus Centigrados:");
        c = guardar.nextFloat();
        
        System.out.println(c);
        
        f = (9 * c + 160) / 5;
        
        System.out.println(f);

    }

}
