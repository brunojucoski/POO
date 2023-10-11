import java.time.LocalDate;

public class Professor extends Funcionario {


    private LocalDate dataContratacao ;
    private String telefone ;
    private String endereco;



  //  public Professor(String nome, String matricula, String telefone ) {
    //    this.nome = nome;
      //  this.matricula = matricula;
        //this.telefone = telefone;
    //}



 //   public Professor ( String nome, String matricula, String telefone, String endereco ) {
   //     this.nome = nome;
    //    this.matricula = matricula;
     //   this.telefone = telefone;
       // this.endereco = endereco;
   // }


    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "dataContratacao=" + dataContratacao +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}

