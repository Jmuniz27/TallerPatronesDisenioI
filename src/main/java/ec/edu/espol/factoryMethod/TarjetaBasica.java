package ec.edu.espol.factoryMethod;

public class TarjetaBasica implements Tarjeta{

    @Override
    public void mostrarInfo() {
        System.out.println("Tarjeta Básica: Costo anual bajo, límite de crédito bajo.");
    }

}
