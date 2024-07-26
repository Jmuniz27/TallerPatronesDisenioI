package ec.edu.espol.factoryMethod;

public class TarjetaCreditoVIP implements TarjetaCredito {
    @Override
    public String obtenerTipoTarjeta() {
        return "Tarjeta de Crédito VIP";
    }

    @Override
    public double obtenerCostoAnual() {
        return 500.0;
    }

    @Override
    public double obtenerLimiteCredito() {
        return 10000.0;
    }
    
}
