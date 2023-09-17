package ar.edu.unlu.poo.tp2;

import java.time.LocalTime;
import java.util.ArrayList;

public class Academia {
    private ArrayList<Discliplina> discliplinas = new ArrayList<>();
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    public void agregarDisciplina(String nombre){
        Discliplina discliplina = new Discliplina(nombre);
        discliplinas.add(discliplina);
    }

    public String disciplinaMasRedituable(){
        Discliplina masRedituable = discliplinas.get(0);
        for (Discliplina discliplina : discliplinas){
            if (discliplina.calcularRedito() > masRedituable.calcularRedito()){
                masRedituable = discliplina;
            }
        }
        return "La disciplina mas redituable es " + masRedituable.getNombre() +
                " con un rédito de $" + masRedituable.calcularRedito() + " mensual";
    }

    public boolean agregarComision(String nombreDisciplina,String dias, LocalTime hora, Nivel nivel,
                           Profesor profesor, String salon){
        for (Discliplina discliplina : discliplinas){
            if(discliplina.getNombre().equals(nombreDisciplina)){
                Comision com = discliplina.agregarComision(dias, hora, nivel,profesor,salon);
                profesor.agregarComision(com);
                return true;
            }
        }
        return false;
    }

    public void inscribirAlumno(String nombre, String apellido, String dni, String mail,
                                String telefono){
        Alumno alumno = new Alumno(nombre,apellido,dni,mail,telefono);
        alumnos.add(alumno);
    }

    public boolean anotarAlumnoAComision(String nombredisciplina, int comision, String dni) {
        for (Discliplina discliplina : discliplinas) {
            if (discliplina.getNombre().equals(nombredisciplina)) {
                if (discliplina.obtenerComision(comision) != null) {
                    for (Alumno alumno : alumnos) {
                        if (alumno.getDni().equals(dni)) {
                            alumno.anotarseAComision(discliplina.obtenerComision(comision));
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean anotarAsistencia(String dni, int comision){
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                alumno.asistirAClase(comision);
            }
        }
        return false;
    }
}
