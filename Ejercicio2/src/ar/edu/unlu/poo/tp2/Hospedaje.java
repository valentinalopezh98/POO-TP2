package ar.edu.unlu.poo.tp2;

public class Hospedaje {
    private float precio;
    private String nombre;
    private TipoHospedaje tipo;
    private Proveedor proveedor;

    public Hospedaje(float precio, String nombre,
                     TipoHospedaje tipo, Proveedor proveedor){
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public TipoHospedaje getTipo() {
        return tipo;
    }
}
