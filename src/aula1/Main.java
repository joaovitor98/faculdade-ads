package aula1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitura.nextLine();
        System.out.println("Digite sua idade");
        int idade = leitura.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println(pessoa.exibirInfo());
    }
}
