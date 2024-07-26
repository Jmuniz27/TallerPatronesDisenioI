package ec.edu.espol.facade;

public class Cliente {
    public static void main(String[] args) {
        SistemaAntiguo sistemaAntiguo = new SistemaAntiguo();
        FacadeSistema facade = new FacadeSistema(sistemaAntiguo);

        Canal canalWeb = new CanalWeb(facade);
        Canal canalMovil = new CanalMovil(facade);
        Canal canalTelefono = new CanalTelefono(facade);

        canalWeb.manejarTransaccion();
        canalMovil.manejarConsultaEstado();
        canalTelefono.manejarTransaccion();
    }
}
