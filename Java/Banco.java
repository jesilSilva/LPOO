import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
	ArrayList<Conta> listaConta = new ArrayList<Conta>();
	final Scanner leitura = new Scanner(System.in);

	public void criaConta() {
		final Conta conta = new Conta();
		System.out.println("Informe o número da conta:");
		conta.setNumero(this.leitura.nextInt());
		System.out.println("Saldo:");
		conta.setSaldo(this.leitura.nextFloat());
		System.out.println("Especial:");
		conta.setEspecial(this.leitura.nextBoolean());
		System.out.println("Limite:");
		conta.setLimite(this.leitura.nextFloat());
		this.listaConta.add(conta);
		System.out.println("Conta Criada com sucesso");
	}

	public ArrayList<Conta> excluirConta() {

		System.out.println("Informe o número da conta:");
		final int numero = this.leitura.nextInt();
		for (int i = 0; i < this.listaConta.size(); i++) {

			if (this.listaConta.get(i).getNumero() == numero) {
				this.listaConta.remove(i);
				System.out.println("O registro foi deletado com sucesso!");
			}
		}
		return this.listaConta;
	}

	public void saque() {

		System.out.println("Informe o número da conta que deseja realizar o saque:");
		final int numero = this.leitura.nextInt();
		for (int i = 0; i < this.listaConta.size(); i++) {
			if (this.listaConta.get(i).getNumero() == numero) {
				System.out.print("informe o valor do saque:");
				final float valor = this.leitura.nextFloat();
				System.out.println("Saque efetuado:" + (this.listaConta.get(i).getSaldo() - valor));
			}
		}
	}

	public void deposito() {
		System.out.println("Informe o número da conta A que deseja transferir dinheiro para conta B:");
		this.leitura.nextInt();
		for (int i = 0; i < this.listaConta.size(); i++) {
			System.out.println("Informe o número da conta que deseja realizar o saque:");
			final int numero = this.leitura.nextInt();
			for (i = 0; i < this.listaConta.size(); i++) {
				if (this.listaConta.get(i).getNumero() == numero) {
					System.out.println("Informe o valor do deposito:");
					this.listaConta.get(i).setSaldo(this.leitura.nextFloat());
				}
			}
		}
	}

	public void emissaoSaldo() {
		System.out.println("Informe o número da conta A que deseja transferir dinheiro para conta B:");
		this.leitura.nextInt();
		for (int i = 0; i < this.listaConta.size(); i++) {
			System.out.println("Emissão de saldo");
			System.out.println("Saldo:" + this.listaConta.get(i).getSaldo());
		}
	}

	public void extrato() {
		System.out.println("Informe o número da conta A que deseja transferir dinheiro para conta B:");
		final int numero = this.leitura.nextInt();
		for (int i = 0; i < this.listaConta.size(); i++) {
			if (this.listaConta.get(i).getNumero() == numero) {
				System.out.println("Extrato bancário:");
				System.out.println("Número da conta:" + this.listaConta.get(i).getNumero());
				System.out.println("Limite:" + this.listaConta.get(i).getLimite());
				System.out.println("Saldo:" + this.listaConta.get(i).getSaldo());
			}
		}
	}

	public void TransferenciaContas() {
		System.out.println("Informe o número da conta A que deseja transferir dinheiro para conta B:");
		int numero = this.leitura.nextInt();
		for (int i = 0; i < this.listaConta.size(); i++) {
			if (this.listaConta.get(i).getNumero() == numero) {
				System.out.println("Informe o valor que deseja transferir");
				final int valor = this.leitura.nextInt();

				if (valor > this.listaConta.get(i).getSaldo()) {
					System.out.print("O saldo é menor que o valor que deseja transferir");
				} else {
					System.out.println("Informe o número da conta B que receberar dinheiro da conta A:");
					numero = this.leitura.nextInt();
					for (i = 0; i < this.listaConta.size(); i++) {
						if (this.listaConta.get(i).getNumero() == numero) {
							System.out.println("Transferência efetuada:" + (this.listaConta.get(i).getSaldo() + valor));
						}
					}
				}
			}
		}
	}
}

