package ar.edu.unlu.poo.tp2;

public class Ticket {
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Ticket(Vuelo vuelo, Pasajero pasajero, String asiento){
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    public int getPasajero() {
        return pasajero.getNroPasajero();
    }

    public int getVuelo() {
        return vuelo.getNroVuelo();
    }
}
