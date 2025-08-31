package ex6;

public class PagamentoPìx extends Pagamento {
    public PagamentoPìx(double valor) {
        super(valor);
    }

    @Override
    public double processarPagamento() {
        return valor;
    }
}
