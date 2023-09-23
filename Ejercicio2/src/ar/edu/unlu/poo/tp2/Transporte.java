package ar.edu.unlu.poo.tp2;

public class Transporte {
    private String nombre;
    private Proveedor proveedor;
    private TipoTransporte tipo;
    private float precio;

    public Transporte(String nombre, Proveedor proveedor,
                      TipoTransporte tipo, float precio){
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }
}
