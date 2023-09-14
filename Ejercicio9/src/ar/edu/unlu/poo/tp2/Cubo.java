package ar.edu.unlu.poo.tp2;

public class Cubo extends Figura3d{
    private float arista;
    private String nombre = "cubo";

    public Cubo(float arista){
        this.arista = arista;
    }

    public float getArea(){
        return (float) (6 * Math.pow(arista,2));
    }

    public float getVolumen(){
        return (float) (Math.pow(arista,3));
    }

    public String getNombre() {
        return nombre;
    }
}
