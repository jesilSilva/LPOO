package exercicio3;

public class TesteCasa {

	public static void main(final String[] args) {

		final Casa casa = new Casa();
		casa.pintar("Red");
		casa.porta1 = " porta A";
		casa.porta2 = "porta B";
		casa.porta3 = "porta c";

		casa.quantasPortasEstaoAbertas();

	}

}
