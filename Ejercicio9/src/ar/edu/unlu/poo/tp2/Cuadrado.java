package ar.edu.unlu.poo.tp2;

public class Cuadrado extends Figura2d{
    private float lado;
    private String nombre = "cuadrado";
    public Cuadrado(float lado){
        this.lado = lado;
    }

    public float getArea() {
        return lado * lado;
    }

    public String getNombre() {
        return nombre;
    }
}
