package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio1Lista1Cap2 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        double desconto, total, aluguelMensal1 = 550, aluguelMensal2 = 605, aluguelMensal3 = 665.50, aluguelMensal4 = 732.05;

        System.out.println("Dados aluguel:");
        System.out.println("1 ano - " + aluguelMensal1 + " - " + (aluguelMensal1 * 12) + " anual");
        System.out.println("2 ano - " + aluguelMensal2 + " - " + (aluguelMensal2 * 12) + " anual");
        System.out.println("3 ano - " + aluguelMensal3 + " - " + (aluguelMensal3 * 12) + " anual");
        System.out.println("4 ano - " + aluguelMensal4 + " - " + (aluguelMensal4 * 12) + " anual");
        total = ((aluguelMensal1 * 12) + (aluguelMensal2 * 12) + (aluguelMensal3 * 12) + (aluguelMensal4 * 12));
        System.out.println("Total:" + total);

        System.out.println("Informe o percentual de descontos:");
        
        desconto = guardar.nextDouble();
        
        System.out.println("O total do aluguel com desconto é: " + ((total - (total / 100) * desconto)));

    }

}
