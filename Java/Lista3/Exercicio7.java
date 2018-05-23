package Lista3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio7 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        double mediaF, contaMedia = 0, mediaTurma, mediaMaior = 0, menorMedia = 0;
        int contador = 0;

        System.out.println("Programa encerra quando digitar um valor negativo");
        System.out.println("Informe a média final do aluno:");
        mediaF = guardar.nextDouble();
        
        mediaMaior = mediaF;
        menorMedia = mediaF;

        while (mediaF > 0) {
            contador = contador + 1;
            contaMedia = (mediaF + contaMedia);

            if (mediaMaior < mediaF) {
                mediaMaior = mediaF;
            } else if (menorMedia > mediaF) {
                menorMedia = mediaF;
            }
            System.out.println("Informe a média final do aluno:");

            mediaF = guardar.nextDouble();

        }
        mediaTurma = contaMedia / contador;
        System.out.println("Maior média:" + mediaMaior);
        System.out.println("Menor média:" + menorMedia);
        System.out.println("Média geral:" + mediaTurma);

    }

}
