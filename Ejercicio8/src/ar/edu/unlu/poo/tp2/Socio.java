package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Socio {
    private String nombre;
    private String dni;
    private String telefono;
    private boolean inhabilitado;
    private LocalDate fechaHasta;

    public Socio(String nombre, String dni, String telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        inhabilitado = false;
        fechaHasta = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public boolean isInhabilitado() {
        return inhabilitado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void inhabilitar(LocalDate fechaHasta){
        inhabilitado = true;
        this.fechaHasta = fechaHasta;
    }
}
