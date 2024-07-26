package ec.edu.espol.decorator;

public class NotificacionBase implements Notificacion{
    @Override
    public void enviar() {
        enviarSMS();
        enviarEmail();
    }

    private void enviarSMS() {
        System.out.println("Enviando SMS...");
    }

    private void enviarEmail() {
        System.out.println("Enviando correo electrónico...");
    }
}
