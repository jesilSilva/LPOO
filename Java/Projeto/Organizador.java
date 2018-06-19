package projetolpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Organizador {
    
    private String nome;
    private int codigoOrganizador;
    private String eventoCriado;
    private String descrição;
    private int nivelOrganizador;
     ArrayList<Organizador> organizador = new ArrayList();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoOrganizador() {
        return codigoOrganizador;
    }

    public void setCodigoOrganizador(int codigoOrganizador) {
        this.codigoOrganizador = codigoOrganizador;
    }

    public String getEventoCriado() {
        return eventoCriado;
    }

    public void setEventoCriado(String eventoCriado) {
        this.eventoCriado = eventoCriado;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getNivelOrganizador() {
        return nivelOrganizador;
    }

    public void setNivelOrganizador(int nivelOrganizador) {
        this.nivelOrganizador = nivelOrganizador;
    }
    
     public Organizador() {
    }

    public Organizador(String nome, int codigoOrganizador, String eventoCriado, String descrição, int nivelOrganizador) {
        this.nome = nome;
        this.codigoOrganizador = codigoOrganizador;
        this.eventoCriado = eventoCriado;
        this.descrição = descrição;
        this.nivelOrganizador = nivelOrganizador;
    }
    
    
     public ArrayList<Organizador> cadastrar(ArrayList<Organizador> organizador,String nome, int codigoOrganizador, String eventoCriado, String descrição, int nivelOrganizador) {
        Organizador o = new Organizador();

        o.setNome(nome);
        o.setCodigoOrganizador(codigoOrganizador);
        o.setEventoCriado(eventoCriado);
        o.setDescrição(descrição);
        o.setNivelOrganizador(nivelOrganizador);

        organizador.add(o);

        System.out.println("Organizador cadastrado com sucesso!");
        System.out.println("\n\n\n");
        return organizador;
    }

    public void registroLocal() {
        Organizador o = new Organizador();
        Scanner guardar = new Scanner(System.in);
        System.out.println("************Cadastro Organizador**************");

        
        System.out.println("Informe o nome do organizador:");
        String nome = guardar.next();
        o.setNome(nome);
         System.out.println("Informe o código do organizador:");
        int codigoOrganizador = guardar.nextInt();
        o.setCodigoOrganizador(codigoOrganizador);
        System.out.println("Informe o Evento criado:");
        String eventoCriado = guardar.next();
        o.setEventoCriado(eventoCriado);
        System.out.println("Informe a descrição:");
        String descricao = guardar.next();
        o.setDescrição(descricao);
       
        System.out.println("Informe o nível do organizador:");
        int nivelOrganizador = guardar.nextInt();
        o.setNivelOrganizador(nivelOrganizador);

        organizador = o.cadastrar(organizador, nome, codigoOrganizador, eventoCriado, descricao, nivelOrganizador);
    }

    public int menuOrganizador (int opcao) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Bem vindo as funções do organizador!");
        System.out.println("Escolha uma opção abaixo.");
        System.out.println("1 - Cadastrar organizador");
        System.out.println("2 - Consultar organizador");
        System.out.println("3 - Alterar organizador");
        System.out.println("4 - Excluir organizador");
        System.out.print("Digite a opção desejada:");

        opcao = guardar.nextInt();
        return opcao;
    }

    public ArrayList<Organizador> consultar(ArrayList<Organizador> organizador,String nome, int codigoOrganizador, String eventoCriado, String descrição, int nivelOrganizador) {

        for (int i = 0; i < organizador.size(); i++) {

            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("******Consulta Organizador********");
            System.out.println("********  Dados do Organizador ********");
            System.out.println("Nome: " + organizador.get(i).getNome());
            System.out.println("Código:" + organizador.get(i).getCodigoOrganizador());
            System.out.println("Evento:" + organizador.get(i).getEventoCriado());
            System.out.println("Descrição: " + organizador.get(i).getDescrição());
            System.out.println("Nível do organizador: " + organizador.get(i).getNivelOrganizador());
            System.out.println("**********************************");
            System.out.println("\n\n\n");

        }
        if (organizador.isEmpty()) {
            System.out.println("Não existe organizadores cadastrados!");
            System.out.println("\n\n\n");
        }

        return organizador;
    }

    public ArrayList<Organizador> excluir(ArrayList<Organizador> organizador, int codigoOrganizador) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Exclusão do organizador********************");
        System.out.println("Informe o código do organizador que deseja excluir:");
        codigoOrganizador = c.nextInt();
        for (int i = 0; i < organizador.size(); i++) {

            if (organizador.get(i).getCodigoOrganizador()==codigoOrganizador) {
                organizador.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return organizador;
    }

    public ArrayList<Organizador> alterar(ArrayList<Organizador> organizador,String nome, int codigoOrganizador, String eventoCriado, String descrição, int nivelOrganizador) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Alteração do organizador********************");
        System.out.println("Informe o código do organizador que deseja alterar:");
        codigoOrganizador = c.nextInt();
        for (int i = 0; i < organizador.size(); i++) {

            if (organizador.get(i).getCodigoOrganizador()==codigoOrganizador) {
                System.out.println("Informe o novo nome:");
                organizador.get(i).setNome(nome = c.next(nome));
                System.out.println("Informe o código do organizador:");
                organizador.get(i).setCodigoOrganizador(codigoOrganizador = c.nextInt());
                System.out.println("Informe o evento criado:");
                organizador.get(i).setEventoCriado(eventoCriado = c.next());
                System.out.println("Informe a descrição:");
                organizador.get(i).setDescrição(descrição = c.next());
                System.out.println("Informe o nível do organizador :");
                organizador.get(i).setNivelOrganizador(nivelOrganizador = c.nextInt());

                System.out.println("Alterado com Sucesso");

            } else {
                System.out.println("Não existe organizador com esse código!");
            }
        }

        return organizador;
    }

    
}
