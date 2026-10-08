package nexo;

import java.util.ArrayList;

public abstract class Integrante {

    private int id;
    private String nombre;
    private int nivelExperiencia;
    private boolean disponibilidad;
    private ArrayList<Capacidad> capacidades;

    public Integrante(int id, String nombre, int nivelExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.nivelExperiencia = nivelExperiencia;
        this.capacidades = new ArrayList<>();
        this.disponibilidad = true;
    }

    public int getId() {
        return id;
    }
    public boolean getDisponibilidad(){
        return disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void agregarCapacidad(Capacidad capacidad) {
        capacidades.add(capacidad);
    }

    public ArrayList<Capacidad> getCapacidades() {
        return capacidades;
    }

    public void ejecutarCapacidad(TipoCapacidad tipo) {

        for (Capacidad c : capacidades) {

            if (c.getTipo() == tipo && this.disponibilidad == true) {
                c.ejecutar();
                this.disponibilidad = false;
                return;
            }
        }
        System.out.println(
            nombre + " no posee la capacidad " + tipo
        );
    }
    public void finalizarTarea (){
        if (this.disponibilidad = false){
        this.disponibilidad = true;
        }
    }
}