package ec.edu.espol.decorator;

class NotificacionWhatsApp extends NotificacionDecorator {
    public NotificacionWhatsApp(Notificacion notificacion) {
        super(notificacion);
    }

    @Override
    public void enviar() {
        super.enviar();
        enviarWhatsApp();
    }

    private void enviarWhatsApp() {
        System.out.println("Enviando WhatsApp...");
    }
}
