package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class PorComision extends Empleado{
    private int cantidadVentas;
    private float porcentajePorVenta;
    private static float PORCENTAJE_BONO;

    public PorComision(String nombre, String apellido, String telefono,
                       String cuit, LocalDate fechaNacimiento, float porcentajePorVenta){
        super(nombre,apellido,telefono,cuit,fechaNacimiento);
        this.porcentajePorVenta = porcentajePorVenta;
        cantidadVentas = 0;
    }

    public void agregarVentas(int monto){
        cantidadVentas += monto;
    }
    public void reiniciarVentas(){
        cantidadVentas = 0;
    }
    @Override
    public float calcularSueldo(){
        return cantidadVentas * porcentajePorVenta / 100;
    }

    @Override
    public float calcularBonoCumpleanos() {
        return (float) (super.calcularBonoCumpleanos() + (cantidadVentas * 0.005));
    }


}
