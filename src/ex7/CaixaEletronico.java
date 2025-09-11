package ex7;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de saque inválido. Informe um valor maior que zero.");
        }
        if (valor > saldo) {
            throw new ValorInvalidoException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    public void saque(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito inválido. Informe um valor maior que zero.");
        }
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }
}