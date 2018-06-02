package Exercicio5;

import java.util.Scanner;

public class DataTeste {

    
    public static void main(String[] args) {
       
        Scanner guardar=new Scanner(System.in);
        Data data=new Data();
        
        System.out.println("Informe o dia:");
        int dia=guardar.nextInt();
        data.setDia(dia);
        
        System.out.println("Informe o mês:");
        int mes=guardar.nextInt();
        data.setMes(mes);
        
        System.out.println("Informe o ano:");
        int ano=guardar.nextInt();
        data.setAno(ano);
        
        data.exibiData();
    }
    
}
