package listaheranca_seu_carlos;

/**
 *
 * @author Jesiel Carlos
 */
public class Cachorro extends Animal{
    
   private String raca;
   private String nome;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cachorro(String raca, String nome, String tipo, String cor) {
        super(tipo, cor);
        this.raca = raca;
        this.nome = nome;
    }
   
   @Override
   public String toString(){
        return "Raça:"+raca+"nome:"+nome;
   }
    
    
    
}
