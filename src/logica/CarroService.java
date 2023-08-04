package logica;

import modelo.Carro;

public class CarroService {

    private ILogica info;

    public CarroService(ILogica info) {
        this.info = info;
    }

    public void guardarCocheDB(Carro carro) {
        System.out.println("Guardado");
        info.GuardarDatosCarros();
    }
}
