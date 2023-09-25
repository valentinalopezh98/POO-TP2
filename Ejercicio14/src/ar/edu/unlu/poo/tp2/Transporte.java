package ar.edu.unlu.poo.tp2;

public class Transporte extends Proveedor{
    public Transporte(String razonSocial, String cuit, String telefono, float importeBase) {
        super(razonSocial, cuit, telefono, importeBase);
        setTipo(TipoProveedor.TRANSPORTE);
    }
    @Override
    public float dineroAPagar(int cantClientes){
        return (float) (getImporteBase() + (getImporteBase() * 0.003 * cantClientes));
    }
}
