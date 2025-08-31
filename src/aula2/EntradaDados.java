package aula2;

import java.util.Scanner;

public class EntradaDados {
    public static String lerPessoa() {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = leitura.nextLine();

        System.out.println("Digite a idade:");
        int idade = leitura.nextInt();

        return "Nome: " + nome + "\nIdade: " + idade;
    }

    public static void main(String[] args) {
        String dados = lerPessoa();

        System.out.println("\n ---- Dados Informados ----");
        System.out.println(dados);
    }
}
