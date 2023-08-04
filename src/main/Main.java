package main;

import logica.CarroService;
import modelo.Carro;
import modelo.Renault;
import modelo.Audi;
import bd.DatabaseMysql;

public class Main {
    public static void main(String[] args) {
        Carro[] vehiculos = {
                new Renault(),
                new Audi()
        };
    Carro.imprimirPrecioMedioCoche(vehiculos);

        //Guardar carro en la BD.
        CarroService service = new CarroService(new DatabaseMysql());


    }


}
