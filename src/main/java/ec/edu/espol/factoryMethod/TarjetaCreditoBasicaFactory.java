package ec.edu.espol.factoryMethod;

public class TarjetaCreditoBasicaFactory implements TarjetaCreditoFactory {
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaCreditoBasica();
    }
    
}
