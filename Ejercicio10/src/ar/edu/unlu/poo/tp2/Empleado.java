package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;

public class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cuit;
    private LocalDate fechaNacimiento;
    private static float BASE_BONO_CUMPLEANOS = 2000;

    public Empleado(String nombre, String apellido, String telefono,
                    String cuit, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
        this.fechaNacimiento = fechaNacimiento;
    }
    public float calcularSueldo() {
        return 0;
    }

    public float entregarBonoCumpleanos(){
        if (fechaNacimiento.getMonthValue() == LocalDate.now().getMonthValue()){
            return calcularBonoCumpleanos();
        }
        return 0;
    }

    public float getBaseBonoCumpleanos() {
        return BASE_BONO_CUMPLEANOS;
    }

    public float calcularBonoCumpleanos() {
        return BASE_BONO_CUMPLEANOS;
    }


}
