package ar.edu.unlu.poo.tp2;

public class Esfera extends Figura3d{
    private float radio;
    private String nombre = "esfera";

    public Esfera(float radio){
        this.radio = radio;
    }

    public float getArea() {
        return (float) (4 * Math.PI * Math.pow(radio,2));
    }

    public float getVolumen() {
        return (float) (4/3 * Math.PI * Math.pow(radio,3));
    }

    public String getNombre() {
        return nombre;
    }
}
