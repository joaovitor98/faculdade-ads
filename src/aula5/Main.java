package aula5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do seu saldo");
        double saldo = leitura.nextDouble();

        System.out.println("Bem vindo ao Caixa Eletronico!");
        System.out.printf("Saldo atual: R$%.2f", saldo);

        try {
            System.out.println("\nDigite o valor para saque");
            double valor = leitura.nextDouble();

            CaixaEletronico caixa = new CaixaEletronico();

            caixa.sacar(saldo, valor);


        } catch (SaldoInsuficienteException e) {
            System.out.println("Operação não realizada" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado" + e.getMessage());
        }finally {
            System.out.println("\nObrigado por utilizar nosso caixa eletronico");
        }
    }
}