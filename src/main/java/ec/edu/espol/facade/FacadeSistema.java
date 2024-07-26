package ec.edu.espol.facade;

public class FacadeSistema {
    private SistemaAntiguo sistemaAntiguo;

    public FacadeSistema(SistemaAntiguo sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    public void realizarTransaccion() {
        sistemaAntiguo.realizarTransaccion();
    }

    public void consultarEstado() {
        sistemaAntiguo.consultarEstado();
    }
}
