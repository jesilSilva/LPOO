package projetolpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    private String nome;
    private String email;
    private int codigoUsuario;
    private String senha;
    private int telefone;
    private int idade;
    ArrayList<Usuario> usuario = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Usuario(String nome, String email, int codigoUsuario, String senha, int telefone, int idade) {
        this.nome = nome;
        this.email = email;
        this.codigoUsuario = codigoUsuario;
        this.senha = senha;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Usuario() {
    }

    public ArrayList<Usuario> cadastrar(ArrayList<Usuario> usuario,String nome, String email, int codigoUsuario, String senha, int telefone, int idade) {
        Usuario u = new Usuario();

        u.setNome(nome);
        u.setEmail(email);
        u.setCodigoUsuario(codigoUsuario);
        u.setSenha(senha);
        u.setTelefone(telefone);
        u.setIdade(idade);

        usuario.add(u);

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("\n\n\n");
        return usuario;
    }

    
    public void registroUsuario() {
        Usuario u = new Usuario();
        Scanner guardar = new Scanner(System.in);
        System.out.println("************Cadastro Usuário**************");
        System.out.println("Informe o nome do usuário:");
        String nome = guardar.next();
        u.setNome(nome);
        System.out.println("Informe o e-mail:");
        String email = guardar.next();
        u.setEmail(email);
        System.out.println("Informe o código do usuário:");
        int codigoUsuario = guardar.nextInt();
        u.setCodigoUsuario(codigoUsuario);
        System.out.println("Informe a senha:");
        String senha = guardar.next();
        u.setSenha(senha);

        System.out.println("Informe o telefone do usuário:");
        int telefone = guardar.nextInt();
        u.setTelefone(telefone);
        System.out.println("Informe a idade do usuário:");
        int idade=guardar.nextInt();
        u.setIdade(idade);

        usuario = u.cadastrar(usuario, nome, email, codigoUsuario, senha, telefone, idade);
    }

    public int menuUsuario(int opcao) {
        Scanner guardar = new Scanner(System.in);
        System.out.println("Bem vindo as funções do usuário!");
        System.out.println("Escolha uma opção abaixo.");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Consultar usuário");
        System.out.println("3 - Alterar usuário");
        System.out.println("4 - Excluir usuário");
        System.out.print("Digite a opção desejada:");

        opcao = guardar.nextInt();
        return opcao;
    }

    public ArrayList<Usuario> consultar(ArrayList<Usuario> usuario,String nome, String email, int codigoUsuario, String senha, int telefone, int idade) {

        for (int i = 0; i < usuario.size(); i++) {
  
            System.out.println("\n\n\n\n\n\n\n\n\n");
            System.out.println("******Consulta Usuário********");
            System.out.println("********  Dados do Usuário ********");
            System.out.println("Nome: " + usuario.get(i).getNome());
            System.out.println("E-mail:" + usuario.get(i).getEmail());
            System.out.println("Código do usuário:" + usuario.get(i).getCodigoUsuario());
            System.out.println("Senha: " + usuario.get(i).getSenha());
            System.out.println("Telefone: " + usuario.get(i).getTelefone());
            System.out.println("Idade:"+usuario.get(i).getIdade());
            System.out.println("**********************************");
            System.out.println("\n\n\n");

        }
        if (usuario.isEmpty()) {
            System.out.println("Não existe usuários cadastrados!");
            System.out.println("\n\n\n");
        }

        return usuario;
    }

    public ArrayList<Usuario> excluir(ArrayList<Usuario> usuario, int codigoUsuario) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Exclusão do usuário********************");
        System.out.println("Informe o código do usuário que deseja excluir:");
        codigoUsuario = c.nextInt();
        for (int i = 0; i < usuario.size(); i++) {

            if (usuario.get(i).getCodigoUsuario()== codigoUsuario) {
                usuario.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }
        return usuario;
    }

    public ArrayList<Usuario> alterar(ArrayList<Usuario> usuario,String nome, String email, int codigoUsuario, String senha, int telefone, int idade) {
        Scanner c = new Scanner(System.in);
        System.out.println("****************Alteração do usuário********************");
        System.out.println("Informe o código do usuário que deseja alterar:");
        codigoUsuario = c.nextInt();
        for (int i = 0; i < usuario.size(); i++) {
         
            if (usuario.get(i).getCodigoUsuario()== codigoUsuario) {
                System.out.println("Informe o novo nome:");
                usuario.get(i).setNome(nome = c.next(nome));
                System.out.println("Informe o e-mail:");
                usuario.get(i).setEmail(email = c.next());
                System.out.println("Informe o código do usuário:");
                usuario.get(i).setCodigoUsuario(codigoUsuario = c.nextInt());
                System.out.println("Informe a senha:");
                usuario.get(i).setSenha(senha = c.next());
                System.out.println("Informe o telefone:");
                usuario.get(i).setTelefone(telefone = c.nextInt());
                System.out.println("Informe a idade:");
                usuario.get(i).setIdade(idade=c.nextInt());

                System.out.println("Alterado com Sucesso");

            } else {
                System.out.println("Não existe usuários com esse código!");
            }
        }

        return usuario;
    }

}