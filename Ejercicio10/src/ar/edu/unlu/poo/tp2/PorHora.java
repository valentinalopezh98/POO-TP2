package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class PorHora extends Empleado{
    private float horasTrabajadas;
    private float montoPorHora;

    public PorHora(String nombre, String apellido, String telefono,
                   String cuit, LocalDate fechaNacimiento, float montoPorHora, float horasEstipuladas){
       super(nombre,apellido,telefono,cuit,fechaNacimiento);
       this.montoPorHora = montoPorHora;
       horasTrabajadas = horasEstipuladas;
    }
    @Override
    public float calcularSueldo(){
        float sueldo =  horasTrabajadas * montoPorHora;
        if (horasTrabajadas > 40){
            sueldo += sueldo * 0.2;
        }
        return sueldo;
    }
    public void agregarHorasTrabajadas(float horas){
        horasTrabajadas += horas;
    }

    public void reiniciarHorasEstipuladas(float horas){
        horasTrabajadas = horas;
    }

    public void aumentarMontoPorHora(float aumento){
        montoPorHora += aumento;
    }
}
