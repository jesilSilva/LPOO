package Lista3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        
        double numero, numeroMaior=0, numeroMenor = 0;
        
        System.out.println("Informe o 1º valor:");
        
            numero=guardar.nextDouble();
            numeroMenor=numero;
        for (int in = 2; in < 16; in++) {
            
            System.out.println("Informe o "+ in +" valor: ");
            numero=guardar.nextDouble();
            
            if (numero>numeroMaior) {
                numeroMaior=numero;
            }
            
            if (numero < numeroMenor) {
                numeroMenor=numero;
            }
        }
        System.out.println("O maior número é:" + numeroMaior);
        System.out.println("O menor número é:" + numeroMenor);
    }

}
