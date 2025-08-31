package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("digite o nome ");
        String nome = leia.nextLine();
        System.out.println("digite o preco ");
        double preco = leia.nextDouble();
        System.out.println("digite a quantidade ");
        int qtd = leia.nextInt();
        Produto produto = new Produto(nome, preco, qtd);

        System.out.println(produto.exibirinfo());
        System.out.println("Valor total: " + produto.calcularTotal(preco, qtd));

    }

}