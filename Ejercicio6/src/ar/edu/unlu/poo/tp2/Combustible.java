package ar.edu.unlu.poo.tp2;

public class Combustible {
    private String nombre;
    private float precioPorLitro;

    public Combustible(String nombre, float precio){
        this.nombre = nombre;
        this.precioPorLitro = precio;
    }
    public String getNombre() {
        return nombre;
    }

    public float getPrecioPorLitro() {
        return precioPorLitro;
    }

    public void setPrecio(float precio) {
        this.precioPorLitro = precio;
    }
}
