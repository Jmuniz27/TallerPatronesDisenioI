package ec.edu.espol.decorator;

public class NotificacionTelegram extends NotificacionDecorator{
    public NotificacionTelegram(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarTelegram();
    }

    private void enviarTelegram() {
        System.out.println("Enviando Telegram...");
    }
}
