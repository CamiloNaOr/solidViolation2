package modelo;
public class Renault extends Carro {

    private int precio;
    private String marca;

    public Renault() {
        this.precio = 18000;
        this.marca = this.getClass().getSimpleName();
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}