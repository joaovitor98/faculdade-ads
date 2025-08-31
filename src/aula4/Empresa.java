package aula4;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        String nome;
        double salario;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();
        System.out.println("Digite seu salario:");
        salario = leitura.nextDouble();
        Funcionario funcionario1 = new Gerente(nome, salario);

        leitura.nextLine();

        System.out.println("Digite seu nome:");
        nome = leitura.nextLine();
        System.out.println("Digite seu salario:");
        salario = leitura.nextDouble();
        Funcionario funcionario2 = new Desenvolvedor(nome, salario);

        System.out.println("\n----- Gerente -----");
        System.out.println(funcionario1.exibirInfo());
        System.out.printf("Bonus: %.2f", funcionario1.calcularBonus());
        System.out.println("\n\n----- Desenvolvedor -----");
        System.out.println(funcionario2.exibirInfo());
        System.out.printf("Bonus: %.2f", funcionario2.calcularBonus());
    }
}
