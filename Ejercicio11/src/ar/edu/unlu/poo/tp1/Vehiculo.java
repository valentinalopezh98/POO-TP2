package ar.edu.unlu.poo.tp1;

public class Vehiculo {
    private String patente;
    private float precioBaseDiario = 3000;
    private boolean estaDisponible;

    public Vehiculo(String patente){
        this.patente = patente;
        estaDisponible = true;
    }

    public String getPatente() {
        return patente;
    }

    public float getPrecioBaseDiario() {
        return precioBaseDiario;
    }

    public float alquilar(int cantidadDias){
        if (estaDisponible) {
            estaDisponible = false;
            return calcularPrecioTotal(cantidadDias);
        }
        return -1;
    }

    public boolean estaDisponible(){
        return estaDisponible;
    }
    protected void setPrecioBaseDiario(float precioBaseDiario) {
        this.precioBaseDiario = precioBaseDiario;
    }

    public float calcularPrecioDiario(){
        return precioBaseDiario;
    }

    public float calcularPrecioTotal(int cantidadDeDias){
        return calcularPrecioDiario() * cantidadDeDias;
    }
}
