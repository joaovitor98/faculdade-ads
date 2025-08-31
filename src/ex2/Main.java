package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Digite a 1ª nota:");
        double nota1 = leitura.nextDouble();
        System.out.println("Digite a 2ª nota:");
        double nota2 = leitura.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2);

        System.out.printf("Média: %.2f%n", aluno.calcularMedia());
        System.out.println("Situação do Aluno: " + aluno.verificarAprovacao());
    }
}
