package ar.edu.unlu.poo.tp2;

public class Circulo extends Figura2d{
    private float radio;
    private String nombre = "circulo";

    public Circulo(float radio){
        this.radio = radio;
    }
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(radio,2));
    }

    public String getNombre() {
        return nombre;
    }
}
