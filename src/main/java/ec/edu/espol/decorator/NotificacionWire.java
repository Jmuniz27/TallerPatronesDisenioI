package ec.edu.espol.decorator;

class NotificacionWire extends NotificacionDecorator {
    public NotificacionWire(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarWire();
    }

    private void enviarWire() {
        System.out.println("Enviando Wire...");
    }
}