package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner leitura = new Scanner(System.in);
        CaixaEletronico conta = new CaixaEletronico(500.0); // saldo inicial

        do {
            System.out.println("\n------- Menu -------\n1 - Consultar saldo\n2 - Realizar depósito\n3 - Realizar saque\n0 - Sair\nEscolha uma opção: \n");
            opcao = leitura.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.printf("Saldo atual: %.2f%n", conta.consultarSaldo());
                        break;
                    case 2:
                        System.out.print("Informe o valor do depósito: ");
                        double deposito = leitura.nextDouble();
                        conta.deposito(deposito);
                        System.out.println("Depósito realizado com sucesso!");
                        break;
                    case 3:
                        System.out.print("Informe o valor do saque: ");
                        double saque = leitura.nextDouble();
                        conta.saque(saque);
                        System.out.println("Saque realizado com sucesso!");
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (ValorInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                if (opcao != 0) {
                    System.out.println("Operação finalizada.");
                }
            }
        } while (opcao != 0);
    }
}