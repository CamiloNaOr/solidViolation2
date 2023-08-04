package modelo;

public abstract class Carro {

    public String marca;

    abstract String getMarca();
    abstract int getPrecio();

    public static void imprimirPrecioMedioCoche(Carro [] carros)
    {
        for (Carro carro : carros) {
            System.out.println(carro.getPrecio());
        }
    }

}
