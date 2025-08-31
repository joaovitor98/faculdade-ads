package ex5;

public class Aluno implements Pessoa {
    protected String nome;
    protected int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("O aluno " + nome + " da matricula " + matricula);
    }
}
