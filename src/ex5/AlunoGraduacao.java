package ex5;

public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(String nome, int matricula) {
        super(nome, matricula);
    }

    public void exibirInformacoes() {
        System.out.println("O aluno " + nome + " da matricula: " + matricula + " está cursando graduação na área de Sistemas de Informação");
    }
}
