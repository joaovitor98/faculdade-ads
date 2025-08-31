package aula3;

public class Transporte implements Veiculo {
    protected String modelo;


    public Transporte(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        System.out.println(modelo + " está se movendo");
    }
}
