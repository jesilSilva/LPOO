package Lista1Cap2;

import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class Exercicio_10Lista1Cap2 {

    
    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        System.out.print("Informe o raio do círculo:");
        int raio = guardar.nextInt();

        double diametro, circuferencia, area;

        diametro = 2 * raio;
        System.out.println("O diâmetro é:" + diametro);
        
        circuferencia = 2 * Math.PI * raio;
        System.out.println("O circuferência é:" + circuferencia);
        
        area = Math.pow(Math.PI, 2);
        System.out.println("O área é:" + area);
    }

}
