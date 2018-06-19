package projetolpoo;

import java.util.Scanner;


public class ProjetoLPOO {

    
    public static void main(String[] args) {
       int opcao = 0;

        Categoria c = new Categoria();
        Esporte e = new Esporte();
        Evento ev = new Evento();
        Local l = new Local();
        Organizador o = new Organizador();
        Usuario u = new Usuario();
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.println("Bem vindo ao Team Catcher!");
            System.out.println("Escolha uma opção do menu que deseja acessar:");
            System.out.println("1 - Categoria");
            System.out.println("2 - Esporte");
            System.out.println("3 - Evento");
            System.out.println("4 - Local");
            System.out.println("5 - Organizador");
            System.out.println("6 - Usuario");
            System.out.println("7 - Sair");
            System.out.print("Digite a opção desejada:");
            opcao = leitura.nextInt();
            System.out.println("\n\n\n");
           

            switch (opcao) {
                case 1:

                    switch (c.menuCategoria(opcao)) {
                        
                        case 1:
                            
                            c.registroCategoria();
                            break;
                        case 2:

                            c.categoria = c.consultar(c.categoria, c.getNome(), c.getCodigoCategoria(), c.getCaracteristicas(), c.getEsporteCategoria(), c.getRestricao());
                            break;
                        case 3:
                            c.categoria=c.alterar(c.categoria, c.getNome(), c.getCodigoCategoria(), c.getCaracteristicas(), c.getEsporteCategoria(), c.getRestricao());
                            break;
                        case 4:
                            c.categoria = c.excluir(c.categoria, c.getCodigoCategoria());
                            break;
                        default:

                            System.out.println("Esta não é uma opção válida!");
                    }
                    break;
                case 2:
                    
                    switch (e.menuEsporte(opcao)) {
                        case 1:
                            e.registroEsporte();
                            break;
                        case 2:
                            e.esporte = e.consultar(e.esporte, e.getNome(), e.getQtdParticipantes(), e.getCodigoEsporte(), e.getRegra(), e.getDataCriacao());
                            break;
                        case 3:
                            e.esporte=e.alterar(e.esporte, e.getNome(), e.getQtdParticipantes(), e.getCodigoEsporte(), e.getRegra(), e.getDataCriacao());
                            break;
                        case 4:
                            e.esporte = e.excluir(e.esporte, e.getCodigoEsporte());
                            break;
                        default:

                            System.out.println("Esta não é uma opção válida!");
                    }
                    break;
                case 3:
                    
                    switch (ev.menuEvento(opcao)) {
                        case 1:
                            ev.registroEvento();
                            break;
                        case 2:
                            ev.evento = ev.consultar(ev.evento, ev.getNome(), ev.getData(), ev.getLocal(), ev.getHorario(), ev.getCusto());
                            break;
                        case 3:
                             ev.evento=ev.alterar(ev.evento, ev.getNome(), ev.getData(), ev.getLocal(), ev.getHorario(), ev.getCusto());
                            break;
                        case 4:
                            ev.evento=ev.excluir(ev.evento, ev.getNome());
                            break;
                        default:

                            System.out.println("Esta não é uma opção válida!");
                    }
                    break;

                case 4:
                    
                    switch (l.menuLocal(opcao)) {
                        case 1:
                            l.registroLocal();
                            break;
                        case 2:
                            l.local = l.consultar(l.local, l.getEndereco(), l.getNumero(), l.getBairro(), l.getComplemento(), l.getCep());
                            break;
                        case 3:
                            l.local=l.alterar(l.local, l.getEndereco(), l.getNumero(), l.getBairro(), l.getComplemento(), l.getCep());
                            break;
                        case 4:
                            l.local = l.excluir(l.local,l.getCep());

                            break;
                        default:

                            System.out.println("Esta não é uma opção válida!");
                    }
                    break;
                case 5:
                    
                    switch (o.menuOrganizador(opcao)) {
                        case 1:

                            o.registroLocal();
                            
                            break;
                        case 2:
                            o.organizador = o.consultar(o.organizador, o.getNome(), o.getCodigoOrganizador(), o.getEventoCriado(), o.getDescrição(), o.getNivelOrganizador());

                            break;
                        case 3:
                            o.organizador=o.alterar(o.organizador, o.getNome(), o.getCodigoOrganizador(), o.getEventoCriado(), o.getDescrição(), o.getNivelOrganizador());
                            break;
                        case 4:
                            o.organizador = o.excluir(o.organizador, o.getCodigoOrganizador());
                            break;
                        default:

                            System.out.println("Esta não é uma opção válida!");
                    }
                    break;
                case 6:
                    
                    switch (u.menuUsuario(opcao)) {
                        case 1:
                            u.registroUsuario();
                            break;
                        case 2:
                            u.usuario = u.consultar(u.usuario, u.getNome(), u.getEmail(), u.getCodigoUsuario(), u.getSenha(), u.getTelefone(), u.getIdade());
                            break;
                        case 3:
                            u.usuario=u.alterar(u.usuario, u.getNome(), u.getEmail(), u.getCodigoUsuario(), u.getSenha(), u.getTelefone(), u.getIdade());
                            break;
                        case 4:
                            u.usuario= u.excluir(u.usuario, u.getCodigoUsuario());
                            break;

                        default:
                            System.out.println("Esta não é uma opção válida!");
                    }
            }
        } while (opcao != 7);
        
        System.out.println("Volte sempre para usar o sistem Team Catcher!");
    }
    }
    

