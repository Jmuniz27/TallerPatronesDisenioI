package ec.edu.espol.facade;

public class CanalWeb implements Canal{
    private FacadeSistema facade;

    public CanalWeb(FacadeSistema facade) {
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
