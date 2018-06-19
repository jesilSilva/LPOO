package Lista2Cap2;

/**
 *
 * @author Jesiel Silva
 */
public class Conta {

    Double valorSaque = 0.0;
    Double saldo = 0.0;
    Double valorDeposito = 0.0;

    public void saque(double valorSaque) {
        
        if (valorSaque > saldo ) {

            System.out.println("Saldo insuficiênte!" + saldo);
        } else {
            
            saldo = saldo - valorSaque;
            System.out.println("Saque Efetuado com sucesso!");
        }
    }

    public void deposito(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    public void impressaoSaldo() {

        System.out.println("--------IMPRESSÃO SALDO--------------");
        System.out.println("Nome: Joãozinho");
        System.out.println("RG: 345.05.010");
        System.out.println("Saldo disponível:");
        System.out.println("Valor:" + saldo+"R$");
        System.out.println("--------FIM IMPRESSAO SALDO--------------");
    }
}
