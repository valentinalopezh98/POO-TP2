package ar.edu.unlu.poo.tp2;

import java.util.ArrayList;

public class Paquete {
    private Destino destino;
    private Hospedaje hospedaje;
    private Transporte transporte;
    private ArrayList<Excursion> excursiones;

    public Paquete(Destino destino, Hospedaje hospedaje,
                   Transporte transporte){
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        excursiones = new ArrayList<>();
    }

    public void agregarExcurision(Excursion excursion){
        excursiones.add(excursion);
    }

    public String getDestino() {
        return destino.getNombre();
    }

    public float getPrecio(){

        return hospedaje.getPrecio() + transporte.getPrecio();
    }
}
