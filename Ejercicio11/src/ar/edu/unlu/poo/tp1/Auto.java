package ar.edu.unlu.poo.tp1;

public class Auto extends Vehiculo{
    private int cantidadAsientos;
    private boolean esVip;

    public Auto(String patente, int cantidadAsientos, boolean esVip){
        super(patente);
        this.cantidadAsientos = cantidadAsientos;
        this.esVip = esVip;
    }

    @Override
    public float calcularPrecioDiario() {
        if (esVip){
            return super.calcularPrecioDiario() + (cantidadAsientos * 500);
        }
        return super.calcularPrecioDiario() + (cantidadAsientos * 300);
    }
}
