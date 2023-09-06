import javax.swing.event.ListDataEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoMain {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        Map< String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();
        List<Boolean> frequenciaAluno = new ArrayList<>();

        frequenciaAluno.add(true);
        frequenciaAluno.add(true);
        frequenciaAluno.add(true);
        frequenciaAluno.add(true);
        frequenciaAluno.add(true);
        frequenciaAluno.add(false);

        aluno01.codigo = 123456789;
        aluno01.nome = "Jaspion";
        aluno01.DataNascimento = LocalDate.of(1997, 10, 20);
        aluno01.endereco = "Rua Otavio Antonio Vicente, 530" ;
        aluno01.telefone = "48 996217914";
        aluno01.frequenciaAluno = frequenciaAluno;

        notasMatematica.add(10);
        notasMatematica.add(8);
        notasPortugues.add(8);
        notasPortugues.add(7);
        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Português" , notasPortugues);
        aluno01.disciplinasNotas = disciplinas;
        aluno01.matricula = "78954asdf";

        aluno01.imprimirdadosAluno();
        aluno01.calcularMediaPorMateria();
        System.out.println(" O aluno possui a media geral de " + aluno01.calcularMedioGeral() );

        Integer mediaGeralAluno = aluno01.calcularMedioGeral();

        Boletim boletim = new Boletim();
        String MensagemAprovacao = boletim.
                Aprovadoounao(aluno01.nome , mediaGeralAluno, aluno01.calcularFrequencia() );

        System.out.println(MensagemAprovacao);






    }
}
