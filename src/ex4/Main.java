package ex4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do titular:");
        String titular = leitura.nextLine();
        System.out.println("Digite o saldo da conta:");
        double saldo = leitura.nextDouble();
        Conta conta = new Conta(titular, saldo);
        System.out.println("Deseja depositar um valor? Se sim digite o preço");
        conta.depositar(leitura.nextDouble());
        System.out.println("Deseja sacar um valor? Se sim digite o preço");
        conta.sacar(leitura.nextDouble());

        System.out.println(conta.exibirSaldo());

    }
}