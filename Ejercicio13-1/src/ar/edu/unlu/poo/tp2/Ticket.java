package ar.edu.unlu.poo.tp2;

public class Ticket {
    private Vuelo vuelo;
    private String asiento;
    private Pasajero pasajero;

    public Ticket(Vuelo vuelo, Pasajero pasajero, String asiento){
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.pasajero = pasajero;
    }

    public int getPasajero() {
        return pasajero.getNroPasajero();
    }

    public String getAsiento() {
        return asiento;
    }

    public int getVuelo() {
        return vuelo.getNroVuelo();
    }
}
