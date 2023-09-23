package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Paquete paquete;
    private LocalDate fecha;
    private float precio;

    public Venta(Cliente cliente, Paquete paquete, LocalDate fecha,
                 float precio){
        this.cliente = cliente;
        this.precio = precio;
        this.paquete = paquete;
        this.fecha = fecha;
    }
    public String obtenerDestino(){
        return paquete.getDestino();
    }

    public float getPrecio() {
        return  precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente.getNombre() + " " + cliente.getApellido();
    }
}
