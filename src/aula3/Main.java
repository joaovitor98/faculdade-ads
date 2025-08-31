package aula3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual tipo de veiculo você tem?");
        String veiculo = leitura.next();

        if (veiculo.equalsIgnoreCase("Carro")) {
            System.out.println("Digite o modelo do seu carro:");
            String modelo = leitura.next();
            Carro carro = new Carro(modelo);
            carro.mover();
        } else if (veiculo.equalsIgnoreCase("Avião") || veiculo.equalsIgnoreCase("Aviao")) {
            System.out.println("Digite o modelo do seu avião:");
            String modelo = leitura.next();
            Aviao aviao = new Aviao(modelo);
            aviao.mover();
        } else if (veiculo.equalsIgnoreCase("Barco")) {
            System.out.println("Digite o modelo do seu barco:");
            String modelo = leitura.next();
            Barco barco = new Barco(modelo);
            barco.mover();
        }


    }
}
