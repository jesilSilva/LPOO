package exercicio3;

public class TesteEdificio {

	public static void main(final String[] args) {

		final Edificio edificio = new Edificio();

		edificio.pintar("Green");
		edificio.adicionarPorta(6);
		final Porta novaPorta = new Porta();
		novaPorta.abre();
		novaPorta.fecha();

		edificio.quantasPortasEstaoAbertas();
		edificio.totalDePortas();
		edificio.adicionarAndar();
		edificio.totalAndares();

	}

}
