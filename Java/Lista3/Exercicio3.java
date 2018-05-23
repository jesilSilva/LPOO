package Lista3;


/**
 *
 * @author Jesiel Silva
 */
public class Exercicio3 {

    public static void main(String[] args) {

        int num1 = 1, num2 = 1, i = 0;
        double somaFinal = 0;

        for (num2 = 1; num2 < 51; num2++) {
            double numero1 = num1, numero2 = num2;
            somaFinal = somaFinal + (numero1 / numero2);

            System.out.println("Resultado:" + num1 + "/" + num2 + "=" + somaFinal);
            num1 = num1 + 2;

        }
        System.out.println("Soma: " + somaFinal);
    }

}
