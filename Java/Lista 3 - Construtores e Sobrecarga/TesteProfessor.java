package sobrecarga;

/**
 *
 * @author Jesiel Silva
 */
public class TesteProfessor {

    public static void main(String[] args) {


        Professor prof1 = new Professor("Miguelino", "Matemática",
                new Data(6, 12, 12), 8);

        prof1.imprimir_dados();


        Professor prof2 = new Professor("Rian ", "História",
                new Data(7, 11, 5), 5);

        prof2.imprimir_dados();


        Professor prof3 = new Professor("Rose ", "Fisíca",
                new Data(8, 11, 12), 3);

        prof3.imprimir_dados();
    }

}
