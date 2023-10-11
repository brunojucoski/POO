public class Funcionario extends Pessoa{

    private String cargo;
    private Double salario ;
    private String matricula;


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
