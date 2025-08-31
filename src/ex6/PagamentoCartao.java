package ex6;

public class PagamentoCartao extends Pagamento {


    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        double taxa = valor * 0.02;
        return valor - taxa;
    }
}
