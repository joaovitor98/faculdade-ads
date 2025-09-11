package aula5;

public class CaixaEletronico {
    public static void sacar(double saldo, double valorSaque) throws SaldoInsuficienteException {
        if (valorSaque > saldo) {
            throw new SaldoInsuficienteException("\nSaldo insuficiente para saque");
        } else {
            System.out.printf("Saque realizado com sucesso! Novo saldo R$ %.2f", (saldo - valorSaque));
        }
    }
}