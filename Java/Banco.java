/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo2_lista1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Antonio
 */
public class Banco {
ArrayList<Conta> listaConta= new ArrayList<Conta>();
    
public void criaConta(){
    Conta conta=new Conta();
    Scanner leitura= new Scanner (System.in);
    System.out.println("Informe o número da conta:");
    conta.setNumero(leitura.nextInt());
    System.out.println("Saldo:");
    conta.setSaldo(leitura.nextFloat());
    System.out.println("Especial:");
    conta.setEspecial(leitura.nextBoolean());
    System.out.println("Limite:");
    conta.setLimite(leitura.nextFloat());
    listaConta.add(conta);
    System.out.println("Conta Criada com sucesso");
}

 public ArrayList<Conta> excluirConta( ) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Informe o número da conta:");
       int numero = leitura.nextInt();
        for (int i = 0; i < listaConta.size(); i++) {

            if (listaConta.get(i).getNumero()== numero) {
                listaConta.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return listaConta;
    }

}
