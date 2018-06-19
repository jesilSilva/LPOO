package Exercicio4;

/**
 *
 * @author Jesiel Carlos
 */
public class Empregado {

    private String primeiroNome;
    private String sobrenome;
    private Double salarioMensal;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Double salarioAnual(Double salarioMensal) {
        if (salarioMensal < 0) {
            salarioMensal = 0.0;
        }
        Double salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }

    public Double aumento(Double salarioMensal) {
        if (salarioMensal < 0) {
            salarioMensal = 0.0;
        }
       
        Double aumento=0.10;
        Double salarioAumentado=(salarioMensal*aumento)+salarioMensal;
       
        return salarioAumentado*12;
    }

    public void dadosEmpregados(){
        System.out.println("Dados do empregado:");
        System.out.println("Nome: " + getPrimeiroNome());
        System.out.println("Sobrenome: " +getSobrenome());
        System.out.println("Salário anual sem aumento: R$ " +salarioAnual(salarioMensal));
        System.out.println("Salário anual com aumento de 10%: R$ " +aumento(salarioMensal));

    }
}
