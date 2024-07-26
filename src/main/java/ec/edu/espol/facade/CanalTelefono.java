package ec.edu.espol.facade;

public class CanalTelefono implements Canal{
    private FacadeSistema facade;

    public CanalTelefono(FacadeSistema facade) {
        this.facade = facade;
    }

    @Override
    public void manejarTransaccion() {
        facade.realizarTransaccion();
    }

    @Override
    public void manejarConsultaEstado() {
        facade.consultarEstado();
    }
}
