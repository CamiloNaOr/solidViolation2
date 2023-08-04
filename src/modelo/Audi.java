package modelo;

public class Audi extends Carro {

    private int precio;
    private String marca;

    public Audi() {
        precio = 25000;
        marca = this.getClass().getSimpleName();
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
