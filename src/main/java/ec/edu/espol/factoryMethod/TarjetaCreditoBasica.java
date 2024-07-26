package ec.edu.espol.factoryMethod;

public class TarjetaCreditoBasica implements TarjetaCredito {
    @Override
    public String obtenerTipoTarjeta() {
        return "Tarjeta de Crédito Básica";
    }

    @Override
    public double obtenerCostoAnual() {
        return 0.0;
    }

    @Override
    public double obtenerLimiteCredito() {
        return 1000.0;
    }
    
}
