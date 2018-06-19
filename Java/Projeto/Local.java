package projetolpoo;

// importação necessária para ultilização das funções da linguagem;
import java.util.ArrayList;
import java.util.Scanner;

// qualificador e o nome da classe
public class Local {

    //Declaração de atributos e seus tipos e qualificadores de acesso
    private String endereco;
    private int numero;
    private String bairro;
    private String complemento;
    private int cep;

    //Declaração de criação da lista local
     ArrayList<Local> local = new ArrayList();
     
     //Sessões de metódos gets e sets
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
    
    //Construtor com todos os atributos
     public Local(String endereco, int numero, String bairro, String complemento, int cep) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
    }

     //Contrutor vázio
    public Local() {
    }
    
    
    //Metódo cadastar, nesse metódo é possível cadastrar locais;
     public ArrayList<Local> cadastrar(ArrayList<Local> local,String endereco, int numero, String bairro, String complemento, int cep) {
        Local l = new Local();

        l.setEndereco(endereco);
        l.setNumero(numero);
        l.setBairro(bairro);
        l.setComplemento(complemento);
        l.setCep(cep);

        local.add(l);

        System.out.println("Local cadastrado com sucesso!");
        System.out.println("\n\n\n");
        return local;
    }

      //Metódo registro de locais, esse metódo é usado para ler os dados informados e 
    // inseri-lós no metódo de cadastro;
    public void registroLocal() {
        Local l = new Local();
        Scanner guardar = new Scanner(System.in);
        System.out.println("************Cadastro Local**************");

        
        System.out.println("Informe o endereço do local:");
        String endereco = guardar.next();
        l.setEndereco(endereco);
        System.out.println("Informe o número:");
        int numero = guardar.nextInt();
        l.setNumero(numero);
        System.out.println("Informe o bairro:");
        String bairro = guardar.next();
        l.setBairro(bairro);
        System.out.println("Informe o complemento:");
        String complemento = guardar.next();
        l.setComplemento(complemento);
        System.out.println("Informe o CEP:");
        int cep = guardar.nextInt();
        l.setCep(cep);

        local = l.cadastrar(local, endereco,  numero,  bairro,  complemento,  cep);
    }

    // Metódo usado para montar o menu específico do local
    public int menuLocal (int opcao) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Bem vindo as funções do local!");
        System.out.println("Escolha uma opção abaixo.");
        System.out.println("1 - Cadastrar local");
        System.out.println("2 - Consultar local");
        System.out.println("3 - Alterar local");
        System.out.println("4 - Excluir local");
        System.out.print("Digite a opção desejada:");

        opcao = guardar.nextInt();
        return opcao;
    }

     //Metódo usado para consultar os locais cadastrados;
    public ArrayList<Local> consultar(ArrayList<Local> local, String endereco, int numero, String bairro, String complemento, int cep) {

        for (int i = 0; i < local.size(); i++) {

            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("******Consulta Local********");
            System.out.println("********  Dados do Local ********");
            System.out.println("Endereço: " + local.get(i).getEndereco());
            System.out.println("Número:" + local.get(i).getNumero());
            System.out.println("Bairro:" + local.get(i).getBairro());
            System.out.println("Complemento: " + local.get(i).getComplemento());
            System.out.println("CEP: " + local.get(i).getCep());
            System.out.println("**********************************");
            System.out.println("\n\n\n");

        }
        if (local.isEmpty()) {
            System.out.println("Não existe locais cadastrados!");
            System.out.println("\n\n\n");
        }

        return local;
    }

     // Metódo usado para excluir oss locais cadastrados
    public ArrayList<Local> excluir(ArrayList<Local> evento, int cep) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Exclusão do Local********************");
        System.out.println("Informe o cep que deseja excluir endereço:");
        cep = c.nextInt();
        for (int i = 0; i < evento.size(); i++) {

            if (evento.get(i).getCep()==cep) {
                evento.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return local;
    }

     // Metódo para alterar as categorias cadastradas
    public ArrayList<Local> alterar(ArrayList<Local> local, String endereco, int numero, String bairro, String complemento, int cep) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Alteração do local********************");
        System.out.println("Informe o CEP do local que deseja alterar:");
        cep = c.nextInt();
        for (int i = 0; i < local.size(); i++) {

            if (local.get(i).getCep()==cep) {
                System.out.println("Informe o novo endereço:");
                local.get(i).setEndereco(endereco = c.next(endereco));
                System.out.println("Informe o número:");
                local.get(i).setNumero(numero = c.nextInt());
                System.out.println("Informe o bairro:");
                local.get(i).setBairro(bairro = c.next());
                System.out.println("Informe o complemento:");
                local.get(i).setComplemento(complemento = c.next());
                System.out.println("Informe o CEP :");
                local.get(i).setCep(cep = c.nextInt());

                System.out.println("Alterado com Sucesso");

            } else {
                System.out.println("Não existe locais com esse CEP!");
            }
        }

        return local;
    }

    
}
