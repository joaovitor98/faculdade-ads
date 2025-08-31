package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o modelo do carro");
        String modelo = leitura.next();
        System.out.println("Digite a velocidade atual do carro");
        int velocidade = leitura.nextInt();

        Carro carro = new Carro(modelo, velocidade);


        System.out.println("Deseja movimentar o carro?");
        char esc = leitura.next().charAt(0);
        do {
            System.out.println("Deseja acelerar ou frear a velocidade do carro?");
            String escolha = leitura.next();
            if (escolha.equalsIgnoreCase("Acelerar")) {
                carro.acelerar();
                System.out.println(carro.exibirVelocidade());
            } else if (escolha.equalsIgnoreCase("Frear")) {
                carro.frear();
                System.out.println(carro.exibirVelocidade());
            }
            System.out.println("Deseja movimentar o carro?");
            esc = leitura.next().charAt(0);
        } while (esc == 's');
    }
}
