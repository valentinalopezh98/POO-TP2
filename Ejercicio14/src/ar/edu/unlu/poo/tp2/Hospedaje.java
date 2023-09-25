package ar.edu.unlu.poo.tp2;

public class Hospedaje extends Proveedor{
    private int cantMinClientes;

    public Hospedaje(String razonSocial, String cuit, String telefono, float importeBase,
                     int cantMinClientes) {
        super(razonSocial, cuit, telefono, importeBase);
        setTipo(TipoProveedor.HOSPEDAJE);
        this.cantMinClientes = cantMinClientes;
    }

    @Override
    public float dineroAPagar(int MaxPaq) {
        if (MaxPaq>cantMinClientes){
            int diferencia = MaxPaq - cantMinClientes;
            return (float) (getImporteBase() - (getImporteBase() * 0.005 * diferencia));
        }
        return getImporteBase();
    }
}
