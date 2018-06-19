package sobrecarga;

/**
 *
 * @author Jesiel Silva
 */
public class Livro {

     int id;
    String titulo;
    String autor;
    String nomeEditora;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public Livro(int id, String titulo, String autor, String nomeEditora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.nomeEditora = nomeEditora;
    }
    
    
   
}
