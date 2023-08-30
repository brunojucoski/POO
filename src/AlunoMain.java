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

        aluno01.codigo = 123456789;
        aluno01.nome = "Jaspion";
        aluno01.DataNascimento = LocalDate.of(1997, 10, 20);
        aluno01.endereco = "Rua Otavio Antonio Vicente, 530" ;
        aluno01.telefone = "48 996217914";

        notasMatematica.add(10);
        notasMatematica.add(8);
        notasPortugues.add(7);
        notasPortugues.add(6);
        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Português" , notasPortugues);
        aluno01.disciplinasNotas = disciplinas;
        aluno01.matricula = "78954asdf";

        aluno01.imprimirdadosAluno();
        aluno01.calcularMediaPorMateria();
        aluno01.calcularMedioGeral();




    }
}
