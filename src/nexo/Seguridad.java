package nexo;

public class Seguridad extends Integrante {

    public Seguridad(int id, String nombre, int nivelExperiencia) {
        super(id, nombre, nivelExperiencia);
    }

    public void controlarSector() {
        System.out.println(
            getNombre() + " está controlando el sector."
        );
    }
}