package ex5;

public class AlunoPosGraduacao extends Aluno {

    public AlunoPosGraduacao(String nome, int matricula) {
        super(nome, matricula);
    }

    public void exibirInformacoes() {
        System.out.println("O aluno " + nome + " da matricula " + matricula + " está cursando pós-graduação em Inteligencia Artificial");
    }
}
