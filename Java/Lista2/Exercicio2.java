/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float l1, l2, l3;
        System.out.println("Informe Lado 1");
        l1 = leitura.nextFloat();
        System.out.println("Informe Lado ");
        l2 = leitura.nextFloat();
        System.out.println("Informe Lado 3");
        l3 = leitura.nextFloat();
        if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l3 + l1 > l2)) {
            //( L1+L2 > L3; L2+L3 >L1 e L3+L1 > L2)  
            System.out.println("Os Lados Informado formam um Triangulo");
        } else {
            System.out.println("Os Lados informado não formam um Trianguro");
        }

        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l3 == l2 && l3 != l1)) {
            System.out.println("O Triangulo é ISOCELES");

        } else if ((l1 != l3) && (l1 != l2) && (l3 != l1)) {
            System.out.println("O Triangulo é ESCALENO");

        } else if ((l1 == l2 && l1 == l3)) {
            System.out.println("O Triangulo é IQUILATERO");

        }

    }

    // TODO code application logic here
}
