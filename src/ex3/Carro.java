package ex3;

public class Carro {
    private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int acelerar() {
        velocidade += 10;
        return velocidade;
    }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade -= 10;
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
        } else {
            System.out.println("O carro já está parado. Não é possível frear mais.");
        }
    }

    public String exibirVelocidade() {
        return "A velocidade do " + modelo + " é " + velocidade + " Km/h";
    }
}
