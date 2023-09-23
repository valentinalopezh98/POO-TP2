package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;

    public Cliente(String nombre, String apellido,
                   String mail, String telefono) {
        this.nombre = nombre;
        this.mail = mail;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
