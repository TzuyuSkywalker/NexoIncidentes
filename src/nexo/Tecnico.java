package nexo;

public class Tecnico extends Integrante {

    public Tecnico(int id, String nombre, int nivelExperiencia) {
        super(id, nombre, nivelExperiencia);
    }

    public void reparar() {
        System.out.println(
            getNombre() + " está reparando un sistema."
        );
    }
}
