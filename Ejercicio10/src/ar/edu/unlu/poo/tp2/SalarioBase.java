package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class SalarioBase extends PorComision{
    private float salarioFijo;
    private static float EXTRA_POR_CUMPLEANOS = 1000;

    public SalarioBase(String nombre, String apellido, String telefono,
                       String cuit, LocalDate fechaNacimiento, float porcentajePorVenta,
                       float salarioFijo){
        super(nombre,apellido,telefono,cuit,fechaNacimiento,porcentajePorVenta);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public float calcularBonoCumpleanos() {
        return super.calcularBonoCumpleanos() + EXTRA_POR_CUMPLEANOS;
    }

    @Override
    public float calcularSueldo() {
        return super.calcularSueldo() + salarioFijo;
    }

    public void aumentarSueldo(float aumento){
        salarioFijo += aumento;
    }
}
