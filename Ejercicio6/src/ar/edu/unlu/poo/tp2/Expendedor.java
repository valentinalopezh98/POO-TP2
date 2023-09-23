package ar.edu.unlu.poo.tp2;

public class Expendedor {
    private int codigo;
    private Combustible combustible;
    private float cantidadLitrosExpendidos;
    private float montoTotalVentas;

    public Expendedor(int codigo, Combustible combustible){
        this.codigo = codigo;
        this.combustible = combustible;
        cantidadLitrosExpendidos = 0;
        montoTotalVentas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCombustible() {
        return combustible.getNombre();
    }

    public float expender(float cantidadLitros){
        cantidadLitrosExpendidos += cantidadLitros;
        montoTotalVentas += (combustible.getPrecioPorLitro() * cantidadLitros);
        return combustible.getPrecioPorLitro() * cantidadLitros;
    }

    public float getCantidadLitrosExpendidos() {
        return cantidadLitrosExpendidos;
    }

    public float getMontoTotalVentas() {
        return montoTotalVentas;
    }

}
