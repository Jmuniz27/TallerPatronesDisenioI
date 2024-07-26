package ec.edu.espol.factoryMethod;

public class TarjetaCreditoPremium implements TarjetaCredito {
    @Override
    public String obtenerTipoTarjeta() {
        return "Tarjeta de Crédito Premium";
    }

    @Override
    public double obtenerCostoAnual() {
        return 100.0;
    }

    @Override
    public double obtenerLimiteCredito() {
        return 5000.0;
    }
    
}
