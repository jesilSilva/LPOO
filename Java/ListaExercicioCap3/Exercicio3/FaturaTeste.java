package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Jesiel Carlos
 */
public class FaturaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fatura fatura = new Fatura();

        Scanner guardar=new Scanner(System.in);
        
        
        String numero, tipo;
        int qtdCompradaItem;
        Double precoItem;
        
        System.out.println("Informe o número da fatura:");
        numero=guardar.next();
        fatura.setNumero(numero);
        
        System.out.println("Informe o tipo da fatura:");
        tipo=guardar.next();
        fatura.setTipo(tipo);
        
        System.out.println("Informe a quantidade comprada:");
        qtdCompradaItem=guardar.nextInt();
        fatura.setQtdCompradaItem(qtdCompradaItem);
        
        System.out.println("Informe o preço do item:");
        precoItem=guardar.nextDouble();
        fatura.setPrecoItem(precoItem);
        
        System.out.println("**************FATURA*****************");
        System.out.println("Número da fatura: "+fatura.getNumero());
        System.out.println("Tipo da fatura: "+fatura.getTipo());
        System.out.println("Qtd comprada: "+fatura.getQtdCompradaItem());
        System.out.println("Preço do item: "+fatura.getPrecoItem()+" R$");
        System.out.println("Total: "+fatura.calcula(qtdCompradaItem, precoItem)+" R$");
        
        
        
        
    }

}
