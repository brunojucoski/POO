import java.time.LocalDate;

public class Professor {

    String nome ;
    String matricula;
    String endereco;
    String telefone;
    LocalDate dataContratacao ;

    public Professor(String nome, String matricula, String telefone ) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
    }


    public Professor ( String nome, String matricula, String telefone, String endereco ) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }
}
}
