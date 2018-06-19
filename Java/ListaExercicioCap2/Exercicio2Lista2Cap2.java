package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio2Lista2Cap2 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        double distancia = 1, tempo = 3, dist, temp;

        System.out.println("Você quer calcular pelo tempo ou pela distância ?");

        System.out.println("Digite T para tempo e D para distância");
        String opcao = guardar.next();

        if (opcao.equalsIgnoreCase("T")) {

            System.out.println("Informe a distância que deseja saber o tempo que a onda leva para percorrer");
            dist = guardar.nextDouble();

            System.out.println("A onda levará " + (dist * tempo) + " minutos para percorrer a distância informada");

        } else if (opcao.equalsIgnoreCase("D")) {

            System.out.println("Informe o tempo para saber a distância percorrida pela onda");
            temp = guardar.nextDouble();
            System.out.println("De acordo com a distância (KM) informada a onda levará:" + (temp * tempo) + " minutos para percorrer toda essa distância");
        }

    }

}
