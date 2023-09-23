package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AgenciaTurismo {
    private ArrayList<Cliente> clientes;
    private ArrayList<Paquete> paquetes;
    private ArrayList <Proveedor> proveedores;
    private ArrayList <Venta> ventas;
    private Map<String, Integer> ventasPorDestino;

    public AgenciaTurismo(){
        clientes = new ArrayList<Cliente>();
        paquetes = new ArrayList<Paquete>();
        proveedores = new ArrayList<Proveedor>();
        ventas = new ArrayList<Venta>();
        ventasPorDestino = new HashMap<>();
    }
    public void realizarVenta(Cliente cliente, Paquete paquete){
        Venta venta = new Venta(cliente,paquete, LocalDate.now(),paquete.getPrecio());
        ventas.add(venta);
        agregarDestino(paquete.getDestino());
    }

    private void agregarDestino(String nombre){
        if (ventasPorDestino.containsKey(nombre)) {
            int cantidad = ventasPorDestino.get(nombre);
            cantidad++;
            ventasPorDestino.put(nombre,cantidad);
        } else {
            ventasPorDestino.put(nombre,0);
        }
    }
    public String obtenerDestinoFavorito(){
        String favorito = "";
        int mayor = 0;
        for (HashMap.Entry<String, Integer> entrada : ventasPorDestino.entrySet()) {
            if (entrada.getValue() > mayor){
                mayor = entrada.getValue();
                favorito = entrada.getKey();
            }
        }
        return favorito;
    }

    public String obtenerVentasPorDestino(){
        StringBuilder res = new StringBuilder("\t\tVENTAS POR DESTINO\n\n");
        for (String clave : ventasPorDestino.keySet()) {
            res.append(clave.toUpperCase(Locale.ROOT)).append(": \n");
            for (Venta venta : ventas){
                if (venta.obtenerDestino().equals(clave)){
                    res.append(venta.getCliente()).append("(").append(venta.getFecha()).append("): $").append(venta.getPrecio()).append("\n");
                }
            }
        }
        return res.toString();
    }
}
