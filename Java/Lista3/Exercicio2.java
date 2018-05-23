package Lista3;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio2 {

    public static void main(String[] args) {

        for (int primeiroNumero = 0; primeiroNumero < 10; primeiroNumero++) {

            System.out.println("A tabuada do número é:" + primeiroNumero);

            for (int segundoNumero = 0; segundoNumero < 11; segundoNumero++) {

                System.out.println(primeiroNumero + "X" + segundoNumero + "=" + (segundoNumero * primeiroNumero));
            }
        }
    }
}
