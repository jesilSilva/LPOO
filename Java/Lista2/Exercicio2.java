package Lista2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio2 {

    
    public static void main(String[] args) {
        
        Scanner guardar = new Scanner(System.in);
        
        float lado1, lado2, lado3;
        
        System.out.println("Informe 1° lado:");
        lado1 = guardar.nextFloat();
        System.out.println("Informe 2° lado: ");
        lado2 = guardar.nextFloat();
        System.out.println("Informe 3° lado: ");
        lado3 = guardar.nextFloat();
        
        if ((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado3 + lado1 > lado2)) {
            
            System.out.println("Os Lados Informados formam um Triângulo!");
        } else {
            System.out.println("Os Lados informados não formam um Triângulo!");
        }

        if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado3 == lado2 && lado3 != lado1)) {
            System.out.println("O triângulo é (ISOCELES)");

        } else if ((lado1 != lado3) && (lado1 != lado2) && (lado3 != lado1)) {
            System.out.println("O triângulo é (ESCALENO)");

        } else if ((lado1 == lado2 && lado1 == lado3)) {
            System.out.println("O triângulo é (IQUILATERO)");

        }

    }

    
}
