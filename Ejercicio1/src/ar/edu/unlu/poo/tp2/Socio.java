package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Socio {
    private String nombre;
    private String apellido;
    private String direccion;
    private String email;
    private TipoSuscripcion suscripcion;
    private String dni;
    private static int socios = 0;
    private int numSocio;
    private LocalDate fechaInscripcion;
    private boolean pagoMensual = false;
    private int mesesDeuda = 0;

    public Socio(String nombre, String apellido, String direccion,
                 String mail, String dni, TipoSuscripcion tipo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = mail;
        this.dni = dni;
        this.suscripcion = tipo;
        this.fechaInscripcion = LocalDate.now();
        socios++;
        this.numSocio = socios;
    }

    public TipoSuscripcion getSuscripcion() {
        return suscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMesesDeuda() {
        return mesesDeuda;
    }

    public void abonar() {
        this.pagoMensual = true;
    }
}
