package aula3;

public class Aviao extends Transporte {

    public Aviao(String modelo) {
        super(modelo);
    }


    public void mover() {
        System.out.println("O avião da " + modelo + " está voando por ai");
    }
}
