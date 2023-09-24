package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private float importeTotal;
    private Cliente cliente;
    private Expendedor expendedor;
    private Empleado empleado;

    public Venta(float litros, Cliente cliente, Expendedor expendedor,
                 Empleado empleado){
        this.cliente = cliente;
        this.expendedor = expendedor;
        this.empleado = empleado;
        fecha = LocalDate.now();
        importeTotal = expendedor.expender(litros);
        cliente.agregarCompra(importeTotal);
        empleado.agregarVenta(importeTotal);
    }

    public Venta(float litros, Cliente cliente, Expendedor expendedor,
                 Empleado empleado, float descuento){
        this.cliente = cliente;
        this.expendedor = expendedor;
        this.empleado = empleado;
        fecha = LocalDate.now();
        importeTotal = expendedor.expender(litros) * descuento / 100;
        cliente.agregarCompra(importeTotal);
        empleado.agregarVenta(importeTotal);
    }

    public String getCombustible(){
        return expendedor.getCombustible();
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public String getEmpleado() {
        return empleado.getDni();
    }
}
