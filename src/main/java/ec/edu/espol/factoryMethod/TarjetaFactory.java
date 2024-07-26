package ec.edu.espol.factoryMethod;

public abstract class TarjetaFactory {
    public abstract Tarjeta crearTarjeta(String tipo);

    public Tarjeta solicitarTarjeta(String tipo) {
        Tarjeta tarjeta = crearTarjeta(tipo);
        return tarjeta;
    }
}
