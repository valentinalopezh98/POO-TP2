package ar.edu.unlu.poo.tp2;

import java.util.ArrayList;

public class Profesor {
    private String nombre;
    private String apellido;
    private ArrayList<Comision> comisiones = new ArrayList<>();

    public Profesor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void agregarComision (Comision comision){
        comisiones.add(comision);
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public float calcularSueldo(){
        float sueldo = 0;
        for (Comision comision : comisiones){
            sueldo += comision.calcularReditoComision();
        }
        return sueldo;
    }
}
