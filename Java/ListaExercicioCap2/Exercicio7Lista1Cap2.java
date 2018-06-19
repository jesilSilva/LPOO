package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio7Lista1Cap2 {

    
    public static void main(String[] args) {
        

        Scanner guardar = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("informe o 1º número:");
        numero1 = guardar.nextInt();
        System.out.println("informe o 2º número:");
        numero2 = guardar.nextInt();
        
        if (numero1>numero2) {
            System.out.println(numero1+" is larger");
            
        }else if(numero2>numero1){
            System.out.println(numero2+" is larger");
            
        }else if (numero1==numero2) {
            System.out.println("These numbers are equal");
        }

    }

}
