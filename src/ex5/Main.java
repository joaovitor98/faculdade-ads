package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do aluno da Graduação");
        String nome = leitura.nextLine();
        System.out.println("Digite a matricula do aluno da Graduação");
        int matricula = leitura.nextInt();
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(nome, matricula);
        alunoGraduacao.exibirInformacoes();

        System.out.println("");

        System.out.println("Digite o nome do aluno da Pós-Graduação");
        nome = leitura.nextLine();
        leitura.next();
        System.out.println("Digite a matricula do aluno da Pós-Graduação");
        matricula = leitura.nextInt();
        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao(nome, matricula);
        alunoPosGraduacao.exibirInformacoes();
    }
}
