package ar.edu.unlu.poo.tp1;

public class Camioneta extends Vehiculo{
    private float pat;

    public Camioneta(String patente, float pat){
        super(patente);
        this.pat = pat;
    }

    @Override
    public float calcularPrecioDiario() {
        return super.calcularPrecioDiario() + (pat * 600);
    }
}
