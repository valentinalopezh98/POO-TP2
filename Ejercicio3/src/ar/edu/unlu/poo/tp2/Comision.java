package ar.edu.unlu.poo.tp2;

import java.time.LocalTime;

public class Comision {
    private static int cantidadDeComisiones = 0;
    private int numeroDeComision;
    private String dias;
    private LocalTime hora;
    private Nivel nivel;
    private Profesor profesor;
    private String salon;
    private int asistenciasMensuales = 0;
    private int cantidadDeAlumnos = 0;

    public Comision(String dias, LocalTime hora, Nivel nivel, Profesor profesor,
                    String salon){
        cantidadDeComisiones++;
        numeroDeComision = cantidadDeComisiones;
        this.dias = dias;
        this.hora = hora;
        this.nivel = nivel;
        this.profesor = profesor;
        this.salon = salon;
    }
    public int getNumeroDeComision() {
        return numeroDeComision;
    }

    public void agregarAsistencia(){
        asistenciasMensuales++;
    }

    public void reiniciarAsistenciasDelMes(){
        asistenciasMensuales = 0;
    }

    public void agregarAlumno(){
        cantidadDeAlumnos++;
    }

    public void quitarAlumno(){cantidadDeAlumnos--;}

    public float calcularReditoComision(){
        return asistenciasMensuales * 10;
    }
}
