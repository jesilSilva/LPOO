package Lista2Cap2;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jesiel Silva
 */
public class Viagem {

    String cidadeOrigem;
    String paisOrigem;
    String cidadeDestino;
    String paisDestino;
    Date dataIda;
    Date dataVolta;
    String nomeCompleto;
    String cpf;
    Double valor;

    public final String getCidadeOrigem() {
        return this.cidadeOrigem;
    }

    public final void setCidadeOrigem(final String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public final String getPaisOrigem() {
        return this.paisOrigem;
    }

    public final void setPaisOrigem(final String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public final String getCidadeDestino() {
        return this.cidadeDestino;
    }

    public final void setCidadeDestino(final String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public final String getPaisDestino() {
        return this.paisDestino;
    }

    public final void setPaisDestino(final String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public final Date getDataIda() {
        return this.dataIda;
    }

    public final void setDataIda(final Date dataIda) {
        this.dataIda = dataIda;
    }

    public final Date getDataVolta() {
        return this.dataVolta;
    }

    public final void setDataVolta(final Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public final String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public final void setNomeCompleto(final String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public final String getCpf() {
        return this.cpf;
    }

    public final void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public final Double getValor() {
        return this.valor;
    }

    public final void setValor(final Double valor) {
        this.valor = valor;
    }

    public Viagem(String cidadeOrigem, String paisOrigem, String cidadeDestino, String paisDestino, Date dataIda, Date dataVolta, String nomeCompleto, String cpf, Double valor) {
        this.cidadeOrigem = cidadeOrigem;
        this.paisOrigem = paisOrigem;
        this.cidadeDestino = cidadeDestino;
        this.paisDestino = paisDestino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.valor = valor;
    }

    public Viagem() {
    }

    public void mensagem() {
        System.out.println("\"Obrigado por escolher a nossa agência aérea\"");
        System.out.println("Origem: " + this.cidadeOrigem + " - " + this.paisOrigem
                + "           Destino: " + this.cidadeDestino + " - " + this.paisDestino);
        
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Valor: R$ " + df.format(valor));
        System.out.println("Nome passageiro:" + this.nomeCompleto);
        String bloco1 = cpf.substring(0, 3);
        String bloco2 = cpf.substring(3, 6);
        String bloco3 = cpf.substring(6, 9);
        String bloco4 = cpf.substring(9, 11);
        cpf = bloco1 + "." + bloco2 + "." + bloco3 + "-" + bloco4;
        System.out.println("CPF:" + cpf);
       
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de ida:" + sdf1.format(dataIda));

        System.out.println("Data de volta:" + sdf1.format(dataVolta));
        System.out.println("\"Desejamos que tenha excelente voo!!!\"");

    }

}
