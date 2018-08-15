package exercicio3;

public class TestePorta {

	public static void main(final String[] args) {

		 Porta porta = new Porta();

		porta.abre();
		porta.fecha();

		porta.pintar("Azul");

		porta.dimensaoX = 5;
		porta.dimensaoY = 6;
		porta.dimensaoZ = 7;

		porta.estaAberta();
	}

}
