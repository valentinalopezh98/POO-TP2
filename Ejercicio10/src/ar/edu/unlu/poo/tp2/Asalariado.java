package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Asalariado extends Empleado{
    private float sumaFijaMensual;
    private static float EXTRA_POR_CUMPLEANOS = 1000;

    public Asalariado(String nombre, String apellido, String telefono,
                      String cuit, LocalDate fechaNacimiento,float sumaFijaMensual){
        super(nombre,apellido, telefono, cuit, fechaNacimiento);
        this.sumaFijaMensual = sumaFijaMensual;
    }
    @Override
    public float calcularSueldo(){
        return sumaFijaMensual;
    }
    @Override
    public float calcularBonoCumpleanos() {
         return EXTRA_POR_CUMPLEANOS + super.getBaseBonoCumpleanos();
    }

    protected void aumentarSueldo(float aumento){
        sumaFijaMensual += aumento;
    }

    protected static void aumentarExtraPorCumpleanos(float aumento){
        EXTRA_POR_CUMPLEANOS += 1000;
    }

    public static float getExtraPorCumpleanos() {
        return EXTRA_POR_CUMPLEANOS;
    }

    public float getSumaFijaMensual() {
        return sumaFijaMensual;
    }
}
