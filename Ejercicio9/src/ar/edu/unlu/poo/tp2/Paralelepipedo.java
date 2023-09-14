package ar.edu.unlu.poo.tp2;

public class Paralelepipedo extends Figura3d{
    private float arista1;
    private float arista2;
    private float arista3;
    private String nombre = "paralepipedo";

    public Paralelepipedo(float arista1, float arista2, float arista3){
        this.arista1 = arista1;
        this.arista2 = arista2;
        this.arista3 = arista3;
    }

    public float getArea(){
        return 2 * (arista1 * arista2 + arista1 * arista3 + arista2 * arista3);
    }

    public float getVolumen(){
        return arista1 * arista2 * arista3;
    }

    public String getNombre() {
        return nombre;
    }
}
