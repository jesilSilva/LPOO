package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Jesiel Carlos
 */
public class EmpregadoTeste {

    public static void main(String[] args) {

        Empregado empregado1 = new Empregado();
        Scanner guardar = new Scanner(System.in);

        System.out.println("Informe os dados do empregado 1");
        System.out.println("Informe o primeiro nome:");
        String nome = guardar.next();
        empregado1.setPrimeiroNome(nome);

        System.out.println("Informe o sobrenome:");
        String sobrenome = guardar.next();
        empregado1.setSobrenome(sobrenome);

        System.out.println("Informe o salário:");
        Double salarioMensal = guardar.nextDouble();
        empregado1.setSalarioMensal(salarioMensal);

        System.out.println("Salário anual sem aumento do empregado 1: R$ " + empregado1.salarioAnual(salarioMensal)+"\n");

        Empregado empregado2 = new Empregado();

        System.out.println("Informe os dados do empregado 2");
        System.out.println("Informe o primeiro nome:");
        nome = guardar.next();
        empregado2.setPrimeiroNome(nome);

        System.out.println("Informe o sobrenome:");
        sobrenome = guardar.next();
        empregado2.setSobrenome(sobrenome);

        System.out.println("Informe o salário:");
        salarioMensal = guardar.nextDouble();
        empregado2.setSalarioMensal(salarioMensal);

        System.out.println("Salário anual sem aumento do empregado 2: R$ " + empregado2.salarioAnual(salarioMensal)+"\n");

        System.out.println("Os dados do empregado 1 com aumento de 10%:");
        empregado1.dadosEmpregados();
        System.out.println("");
        System.out.println("Os dados do empregado 2 com aumento de 10%:");
        empregado2.dadosEmpregados();
    }

}
