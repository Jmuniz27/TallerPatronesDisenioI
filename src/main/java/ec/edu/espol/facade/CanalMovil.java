package ec.edu.espol.facade;

public class CanalMovil implements Canal{
    private FacadeSistema facade;

    public CanalMovil(FacadeSistema facade) {
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
