package aula3;

public class Carro extends Transporte {
    public Carro(String modelo) {
        super(modelo);
    }


    public void mover() {
        System.out.println("O carro " + modelo + " está rodando pelas ruas");
    }
}
