package ex6;

public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        return valor;
    }
}
