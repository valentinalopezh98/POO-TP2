import ar.edu.unlu.poo.tp2.Academia;
import ar.edu.unlu.poo.tp2.Alumno;
import ar.edu.unlu.poo.tp2.Nivel;
import ar.edu.unlu.poo.tp2.Profesor;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia();
        //Agrega dos disciplinas
        academia.agregarDisciplina("Contemporaneo");
        academia.agregarDisciplina("Tango");

        //Agrega dos profesores
        Profesor profesor1 = new Profesor("Juan", "Perez");
        Profesor profesor2 = new Profesor("Virginia", "Sanchez");

        //Crea 4 comimsiones
        academia.agregarComision("Contemporaneo", "Lunes y Miercoes",
                LocalTime.of(18,00), Nivel.INTERMEDIO, profesor2,
                "5");
        academia.agregarComision("Contemporaneo", "Lunes y Miercoes",
                LocalTime.of(19,00), Nivel.AVANZADO, profesor2,
                "5");
        academia.agregarComision("Tango", "Martes y Viernes",
                LocalTime.of(18,00), Nivel.INICIAL, profesor1,
                "5");
        academia.agregarComision("Tango", "Martes y Viernes",
                LocalTime.of(19,00), Nivel.INTERMEDIO, profesor1,
                "5");

        // Inscribe 3 alumnos
        academia.inscribirAlumno("Camila", "Lopez", "11111",
                "camila@gmail.com", "1122334455");
        academia.inscribirAlumno("Malena", "Perez", "22222",
                "malena@gmail.com", "1122884455");
        academia.inscribirAlumno("Florencia", "Garcia", "33333",
               "florencia@gmail.com", "1166334455");

        // Anota a los alumnos a la comision que quieren
        academia.anotarAlumnoAComision("Contemporaneo", 2,"11111");
        academia.anotarAlumnoAComision("Contemporaneo", 1, "22222");
        academia.anotarAlumnoAComision("Tango", 3, "33333");

        //Alumno 1 asiste 3 veces a clases de la comision 2
        academia.anotarAsistencia("11111",2);
        academia.anotarAsistencia("11111",2);
        academia.anotarAsistencia("11111",2);

        //Alumno 2 asiste 2 veces a clases de la comision 1
        academia.anotarAsistencia("22222",1);
        academia.anotarAsistencia("22222",1);

        //Alumno 3 asiste 6 veces a clases de la comision 3
        academia.anotarAsistencia("33333",3);
        academia.anotarAsistencia("33333",3);
        academia.anotarAsistencia("33333",3);
        academia.anotarAsistencia("33333",3);
        academia.anotarAsistencia("33333",3);
        academia.anotarAsistencia("33333",3);
        //Se calcula el sueldo del profesor 2(profesor de comisiones 1 y 2)
        //Deberia ser de $50
        System.out.println("Sueldo del profesor " + profesor2.getNombreCompleto() +
                ": $" + profesor2.calcularSueldo());

        //Se calcula el sueldo del profesor 1(profesor de comisiones 3 y 4)
        //Deberia ser de $60
        System.out.println("Sueldo del profesor " + profesor1.getNombreCompleto() +
                ": $" + profesor1.calcularSueldo());

        System.out.println(academia.disciplinaMasRedituable());
    }
}