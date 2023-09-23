package ar.edu.unlu.poo.tp2;

public class Proveedor {
    private String razonSocial;
    private String cuit;
    private String telefono;
    private TipoProveedor tipo;

    public Proveedor (String razonSocial, String cuit,
                      String telefono, TipoProveedor tipo){
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public TipoProveedor getTipo() {
        return tipo;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }
}
