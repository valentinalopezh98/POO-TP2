package ar.edu.unlu.poo.tp2;

public abstract class Proveedor {
    private String razonSocial;
    private String cuit;
    private String telefono;
    private TipoProveedor tipo;
    private float importeBase;

    public Proveedor (String razonSocial, String cuit,
                      String telefono, float importeBase){
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.telefono = telefono;
        this.importeBase = importeBase;
    }

    public abstract float dineroAPagar(int clientes);

    public String getTelefono() {
        return telefono;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public TipoProveedor getTipo() {
        return tipo;
    }

    public float getImporteBase() {
        return importeBase;
    }

    public void setTipo(TipoProveedor tipo) {
        this.tipo = tipo;
    }
}
