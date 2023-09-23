package ar.edu.unlu.poo.tp2;

public class Destino {
    private String nombre;
    private String pais;
    private Proveedor proveedor;

    public Destino(String nombre, String pais, Proveedor proveedor){
        this.nombre = nombre;
        this.pais = pais;
        this.proveedor = proveedor;
    }
    public String getNombre() {
        return nombre;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public String getPais() {
        return pais;
    }
}
