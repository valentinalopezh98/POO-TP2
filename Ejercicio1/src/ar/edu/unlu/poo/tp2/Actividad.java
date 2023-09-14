package ar.edu.unlu.poo.tp2;

public class Actividad {
    private String nombre;
    private TipoSuscripcion suscripcion;

    public Actividad(String nombre, TipoSuscripcion suscripcion){
        this.nombre = nombre;
        this.suscripcion = suscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoSuscripcion getSuscripcion() {
        return suscripcion;
    }

    void setSuscripcion(TipoSuscripcion tipo){
        this.suscripcion = tipo;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }
}
