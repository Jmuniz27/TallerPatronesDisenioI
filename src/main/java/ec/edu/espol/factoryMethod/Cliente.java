package ec.edu.espol.factoryMethod;

public class Cliente {
    public static void main(String[] args) {
        TarjetaFactory factory = new TarjetaCreditoFactory();

        Tarjeta tarjeta1 = factory.solicitarTarjeta("BASICA");
        tarjeta1.mostrarInfo();

        Tarjeta tarjeta2 = factory.solicitarTarjeta("PREMIUM");
        tarjeta2.mostrarInfo();

        Tarjeta tarjeta3 = factory.solicitarTarjeta("VIP");
        tarjeta3.mostrarInfo();
    }
}