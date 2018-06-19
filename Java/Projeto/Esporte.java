package projetolpoo;

// importação necessária para ultilização das funções da linguagem;
import java.util.ArrayList;
import java.util.Scanner;

// qualificador e o nome da classe
public class Esporte {

    //Declaração de atributos e seus tipos e qualificadores de acesso
    private String nome;
    private int qtdParticipantes;
    private int codigoEsporte;
    private String regra;
    private String dataCriacao;

    //Declaração de criação da lista esporte
    ArrayList<Esporte> esporte = new ArrayList();

    //Sessões de metódos gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdParticipantes() {
        return qtdParticipantes;
    }

    public void setQtdParticipantes(int qtdParticipantes) {
        this.qtdParticipantes = qtdParticipantes;
    }

    public int getCodigoEsporte() {
        return codigoEsporte;
    }

    public void setCodigoEsporte(int codigoEsporte) {
        this.codigoEsporte = codigoEsporte;
    }

    public String getRegra() {
        return regra;
    }

    public void setRegra(String regra) {
        this.regra = regra;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

     //Construtor com todos os atributos
    public Esporte(String nome, int qtdParticipantes, int codigoEsporte, String regra, String dataCriacao) {
        this.nome = nome;
        this.qtdParticipantes = qtdParticipantes;
        this.codigoEsporte = codigoEsporte;
        this.regra = regra;
        this.dataCriacao = dataCriacao;
    }

    //Contrutor vázio
    public Esporte() {
    }

    //Metódo cadastar, nesse metódo é possível cadastrar esportes;
    public ArrayList<Esporte> cadastrar(ArrayList<Esporte> esporte, String nome, int qtdParticipantes, int codigoEsporte, String regra, String dataCriacao) {
        Esporte e = new Esporte();

        e.setNome(nome);
        e.setQtdParticipantes(qtdParticipantes);
        e.setCodigoEsporte(codigoEsporte);
        e.setRegra(regra);
        e.setDataCriacao(dataCriacao);

        esporte.add(e);

        System.out.println("Esporte cadastrado com sucesso!");
        System.out.println("\n\n\n");
        return esporte;
    }

     //Metódo registro de esporte, esse metódo é usado para ler os dados informados e 
    // inseri-lós no metódo de cadastro;
    public void registroEsporte() {
        Esporte e = new Esporte();
        Scanner leitura = new Scanner(System.in);
        System.out.println("************Cadastro esporte**************");

        System.out.println("Informe o nome do esporte:");
        String nome = leitura.next();
        e.setNome(nome);
        System.out.println("Informe a quantidade de participantes:");
        int qtdParticipantes = leitura.nextInt();
        e.setQtdParticipantes(qtdParticipantes);
        System.out.println("Informe o código do esporte:");
        int codigoEsporte = leitura.nextInt();
        e.setCodigoEsporte(codigoEsporte);
        System.out.println("Informe a regra do esporte:");
        String regra = leitura.next();
        e.setRegra(regra);
        System.out.println("Informe a data de criação:");
        String dataCriacao = leitura.next();
        e.setDataCriacao(dataCriacao);

        esporte = e.cadastrar(esporte, nome, qtdParticipantes, codigoEsporte, regra, dataCriacao);
    }

    // Metódo usado para montar o menu específico do esporte;
    public int menuEsporte(int opcao) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Bem vindo as funções do esporte!");
        System.out.println("Escolha uma opção abaixo.");
        System.out.println("1 - Cadastrar esporte");
        System.out.println("2 - Consultar esporte");
        System.out.println("3 - Alterar esporte");
        System.out.println("4 - Excluir esporte");
        System.out.print("Digite a opção desejada:");

        opcao = guardar.nextInt();
        return opcao;
    }

     //Metódo usado para consultar os esportes cadastrados;
    public ArrayList<Esporte> consultar(ArrayList<Esporte> esporte, String nome, int qtdParticipantes, int codigoEsporte, String regra, String dataCriacao) {

        for (int i = 0; i < esporte.size(); i++) {

            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("******Consulta Esporte********");
            System.out.println("********  Dados do esporte ********");
            System.out.println("Nome da esporte: " + esporte.get(i).getNome());
            System.out.println("Qtd participantes:" + esporte.get(i).getQtdParticipantes());
            System.out.println("código do esporte:" + esporte.get(i).getCodigoEsporte());
            System.out.println("Regra: " + esporte.get(i).getRegra());
            System.out.println("Data de criação: " + esporte.get(i).getDataCriacao());
            System.out.println("**********************************");
            System.out.println("\n\n\n");

        }
        if (esporte.isEmpty()) {
            System.out.println("Não existe esportes cadastrados!");
            System.out.println("\n\n\n");
        }

        return esporte;
    }

    // Metódo usado para excluir os esportes cadastrados
    public ArrayList<Esporte> excluir(ArrayList<Esporte> esporte, int codigoEsporte) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Exclusão do Esporte********************");
        System.out.println("Informe o código do esporte que deseja excluir:");
        codigoEsporte = c.nextInt();
        for (int i = 0; i < esporte.size(); i++) {

            if (esporte.get(i).getCodigoEsporte() == codigoEsporte) {
                esporte.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return esporte;
    }

    // Metódo para alterar os esportes cadastrados
    public ArrayList<Esporte> alterar(ArrayList<Esporte> esporte, String nome, int qtdParticipantes, int codigoEsporte, String regra, String dataCriacao) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Alteração do esporte********************");
        System.out.println("Informe o código do esporte que deseja alterar:");
        codigoEsporte = c.nextInt();
        for (int i = 0; i < esporte.size(); i++) {

            if (esporte.get(i).getCodigoEsporte() == codigoEsporte) {
                System.out.println("Informe o novo nome:");
                esporte.get(i).setNome(nome = c.next(nome));
                System.out.println("Informe a quantidade de participantes:");
                esporte.get(i).setQtdParticipantes(qtdParticipantes = c.nextInt());
                System.out.println("Informe o código do esporte:");
                esporte.get(i).setCodigoEsporte(codigoEsporte = c.nextInt());
                System.out.println("Informe a regra:");
                esporte.get(i).setRegra(regra = c.next());
                System.out.println("Informe a data de criação :");
                esporte.get(i).setDataCriacao(dataCriacao = c.next());

                System.out.println("Alterado com Sucesso");

            } else {
                System.out.println("Não existe esporte com esse código!");
            }
        }

        return esporte;
    }

}
