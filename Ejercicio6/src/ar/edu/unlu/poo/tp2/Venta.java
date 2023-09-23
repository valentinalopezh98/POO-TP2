package ar.edu.unlu.poo.tp2;

import java.sql.ClientInfoStatus;
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

    public String getCombustible(){
        return expendedor.getCombustible();
    }
}
