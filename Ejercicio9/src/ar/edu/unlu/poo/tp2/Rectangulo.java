package ar.edu.unlu.poo.tp2;

public class Rectangulo extends Figura2d{
    private float altura;
    private float base;
    private String nombre = "rectangulo";

    public Rectangulo(float base, float altura){
        this.altura = altura;
        this.base = base;
    }

    public float getArea() {
        return base * altura;
    }

    public String getNombre() {
        return nombre;
    }
}
