package ec.edu.espol.factoryMethod;

public class Cliente {
    public static void main(String[] args) {
        TarjetaCreditoFactory fabricaBasica = new TarjetaCreditoBasicaFactory();
        TarjetaCredito tarjetaBasica = fabricaBasica.crearTarjeta();
        System.out.println("Tipo de Tarjeta: " + tarjetaBasica.obtenerTipoTarjeta());
        System.out.println("Costo Anual: " + tarjetaBasica.obtenerCostoAnual());
        System.out.println("Límite de Crédito: " + tarjetaBasica.obtenerLimiteCredito());

        TarjetaCreditoFactory fabricaPremium = new TarjetaCreditoPremiumFactory();
        TarjetaCredito tarjetaPremium = fabricaPremium.crearTarjeta();
        System.out.println("Tipo de Tarjeta: " + tarjetaPremium.obtenerTipoTarjeta());
        System.out.println("Costo Anual: " + tarjetaPremium.obtenerCostoAnual());
        System.out.println("Límite de Crédito: " + tarjetaPremium.obtenerLimiteCredito());

        TarjetaCreditoFactory fabricaVIP = new TarjetaCreditoVIPFactory();
        TarjetaCredito tarjetaVIP = fabricaVIP.crearTarjeta();
        System.out.println("Tipo de Tarjeta: " + tarjetaVIP.obtenerTipoTarjeta());
        System.out.println("Costo Anual: " + tarjetaVIP.obtenerCostoAnual());
        System.out.println("Límite de Crédito: " + tarjetaVIP.obtenerLimiteCredito());
    }
}
