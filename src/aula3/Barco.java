package aula3;

public class Barco extends Transporte {
    public Barco(String modelo) {
        super(modelo);
    }

    public void mover() {
        System.out.println("O barco da navegando por ai");
    }
}
