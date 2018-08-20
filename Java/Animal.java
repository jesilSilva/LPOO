
package listaheranca_seu_carlos;


public class Animal {
    
   private   String tipo;
    private String cor;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Animal(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }
    
   @Override
    public String toString(){
        return "Tipo:"+tipo+"Cor:"+cor ;
    }
    
}
