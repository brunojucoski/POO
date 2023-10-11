import javax.swing.event.ListDataEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoMain {
    public static void main(String[] args) {


        Aluno Julia = new Aluno();
        Julia.setCodigo(5);
        Julia.setNome("Julia");
        Julia.setDataNascimento(LocalDate.of(1997, 12, 20 ));



        Professor Bruno = new Professor();
        Bruno.setCodigo(145);
        Bruno.setDataContratacao(LocalDate.of(2020, 12,06));
        Bruno.setNome("Bruno");

        Funcionario Elias = new Funcionario();
        Elias.setCargo("Auxiliar tecnico");
        Elias.setCodigo(155);
        Elias.setNome("Elias Martins");
        Elias.setSalario(2000.00);
        Elias.setDataNascimento(LocalDate.of(1980, 10, 10));





        Aluno aluno01 = new Aluno();
        Map< String, List<Integer>> disciplinas = new HashMap<>();
        List<Integer> notasMatematica = new ArrayList<>();
        List<Integer> notasPortugues = new ArrayList<>();



        Filiacao filiacao1 = new Filiacao();
        filiacao1.nomeMae = "Maria" ;
        filiacao1.nomePai = "Joao" ;

       // aluno01.filiacao = filiacao1;


        Bolsa bolsa = new Bolsa();
        bolsa.descricao = "PMC" ;
        bolsa.dataInicial = LocalDate.of(2023, 8, 22);
        bolsa.dataFinal = LocalDate.of(2023, 12, 25);

     //   aluno01.bolsa = bolsa;



        Frequencia freq1 = new Frequencia();
        freq1.dataAula = LocalDate.of(2023, 2, 30);
        freq1.presenca = true;

        Frequencia freq2 = new Frequencia();
        freq2.dataAula = LocalDate.of(2023, 9, 22);
        freq2.presenca = false;

        Frequencia freq3 = new Frequencia();
        freq3.dataAula = LocalDate.of(2023, 9, 23);
        freq3.presenca = true;

        Frequencia freq4 = new Frequencia();
        freq4.dataAula = LocalDate.of(2023, 9, 24);
        freq4.presenca = true;

    //    aluno01.frequencias.add(freq1);
    //    aluno01.frequencias.add(freq2);
    //    aluno01.frequencias.add(freq3);
    //    aluno01.frequencias.add(freq4);




  //      aluno01.codigo = 123456789;
    //    aluno01.nome = "Jaspion";
      //  aluno01.DataNascimento = LocalDate.of(1997, 10, 20);
        //aluno01.endereco = "Rua Otavio Antonio Vicente, 530" ;
      //  aluno01.telefone = "48 996217914";



        notasMatematica.add(10);
        notasMatematica.add(8);
        notasPortugues.add(8);
        notasPortugues.add(7);
        disciplinas.put("Matematica", notasMatematica);
        disciplinas.put("Português" , notasPortugues);
      //  aluno01.disciplinasNotas = disciplinas;
      //  aluno01.matricula = "78954asdf";

        aluno01.imprimirdadosAluno();
        aluno01.calcularMediaPorMateria();
        System.out.println(" O aluno possui a media geral de " + aluno01.calcularMedioGeral() );

        Integer mediaGeralAluno = aluno01.calcularMedioGeral();

        Boletim boletim = new Boletim();
     //   String MensagemAprovacao = boletim.
     //           Aprovadoounao(aluno01.nome , mediaGeralAluno, aluno01.calcularFrequencia() );

     //   System.out.println(MensagemAprovacao);


    //    Professor professor1 = new Professor ("Cris Vieira", "1654978" , "48996217955" ) ;
     //   Professor professor2 = new Professor ( " Edilson son " , " 5465798" , "48999555487", " rua tal");

    //    System.out.println(professor1);

      //  professor1.nome = "Max master" ;
      //  professor1.matricula = "123456" ;
      //  professor1.dataContratacao = LocalDate.of(2023, 08 , 25) ;
    //    System.out.println(professor1);











    }
}
