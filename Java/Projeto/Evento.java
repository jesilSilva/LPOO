package projetolpoo;

// importação necessária para ultilização das funções da linguagem;
import java.util.ArrayList;
import java.util.Scanner;

// qualificador e o nome da classe
public class Evento {

    //Declaração de atributos e seus tipos e qualificadores de acesso
    private String nome;
    private String data;
    private String local;
    private String horario;
    private Double custo;

    //Declaração de criação da lista evento
    ArrayList<Evento> evento = new ArrayList();

    //Sessões de metódos gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    //Contrutor vázio
    public Evento() {
    }

    //Construtor com todos os atributos
    public Evento(String nome, String data, String local, String horario, Double custo) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.horario = horario;
        this.custo = custo;
    }

    //Metódo cadastar, nesse metódo é possível cadastrar eventos;
    public ArrayList<Evento> cadastrar(ArrayList<Evento> evento, String nome, String data, String local, String horario, Double custo) {
        Evento ev = new Evento();

        ev.setNome(nome);
        ev.setData(data);
        ev.setLocal(local);
        ev.setHorario(horario);
        ev.setCusto(custo);

        evento.add(ev);

        System.out.println("Evento cadastrado com sucesso!");
        System.out.println("\n\n\n");
        return evento;
    }

    //Metódo registro de evento, esse metódo é usado para ler os dados informados e 
    // inseri-lós no metódo de cadastro;
    public void registroEvento() {
        Evento ev = new Evento();
        Scanner guardar = new Scanner(System.in);
        System.out.println("************Cadastro Evento**************");

        System.out.println("Informe o nome do Evento:");
        String nome = guardar.next();
        ev.setNome(nome);
        System.out.println("Informe a data do evento:");
        String data = guardar.next();
        ev.setData(data);
        System.out.println("Informe o local do evento:");
        String local = guardar.next();
        ev.setLocal(local);
        System.out.println("Informe o horário do evento:");
        String horario = guardar.next();
        ev.setHorario(horario);
        System.out.println("Informe o custo do evento:");
        Double custo = guardar.nextDouble();
        ev.setCusto(custo);

        evento = ev.cadastrar(evento, nome, data, local, horario, custo);
    }

    // Metódo usado para montar o menu específico do evento
    public int menuEvento(int opcao) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Bem vindo as funções do evento!");
        System.out.println("Escolha uma opção abaixo.");
        System.out.println("1 - Cadastrar evento");
        System.out.println("2 - Consultar evento");
        System.out.println("3 - Alterar evento");
        System.out.println("4 - Excluir evento");
        System.out.print("Digite a opção desejada:");

        opcao = guardar.nextInt();
        return opcao;
    }

    //Metódo usado para consultar os eventos cadastrados;
    public ArrayList<Evento> consultar(ArrayList<Evento> evento, String nome, String data, String local, String horario, Double custo) {

        for (int i = 0; i < evento.size(); i++) {

            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("******Consulta Evento********");
            System.out.println("********  Dados do Evento ********");
            System.out.println("Nome do evento: " + evento.get(i).getNome());
            System.out.println("Data:" + evento.get(i).getData());
            System.out.println("Local:" + evento.get(i).getLocal());
            System.out.println("Horário: " + evento.get(i).getHorario());
            System.out.println("Custo: " + evento.get(i).getCusto());
            System.out.println("**********************************");
            System.out.println("\n\n\n");

        }
        if (evento.isEmpty()) {
            System.out.println("Não existe eventos cadastrados!");
            System.out.println("\n\n\n");
        }

        return evento;
    }

    // Metódo usado para excluir os eventos cadastrados
    public ArrayList<Evento> excluir(ArrayList<Evento> evento, String nome) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Exclusão do evento********************");
        System.out.println("Informe nome do evento que deseja excluir:");
        nome = c.next();
        for (int i = 0; i < evento.size(); i++) {

            if (evento.get(i).getNome().equals(nome)) {
                evento.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return evento;
    }

// Metódo para alterar os eventos cadastrados
    public ArrayList<Evento> alterar(ArrayList<Evento> evento, String nome, String data, String local, String horario, Double custo) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Alteração do evento********************");
        System.out.println("Informe o nome do evento que deseja alterar:");
        nome = c.next();
        for (int i = 0; i < evento.size(); i++) {

            if (evento.get(i).getNome().equals(nome)) {
                System.out.println("Informe o novo nome:");
                evento.get(i).setNome(nome = c.next(nome));
                System.out.println("Informe a data:");
                evento.get(i).setData(data = c.next());
                System.out.println("Informe o local:");
                evento.get(i).setLocal(local = c.next());
                System.out.println("Informe o horário:");
                evento.get(i).setHorario(horario = c.next());
                System.out.println("Informe o custo :");
                evento.get(i).setCusto(custo = c.nextDouble());

                System.out.println("Alterado com Sucesso");

            } else {
                System.out.println("Não existe evento com esse nome!");
            }
        }

        return evento;
    }
}
