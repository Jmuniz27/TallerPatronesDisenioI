package ec.edu.espol.decorator;

abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void enviar() {
        notificacion.enviar();
    }
}