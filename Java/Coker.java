package listaheranca_seu_carlos;

/**
 *
 * @author Jesiel Carlos
 */
public class Coker extends Cachorro{
    
    
    boolean tosa;

    public boolean precisaTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public Coker(boolean tosa, String raca, String nome, String tipo, String cor) {
        super(raca, nome, tipo, cor);
        this.tosa = tosa;
    }
     
    
    
}
