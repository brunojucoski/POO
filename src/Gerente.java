public class Gerente extends  Funcionario{

    private Double salarioContratual ;
    private Double bonusVendasDepartamento ;
    private Double salarioFamilia;
    private Double fatorMultiplicador;

    public Double getSalarioContratual() {
        return salarioContratual;
    }

    public void setSalarioContratual(Double salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public Double getBonusVendasDepartamento() {
        return bonusVendasDepartamento;
    }

    public void setBonusVendasDepartamento(Double bonusVendasDepartamento) {
        this.bonusVendasDepartamento = bonusVendasDepartamento;
    }

    public Double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(Double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public Double getFatorMultiplicador() {
        return fatorMultiplicador;
    }

    public void setFatorMultiplicador(Double fatorMultiplicador) {
        this.fatorMultiplicador = fatorMultiplicador;
    }



    @Override
    public Double getSalario() {
        return ( (salarioContratual + bonusVendasDepartamento + salarioFamilia) * (100+fatorMultiplicador/100) ) ;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salarioContratual=" + salarioContratual +
                ", bonusVendasDepartamento=" + bonusVendasDepartamento +
                ", salarioFamilia=" + salarioFamilia +
                ", fatorMultiplicador=" + fatorMultiplicador +
                '}';
    }
}
