package nexo;

public class OperacionDron implements Capacidad {
    @Override
    public TipoCapacidad getTipo() {
        return TipoCapacidad.DRON;
    }

    @Override
    public void ejecutar() {
        System.out.println("Operando dron...");
    }
}
