package sobrecarga;


/**
 *
 * @author Jesiel Silva
 */
public class Professor {
    Data dataAdmissao;
    String nomeProfessor;
    String nomeDepartamento;
  
    int numeroRegistro;

    public Data getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Data dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    
    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

   

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public Professor(String nomeProfessor, String nomeDepartamento, Data dataAdmissao, int numeroRegistro) {
        this.nomeProfessor = nomeProfessor;
        this.nomeDepartamento = nomeDepartamento;
        this.dataAdmissao = dataAdmissao;
        this.numeroRegistro = numeroRegistro;
    }
    
    public void imprimir_dados(){
        System.out.println("******Dados do professor********");
        System.out.println("Nome:"+ nomeProfessor);
        System.out.println("Departamento:"+nomeDepartamento);
        System.out.println("Data de admissão:"+dataAdmissao.imprimir());
        System.out.println("Número do registro do professor:"+numeroRegistro);
             
    }
    
    
}
