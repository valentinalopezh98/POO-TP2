package ar.edu.unlu.poo.tp1;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Presupuesto presupuesto;
    private LocalDate desde;
    private LocalDate hasta;
    private float precioTotal;

    public Alquiler(Cliente cliente, Presupuesto presupuesto, LocalDate desde){
        this.cliente = cliente;
        this.presupuesto = presupuesto;
        this.desde = desde;
        hasta = desde.plusDays(presupuesto.getCantidadDias());
        precioTotal = presupuesto.getPrecioTotal();
        cliente.agregarAlquiler(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public String toString(){
        return "Alquiler del vehiculo patente " + presupuesto.getVehiculo().getPatente() +
                ":\nCliente: " + cliente.getNombreCompleto() + " (" + cliente.getDni() + ")\n" +
                "Fecha de inicio: " + desde + "\nFecha fin: " + hasta + "\nTotal: $" +
                getPrecioTotal();
    }
}
