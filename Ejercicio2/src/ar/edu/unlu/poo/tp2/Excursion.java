package ar.edu.unlu.poo.tp2;

import java.time.LocalTime;

public class Excursion {
    private String nombre;
    private int duracionEnMinutos;
    private String guia;
    private float precio;

    public Excursion(String nombre, int duracion,
                     String guia, float precio){
        this.nombre = nombre;
        this.duracionEnMinutos = duracion;
        this.guia = guia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getGuia() {
        return guia;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
}
