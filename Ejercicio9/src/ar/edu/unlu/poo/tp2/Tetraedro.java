package ar.edu.unlu.poo.tp2;

public class Tetraedro extends Figura3d{
    private float arista;
    private String nombre = "tetraedro";

    public Tetraedro(float arista){
        this.arista = arista;
    }

    public float getArea(){
        return  (float) (Math.pow(arista,2) * Math.sqrt(3));
    }

    public float getVolumen(){
        return (float) (Math.pow(arista,3) * (Math.sqrt(2) / 12));
    }

    public String getNombre() {
        return nombre;
    }
}
