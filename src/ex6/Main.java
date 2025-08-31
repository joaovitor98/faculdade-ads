package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o valor do Pagamento em cartão de credito: ");
        double valor = leitura.nextDouble();
        Pagamento pCartao = new PagamentoCartao(valor);
        System.out.println("Digite o valor do Pagamento em boleto: ");
        valor = leitura.nextDouble();
        Pagamento pBoleto = new PagamentoBoleto(valor);
        System.out.println("Digite o valor do Pagamento no PIX: ");
        valor = leitura.nextDouble();
        Pagamento pPix = new PagamentoPix(valor);

        System.out.println(pCartao.exibirValor() + " processado via Cartão de Crédito com taxa de 2%.\n");
        System.out.println(pBoleto.exibirValor() + " processado via Boleto Bancário (3 dias úteis para compensação).\n");
        System.out.println(pPix.exibirValor() + " processado via Pix (instantâneo).");

    }
}
