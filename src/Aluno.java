import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno extends Pessoa {



    private String telefone;
    private String endereco;
    private Map<String, List<Integer>> disciplinasNotas;
    private Filiacao filiacao;
    private Bolsa bolsa;
    private List<Frequencia> frequencias = new ArrayList<>();







    public void imprimirdadosAluno() {
        System.out.println( "código: " + super.getCodigo() + "\n" + " Nome : " + super.getNome() + "\n"+ " Data de Nascimento: "+ super.getDataNascimento() );

    }



    public void calcularMediaPorMateria() {
        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            String nomeDisciplina= entry.getKey();
            List<Integer> notas = entry.getValue();

            System.out.println("Disciplina : "+ nomeDisciplina);
            Integer somaNotas = 0;
            for (Integer nota : notas) {
                somaNotas= somaNotas+nota;
            }
            System.out.println("Média: "+ (somaNotas / notas.size()));


        }
    }

    public Integer calcularMedioGeral() {

       Integer mediaGeral = 0;
        for (Map.Entry<String, List<Integer>> entry : disciplinasNotas.entrySet()) {
            List<Integer> notas = entry.getValue();
            Integer somaNotas = 0;

            for (Integer nota : notas) {
                somaNotas = somaNotas + nota;

            }

            mediaGeral += ( somaNotas / notas.size() );

            }
        return  ( mediaGeral/ disciplinasNotas.size() );
        }



    public Integer calcularFrequencia ( ) {

        Integer presenca = 0;
        Integer faltas = 0;

        for(Frequencia freq : this.frequencias) {
            if (freq.presenca == true) {
                presenca++;
            }
        }
        return ( presenca * 100 ) / frequencias.size() ;

    }



    //getters and setters

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

    public Map<String, List<Integer>> getDisciplinasNotas() {
        return disciplinasNotas;
    }

    public void setDisciplinasNotas(Map<String, List<Integer>> disciplinasNotas) {
        this.disciplinasNotas = disciplinasNotas;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public List<Frequencia> getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(List<Frequencia> frequencias) {
        this.frequencias = frequencias;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", disciplinasNotas=" + disciplinasNotas +
                ", filiacao=" + filiacao +
                ", bolsa=" + bolsa +
                ", frequencias=" + frequencias +
                '}';
    }
}


