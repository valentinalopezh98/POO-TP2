package ar.edu.unlu.poo.tp2;

public class Triangulo extends Figura2d{
    private float base;
    private float altura;
    private String nombre = "triangulo";
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float getArea() {
        return (base * altura) / 2;
    }

    public String getNombre() {
        return nombre;
    }
}
