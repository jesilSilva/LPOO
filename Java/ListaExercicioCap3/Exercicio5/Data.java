package Exercicio5;

/**
 *
 * @author Jesiel Carlos
 */
public class Data {

    private int mes;
    private int dia;
    private int ano;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibiData() {

        System.out.println("A data é: " + dia + "/" + mes + "/" + ano);
    }
}
