package Exercicio3;

/**
 *
 * @author Jesiel Carlos
 */
public class Fatura {

    private String numero;
    private String tipo;
    private int qtdCompradaItem;
    private Double precoItem;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtdCompradaItem() {
        return qtdCompradaItem;
    }

    public void setQtdCompradaItem(int qtdCompradaItem) {
        this.qtdCompradaItem = qtdCompradaItem;
    }

    public Double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = precoItem;
    }

    public Double calcula(int qtdCompradaItem, Double precoItem) {
        if (qtdCompradaItem < 0 || precoItem < 0) {
            qtdCompradaItem = 0;
            precoItem = 0.0;
        }
        Double resultado = qtdCompradaItem * precoItem;
        return resultado;
    }

}
