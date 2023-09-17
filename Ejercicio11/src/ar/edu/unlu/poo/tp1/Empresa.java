package ar.edu.unlu.poo.tp1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Alquiler> alquileres;

    public Empresa(){
        vehiculos = new ArrayList<>();
        alquileres = new ArrayList<>();
    }

    public boolean agregarVehiculo(Vehiculo vehiculo){
        if (vehiculos.contains(vehiculo)){
            return false;
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public Presupuesto pedirpresupuesto(String patente, int cantidadDeDias){
        Presupuesto presupuesto;
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.getPatente().equals(patente)){
                return presupuesto = new Presupuesto(vehiculo.calcularPrecioTotal(cantidadDeDias),
                        vehiculo, cantidadDeDias);
            }
        }
        return null;
    }

    public float alquilarVehiculo(Cliente cliente, Presupuesto presupuesto, LocalDate inicio){
        Alquiler alquiler = new Alquiler(cliente, presupuesto,inicio);
        if (presupuesto.getVehiculo().estaDisponible()){
            presupuesto.getVehiculo().alquilar(presupuesto.getCantidadDias());
            alquileres.add(alquiler);
        }
        return alquiler.getPrecioTotal();
    }

    public float montoTotalDeAlquileres(){
        float total = 0;
        for (Alquiler alquiler : alquileres){
            total += alquiler.getPrecioTotal();
        }
        return total;
    }

    public String mostrarAlquileres(){
        String mostrar = "";
        for (Alquiler alquiler : alquileres){
            mostrar += alquiler.toString() + "\n\n";
        }
        return mostrar;
    }

}
