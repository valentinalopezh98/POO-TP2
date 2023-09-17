package ar.edu.unlu.poo.tp1;

public class Presupuesto {
    private float precioTotal;
    private Vehiculo vehiculo;
    private int cantidadDias;

    public Presupuesto(float precioTotal, Vehiculo vehiculo, int cantidadDias){
        this.precioTotal = precioTotal;
        this.vehiculo = vehiculo;
        this.cantidadDias = cantidadDias;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String toString(){
        return "Presupuesto por el alquiler del vehiculo patente " + vehiculo.getPatente() +
                " por " + cantidadDias + ": $" + getPrecioTotal();
    }
}
