package ex6;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        return valor;
    }
}
