package ar.edu.unlu.poo.tp2;

import java.time.LocalTime;
import java.util.ArrayList;

public class Discliplina {
    private String nombre;
    private ArrayList<Comision> comisiones = new ArrayList<>();

    public Discliplina(String nombre){
        this.nombre = nombre;
    }

    public Comision agregarComision(String dias, LocalTime hora, Nivel nivel, Profesor profesor,
                           String salon){
        Comision comision = new Comision(dias,hora,nivel,profesor,salon);
        comisiones.add(comision);
        return comision;
    }

    public float calcularRedito(){
        float redito = 0;
        for (Comision comision : comisiones){
            redito += comision.calcularReditoComision();
        }
        return redito;
    }

    public Comision obtenerComision(int n){
        for (Comision comision : comisiones){
            if (comision.getNumeroDeComision() == n){
                return comision;
            }
        }
        return null;
    }
    public String getNombre() {
        return nombre;
    }
}
