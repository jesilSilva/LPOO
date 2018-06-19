package Lista2Cap2;

import com.sun.org.apache.xpath.internal.axes.SubContextList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jesiel Silva
 */
public class TesteViagem {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        Viagem viagem = new Viagem();

        String cidadeOrigem;
        String paisOrigem;
        String cidadeDestino;
        String paisDestino;
        Double valor;
        String nomeCompleto, cpf;

        System.out.println("Informe seu nome completo:");
        nomeCompleto = guardar.next();
        viagem.setNomeCompleto(nomeCompleto);
        System.out.println("Informe seu CPF:");
        cpf = guardar.next();
        viagem.setCpf(cpf);
        System.out.println("Informe a cidade de origem:");
        cidadeOrigem = guardar.next();
        viagem.setCidadeOrigem(cidadeOrigem);
        System.out.println("Informe a pais de origem:");
        paisOrigem = guardar.next();
        viagem.setPaisOrigem(paisOrigem);
        System.out.println("Informe a cidade de destino:");
        cidadeDestino = guardar.next();
        viagem.setCidadeDestino(cidadeDestino);
        System.out.println("Informe a pais de destino:");
        paisDestino = guardar.next();
        viagem.setPaisDestino(paisDestino);

        System.out.println("Informe o valor da passagem");
        valor = guardar.nextDouble();
        viagem.setValor(valor);

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor informe as datas no formato:dd/MM/yyyy, usa barra após informar dia,mes e ano.");
            System.out.println("Informe a data de ida:");
            String dataIda = s.nextLine();
            System.out.println("Informe a data de volta:");
            String dataChegada = s.nextLine();

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dt = df.parse(dataIda);
            Date dtChegada = df.parse(dataChegada);

            viagem.setDataIda(dt);
            viagem.setDataVolta(dtChegada);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        viagem.mensagem();

    }

}
