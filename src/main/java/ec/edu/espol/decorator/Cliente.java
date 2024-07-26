package ec.edu.espol.decorator;

public class Cliente {
    public static void main(String[] args) {
        // Crear notificación base
        Notificacion notificacion = new NotificacionBase();

        // Envolver notificación con decoradores adicionales
        notificacion = new NotificacionWhatsApp(notificacion);
        notificacion = new NotificacionSignal(notificacion);
        notificacion = new NotificacionWire(notificacion);
        notificacion = new NotificacionTelegram(notificacion);

        // Enviar notificaciones
        notificacion.enviar();
    }
}
