package ec.edu.espol.factoryMethod;

public class TarjetaCreditoFactory extends TarjetaFactory {
    public Tarjeta crearTarjeta(String tipo) {
        switch (tipo) {
            case "BASICA":
                return new TarjetaBasica();
            case "PREMIUM":
                return new TarjetaPremium();
            case "VIP":
                return new TarjetaVIP();
            default:
                throw new IllegalArgumentException("Tipo de tarjeta desconocido");
        }
    }
}