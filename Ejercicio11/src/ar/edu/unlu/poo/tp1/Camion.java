package ar.edu.unlu.poo.tp1;

public class Camion extends Vehiculo{
    private float precioBaseDiario = 0;
    private static final float precioFijoDiario = 100000;
    private static final float precioMayor30Dias = 75000;

    public Camion(String patente){
        super(patente);
    }

    @Override
    public float calcularPrecioDiario() {
        return precioFijoDiario;
    }

    @Override
    public float calcularPrecioTotal(int cantidadDeDias) {
        if (cantidadDeDias > 30){
            return cantidadDeDias * precioMayor30Dias;
        }
        return cantidadDeDias * precioFijoDiario;
    }
}
