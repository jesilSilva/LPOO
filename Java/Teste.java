
public class Teste {

	public static void main(final String[] args) {

		final Banco banco = new Banco();
		banco.criaConta();
		banco.criaConta();

		banco.TransferenciaContas();
		banco.excluirConta();
	}
}
