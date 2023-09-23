package ar.edu.unlu.poo.tp2;

public class Cliente {
    private String nombre;
    private String patente;
    private float montoTotalCompras;

    public Cliente (String nombre, String patente){
        this.nombre = nombre;
        this.patente = patente;
        montoTotalCompras = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }

    public float getMontoTotalCompras() {
        return montoTotalCompras;
    }

    public void agregarCompra(float monto){
        montoTotalCompras += monto;
    }
}
