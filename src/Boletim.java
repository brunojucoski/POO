public class Boletim {
    String aluno;

    public String Aprovadoounao(String aluno, Integer mediageral , Integer frequencia) {
        if (frequencia < 70){
            return  "REPROVADO";
        }



        if ( mediageral >= 7  ){
            return " O aluno " + aluno + " foi APROVADO ";
        }
        else if (mediageral >=5 ) {
            return " O aluno " + aluno + " devera fazer RECUPERAÇÃO.";
        }
        else {
            return " O aluno " + aluno + " foi REPROVADO. ";
        }
    }


}
