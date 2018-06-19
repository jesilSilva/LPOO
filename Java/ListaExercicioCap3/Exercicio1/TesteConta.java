package Lista2Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva 
 */
public class TesteConta {

    
    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner guardar = new Scanner(System.in);
        int opcao = 0;

        do{
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Deposíto");
        System.out.println("2 - Saque");
        System.out.println("3 - Impressão de saldo");
        System.out.println("4 - Sair");
        opcao = guardar.nextInt();
       
            switch (opcao) {
                case 1:
                    c.impressaoSaldo();
                    
                    System.out.println("Informe o valor do deposito:");
                    double valor = guardar.nextDouble();
                    c.deposito(valor);

                    c.impressaoSaldo();
                    break;
                case 2:
                    c.impressaoSaldo();
                    
                    System.out.println("Informe o valor do saque:");
                    Double valorSaque = guardar.nextDouble();
                    c.saque(valorSaque);

                    c.impressaoSaldo();
                    break;
                case 3:
                    c.impressaoSaldo();
                    break;
                default:
                    System.out.println("Essa opção nao é válida!");

            }
      
        } while (opcao != 4);

    }
}
