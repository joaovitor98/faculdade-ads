package ex6;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract double processarPagamento();

    public String exibirValor() {
        return "Pagamento de R$" + String.format("%.2f", valor);
    }
}
