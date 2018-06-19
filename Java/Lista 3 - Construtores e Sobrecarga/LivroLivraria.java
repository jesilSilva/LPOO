package sobrecarga;

/**
 *
 * @author Jesiel Silva
 */
public class LivroLivraria {
     
    
    String nomeLivraria;
    String endereco;
    String telefone;
    String nomeLivro;
    String autorLivro;

    public String getNomeLivraria() {
        return nomeLivraria;
    }

    public void setNomeLivraria(String nomeLivraria) {
        this.nomeLivraria = nomeLivraria;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public LivroLivraria(String nomeLivraria, String endereco) {
        this.nomeLivraria = nomeLivraria;
        this.endereco = endereco;
    }

    public LivroLivraria(String nomeLivraria, String endereco, String telefone, String nomeLivro, String autorLivro) {
        this.nomeLivraria = nomeLivraria;
        this.endereco = endereco;
        this.telefone = telefone;
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
    }
    
    
}
