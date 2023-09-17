package ar.edu.unlu.poo.tp2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;
    private String mail;
    private String telefono;
    private int cantidadAsistencias = 0;
    private ArrayList<Comision> comisiones = new ArrayList<>();

    public Alumno(String nombre, String apellido, String dni, String mail,
                  String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni =dni;
        this.mail = mail;
        this.telefono = telefono;
    }
    public boolean asistirAClase(int comision){
        for (Comision comision1 : comisiones){
            if (comision1.getNumeroDeComision() == comision){
                comision1.agregarAsistencia();
                cantidadAsistencias++;
                return true;
            }
        }
        return false;
    }

    public void reiniciarAsistencias(){
        cantidadAsistencias = 0;
    }
    public void anotarseAComision(Comision comision){
        comisiones.add(comision);
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

}
