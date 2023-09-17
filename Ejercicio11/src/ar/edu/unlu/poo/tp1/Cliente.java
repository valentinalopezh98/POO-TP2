package ar.edu.unlu.poo.tp1;

import java.util.ArrayList;

public class Cliente {
    private String nombreCompleto;
    private String dni;
    private ArrayList<Alquiler> alquileres;

    public Cliente(String nombreCompleto, String dni){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        alquileres = new ArrayList<>();
    }
    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public String getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public float montoTotalAlquileres(){
        float total = 0;
        for (Alquiler alquiler : alquileres){
            total += alquiler.getPrecioTotal();
        }
        return total;
    }
}
