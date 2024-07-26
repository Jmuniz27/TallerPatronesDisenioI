package ec.edu.espol.factoryMethod;

public class TarjetaVIP implements Tarjeta {

    @Override
    public void mostrarInfo() {
        System.out.println("Tarjeta VIP: Costo anual alto, límite de crédito alto.");
    }

}
