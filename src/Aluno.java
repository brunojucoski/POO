import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Aluno {
    Integer codigo;
    String nome;
    LocalDate DataNascimento;
    String telefone;
    String endereco;
    Map<String, List<Integer>> disciplinasNotas;
    String matricula;
    Character sexo ;
    String CPF;
    String  RG;
    String curso;
    Filiacao filiacao;
    Bolsa bolsa;
    List<Frequencia> frequencias = new ArrayList<>();


    public void imprimirdadosAluno() {
        System.out.println( "código: " + codigo + "\n" + " Nome : " + nome + "\n"+ " Data de Nascimento: "+ DataNascimento );

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


    }


