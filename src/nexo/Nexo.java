package nexo;

public class Nexo {

    public static void main(String[] args) {
        Tecnico tecnico1 = new Tecnico(1, "Ana", 5);
        Tecnico tecnico2 = new Tecnico(2, "Juan", 3);

        Seguridad seguridad1 = new Seguridad(3, "Lucas", 4);
        Seguridad seguridad2 = new Seguridad(4, "Maria", 6);

        // Asignamos capacidades
        tecnico1.agregarCapacidad(new OperacionDron());

        seguridad1.agregarCapacidad(new PrimerosAuxilios());

        seguridad2.agregarCapacidad(new OperacionDron());
        seguridad2.agregarCapacidad(new PrimerosAuxilios());

        // Acciones propias de cada clase
        tecnico1.reparar();
        tecnico2.reparar();

        seguridad1.controlarSector();
        seguridad2.controlarSector();

        System.out.println("\n--- PRUEBA DE CAPACIDADES ---");

        // Ana sí tiene DRON
        tecnico1.ejecutarCapacidad(TipoCapacidad.DRON);

        // Juan no tiene DRON
        tecnico2.ejecutarCapacidad(TipoCapacidad.DRON);

        // Lucas tiene primeros auxilios
        seguridad1.ejecutarCapacidad(
                TipoCapacidad.PRIMEROS_AUXILIOS
        );

        // María tiene ambas
        seguridad2.ejecutarCapacidad(
                TipoCapacidad.DRON
        );

        seguridad2.ejecutarCapacidad(
                TipoCapacidad.PRIMEROS_AUXILIOS
        );
    }
}
