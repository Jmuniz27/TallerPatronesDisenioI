package ec.edu.espol.factoryMethod;

public class TarjetaCreditoVIPFactory implements TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaCreditoVIP();
    }
    
}
