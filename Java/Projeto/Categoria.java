package projetolpoo;


// importação necessária para ultilização das funções da linguagem;
import java.util.ArrayList;
import java.util.Scanner;

// qualificador e o nome da classe
public class Categoria {

    //Declaração de atributos e seus tipos e qualificadores de acesso
    private String nome;
    private int codigoCategoria;
    private String caracteristicas;
    private String esporteCategoria;
    private String restricao;

    //Declaração de criação da lista categoria
    ArrayList<Categoria> categoria = new ArrayList();

    //Sessões de metódos gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getEsporteCategoria() {
        return esporteCategoria;
    }

    public void setEsporteCategoria(String esporteCategoria) {
        this.esporteCategoria = esporteCategoria;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }

    //Contrutor vázio
    public Categoria() {
    }

    //Construtor com todos os atributos
    public Categoria(String nome, int codigoCategoria, String caracteristicas, String esporteCategoria, String restricao) {
        this.nome = nome;
        this.codigoCategoria = codigoCategoria;
        this.caracteristicas = caracteristicas;
        this.esporteCategoria = esporteCategoria;
        this.restricao = restricao;
    }

    //Metódo cadastar, nesse metódo é possível cadastrar categorias;
    public ArrayList<Categoria> cadastrar(ArrayList<Categoria> categoria, String nome, int codigoCategoria, String caracteristicas, String esporteCategoria, String restricao) {
        Categoria c = new Categoria();

        c.setNome(nome);
        c.setCodigoCategoria(codigoCategoria);
        c.setCaracteristicas(caracteristicas);
        c.setEsporteCategoria(esporteCategoria);
        c.setRestricao(restricao);

        categoria.add(c);

        System.out.println("Categoria cadastrada com sucesso!");
        System.out.println("\n\n\n");
        return categoria;
    }

    //Metódo registro de categoria, esse metódo é usado para ler os dados informados e 
    // inseri-lós no metódo de cadastro;
    public void registroCategoria() {
        Categoria c = new Categoria();
        Scanner leitura = new Scanner(System.in);
        System.out.println("************Cadastro categoria**************");

        System.out.println("Informe o nome da categoria:");
        String nome = leitura.next();
        c.setNome(nome);
        System.out.println("Informe o código:");
        int codigoCategoria = leitura.nextInt();
        c.setCodigoCategoria(codigoCategoria);
        System.out.println("Informe caracteristica");
        String caracteristicas = leitura.next();
        c.setCaracteristicas(caracteristicas);
        System.out.println("Informe o esporte:");
        String esporteCategoria = leitura.next();
        c.setEsporteCategoria(esporteCategoria);
        System.out.println("Informe a restrição:");
        String restricao = leitura.next();
        c.setRestricao(restricao);

        categoria = c.cadastrar(categoria, nome, codigoCategoria, caracteristicas, esporteCategoria, restricao);
    }

// Metódo usado para montar o menu específico da categoria
    public int menuCategoria(int opcao) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Bem vindo as funções da categoria!");
        System.out.println("Escolha uma opção abaixo.");
        System.out.println("1 - Cadastrar categoria");
        System.out.println("2 - Consultar categoria");
        System.out.println("3 - Alterar categoria");
        System.out.println("4 - Excluir categoria");
        System.out.print("Digite a opção desejada:");

        opcao = guardar.nextInt();
        return opcao;
    }

    //Metódo usado para consultar as categorias cadastradas;
    public ArrayList<Categoria> consultar(ArrayList<Categoria> categoria, String nome, int codigoCategoria, String caracteristicas, String esporteCategoria, String restricao) {

        for (int i = 0; i < categoria.size(); i++) {

            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("******Consulta Categoria********");
            System.out.println("********  Dados da Categoria ********");
            System.out.println("Nome da categoria: " + categoria.get(i).getNome());
            System.out.println("Código da categoria:" + categoria.get(i).getCodigoCategoria());
            System.out.println("Caracteristicas:" + categoria.get(i).getCaracteristicas());
            System.out.println("Categoria: " + categoria.get(i).getEsporteCategoria());
            System.out.println("Restrição: " + categoria.get(i).getRestricao());
            System.out.println("**********************************");
            System.out.println("\n\n\n");

        }
        if (categoria.isEmpty()) {
            System.out.println("Não existe categorias cadastradas!");
            System.out.println("\n\n\n");
        }

        return categoria;
    }

    // Metódo usado para excluir as categorias cadastradas
    public ArrayList<Categoria> excluir(ArrayList<Categoria> categoria, int codigoCategoria) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Exclusão da Categoria********************");
        System.out.println("Informe o código da categoria que deseja excluir:");
        codigoCategoria = c.nextInt();
        for (int i = 0; i < categoria.size(); i++) {

            if (categoria.get(i).getCodigoCategoria() == codigoCategoria) {
                categoria.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return categoria;
    }

    // Metódo para alterar as categorias cadastradas
    public ArrayList<Categoria> alterar(ArrayList<Categoria> categoria, String nome, int codigoCategoria, String caracteristicas, String esporteCategoria, String restricao) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Alteração da categoria********************");
        System.out.println("Informe o código da categoria que deseja alterar:");
        codigoCategoria = c.nextInt();
        for (int i = 0; i < categoria.size(); i++) {

            if (categoria.get(i).getCodigoCategoria() == codigoCategoria) {
                System.out.println("Informe o novo nome:");
                categoria.get(i).setNome(nome = c.next(nome));
                System.out.println("Informe o código da categoria:");
                categoria.get(i).setCodigoCategoria(codigoCategoria = c.nextInt());
                System.out.println("Informe a caracteristica:");
                categoria.get(i).setCaracteristicas(caracteristicas = c.next());
                System.out.println("Informe a categoria:");
                categoria.get(i).setEsporteCategoria(esporteCategoria = c.next());
                System.out.println("Informe a restrição:");
                categoria.get(i).setRestricao(restricao = c.next());

                System.out.println("Alterado com Sucesso");

            } else {
                System.out.println("Não existe categorias com esse código!");
            }
        }

        return categoria;
    }

}
