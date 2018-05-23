package Lista2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        float numero1, numero2, numero3;

        System.out.println("Informe o 1º número:");
        numero1 = guardar.nextFloat();
        System.out.println("Informe o 2º número:");
        numero2 = guardar.nextFloat();
        System.out.println("Informe o 3º número:");
        numero3 = guardar.nextFloat();
        
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1 - Calcular média ");
        System.out.println("2 - Calcular soma ");
        System.out.println("3 - Calcular multiplicação ");
        System.out.println("Escolha uma das opções :");

        int opcao = guardar.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A média dos números é: " + ((numero1 + numero2 + numero3) / 3));
                break;
            case 2:
                System.out.println("A soma dos números é:" + (numero1 + numero2 + numero3));
                break;
            case 3:
                System.out.println("A multiplicação dos números é:" + (numero1 * numero2 * numero3));
                break;
            default:
                System.out.println("A opção escolhida é inválida!");
                break;
        }
    }

}

