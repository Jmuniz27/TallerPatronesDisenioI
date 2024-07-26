package ec.edu.espol.decorator;

public class NotificacionSignal extends NotificacionDecorator {
    public NotificacionSignal(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarSignal();
    }

    private void enviarSignal() {
        System.out.println("Enviando Signal...");
    }
}
