package ar.edu.unlu.poo.tp2;

import java.util.ArrayList;

public class Tripulante extends Persona{
    private String cargo;
    private ArrayList<ReciboSueldo> recibos;
    public Tripulante(String nombre, String telefono, String direccion,
                      String cargo) {
        super(nombre, telefono, direccion);
        this.cargo = cargo;
        recibos = new ArrayList<>();
    }

    public void agregarRecibo(ReciboSueldo reciboSueldo){
        recibos.add(reciboSueldo);
    }

    public String getCargo() {
        return cargo;
    }
}
