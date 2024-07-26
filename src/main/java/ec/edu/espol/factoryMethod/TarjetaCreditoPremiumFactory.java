package ec.edu.espol.factoryMethod;

public class TarjetaCreditoPremiumFactory implements TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaCreditoPremium();
    }
    
}
