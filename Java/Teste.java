/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo2_lista1;

import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco banco=new Banco();
        banco.criaConta();
        Scanner leitura=new Scanner(System.in);
        
        banco.excluirConta( );
    }
    
}
