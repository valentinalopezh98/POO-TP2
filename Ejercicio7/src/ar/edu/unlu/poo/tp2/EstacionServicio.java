package ar.edu.unlu.poo.tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstacionServicio {
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;
    private ArrayList<Expendedor> expendedores;
    private ArrayList<Venta> ventas;
    private ArrayList<String> combustibles;
    private List<Cliente> primeros10Clientes;
    private List<Venta> top10ventas;
    private int totalDeVentas;

    public EstacionServicio() {
        clientes = new ArrayList<>();
        empleados = new ArrayList<>();
        expendedores = new ArrayList<>();
        ventas = new ArrayList<>();
        combustibles = new ArrayList<>();
        primeros10Clientes = new ArrayList<>();
        top10ventas = new ArrayList<>();
        totalDeVentas = 0;
    }

    public void agregarCliente(String nombre, String patente) {
        Cliente cliente = new Cliente(nombre, patente);
        boolean esta = false;
        for (Cliente cliente1 : clientes) {
            if (cliente1.getPatente().equals(cliente.getPatente())) {
                esta = true;
            }
        }
        if (!esta) {
            clientes.add(cliente);
        }
    }

    public void agregarExpendedor(int codigo, Combustible combustible) {
        Expendedor expendedor = new Expendedor(codigo, combustible);
        boolean esta = false;
        for (Expendedor exp : expendedores) {
            if (exp.getCodigo() == (expendedor.getCodigo())) {
                esta = true;
            }
        }
        if (!esta) {
            expendedores.add(expendedor);
            combustibles.add(expendedor.getCombustible());
        }
    }

    public void agregarEmpleado(String nombre, String apellido,
                                String dni, String telefono) {
        Empleado empleado = new Empleado(nombre, apellido,
                dni, telefono);
        boolean esta = false;
        for (Empleado emp : empleados) {
            if (emp.getDni().equals(empleado.getDni())) {
                esta = true;
            }
        }
        if (!esta) {
            empleados.add(empleado);
        }
    }

    public void agregarVenta(float litros, String patenteCliente,
                             int codigoExpendedor, String dniEmpleado) {
        for (Expendedor expendedor : expendedores) {
            if (expendedor.getCodigo() == codigoExpendedor) {
                for (Empleado empleado : empleados) {
                    if (empleado.getDni().equals(dniEmpleado)) {
                        for (Cliente cliente : clientes) {
                            if (cliente.getPatente().equals(patenteCliente)) {
                                if (primeros10Clientes.contains(cliente)){
                                    Venta venta = new Venta(litros, cliente, expendedor, empleado,5);
                                    ventas.add(venta);
                                    totalDeVentas++;
                                } else {
                                    Venta venta = new Venta(litros, cliente, expendedor, empleado);
                                    ventas.add(venta);
                                    totalDeVentas++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void agregarVentaConDescuento(float litros, String patenteCliente,
                                         int codigoExpendedor, String dniEmpleado){
        for (Venta venta : top10ventas){
            if (venta.getEmpleado().equals(dniEmpleado)){
                for (Empleado empleado : empleados){
                    if (empleado.getDni().equals(dniEmpleado)){
                        if (!empleado.hizoDescuento()){
                            for (Expendedor expendedor : expendedores) {
                                if (expendedor.getCodigo() == codigoExpendedor) {
                                    for (Cliente cliente : clientes) {
                                        if (cliente.getPatente().equals(patenteCliente)) {
                                            if (primeros10Clientes.contains(cliente)){
                                                Venta v = new Venta(litros, cliente, expendedor, empleado,5);
                                                ventas.add(v);
                                                totalDeVentas++;
                                                empleado.realizoDescuento();
                                            } else {
                                                Venta v = new Venta(litros, cliente, expendedor, empleado);
                                                ventas.add(v);
                                                totalDeVentas++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }


    public String getProporcionDeVentasPorCombustible() {
        int cant = 0;
        String res = "PROPORCION DE VENTAS EFECTUADAS POR TIPO DE COMBUSTIBLE\n\n";
        for (String combustible : combustibles) {
            res += "Proporcion de ventas de " + combustible + ": ";
            for (Venta venta : ventas) {
                if (combustible.equals(venta.getCombustible())) {
                    cant++;
                }
            }
            res += (cant / totalDeVentas * 100) + "%\n";
            cant = 0;
        }
        return "";
    }

    private void ordenarExpendedoresPorMontoVenta(){
        Collections.sort(expendedores, (a, b) -> Float.compare(b.getMontoTotalVentas(),a.getMontoTotalVentas()));
    }

    private void ordenarExpendedoresPorLitros(){
        Collections.sort(expendedores, (a, b) -> Float.compare(b.getCantidadLitrosExpendidos(),a.getCantidadLitrosExpendidos()));
    }

    private void ordenarEmpleadosPorMontoVenta(){
        Collections.sort(empleados, (a, b) -> Float.compare(b.getMontoTotalVentas(), a.getMontoTotalVentas()));
    }

    private void ordenarClientesPorMontoCompra(){
        Collections.sort(clientes, (a, b) -> Float.compare(b.getMontoTotalCompras(), a.getMontoTotalCompras()));
    }

    private void ordenarVentasPorMonto(){
        Collections.sort(ventas, (a, b) -> Float.compare(b.getImporteTotal(), a.getImporteTotal()));
        top10ventas = ventas.subList(0, 10);
    }

    public String listadoExpendedoresPorMontoVenta(){
        ordenarExpendedoresPorMontoVenta();
        String res = "SURTIDORES ORDENADOS POR MONTO TOTAL DE VENTAS\n\n";
        for (Expendedor expendedor : expendedores){
            res += "Codigo: " + expendedor.getCodigo() + "($" + expendedor.getMontoTotalVentas() + ")\n";
        }
        return res;
    }

    public String listadoExpendedoresPorLitros(){
        ordenarExpendedoresPorLitros();
        String res = "SURTIDORES ORDENADOS LITROS EXPENDIDOS\n\n";
        for (Expendedor expendedor : expendedores){
            res += "Codigo: " + expendedor.getCodigo() + "(" + expendedor.getCantidadLitrosExpendidos() + "Lts.)\n";
        }
        return res;
    }

    public String listadoEmpleadosPorMontoVenta(){
        ordenarEmpleadosPorMontoVenta();
        String res = "EMPLEADOS ORDENADOS POR MONTO TOTAL DE VENTAS\n\n";
        for (Empleado empleado : empleados){
            res += empleado.getNombre() + " " + empleado.getApellido() +
                    "($"+ empleado.getMontoTotalVentas() +")\n";
        }
        return res;
    }

    public String top10Clientes(){
        ordenarClientesPorMontoCompra();
        primeros10Clientes = clientes.subList(0, 10);
        int i = 1;
        String res = "TOP 10 CLIENTES\n\n";
        for (Cliente cliente : primeros10Clientes){
            res += i + "º " + cliente.getNombre() + "(" + cliente.getPatente() + ")\n";
            i++;
        }
        return res;
    }
}



