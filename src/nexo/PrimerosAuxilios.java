package nexo;

public class PrimerosAuxilios implements Capacidad {

    @Override
    public TipoCapacidad getTipo() {
        return TipoCapacidad.PRIMEROS_AUXILIOS;
    }

    @Override
    public void ejecutar() {
        System.out.println("Realizando primeros auxilios...");
    }
}
