package ar.edu.unlu.poo.tp2;

import java.util.ArrayList;

public class Tripulante extends Rol{
    private String cargo;
    private ArrayList<ReciboSueldo> recibos;
    public Tripulante(String cargo, int nroVuelo) {
        super(nroVuelo);
        this.cargo = cargo;
        recibos = new ArrayList<>();
        setRol("Tripulante");
    }

    public void agregarRecibo(ReciboSueldo reciboSueldo){
        recibos.add(reciboSueldo);
    }

    public String getCargo() {
        return cargo;
    }
}
