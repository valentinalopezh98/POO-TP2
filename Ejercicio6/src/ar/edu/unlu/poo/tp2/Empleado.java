package ar.edu.unlu.poo.tp2;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private float montoTotalVentas;

    public Empleado(String nombre, String apellido,
                    String dni, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        montoTotalVentas = 0;
    }

    public void agregarVenta(float monto){
        montoTotalVentas += monto;
    }
    public float getMontoTotalVentas() {
        return montoTotalVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
}
