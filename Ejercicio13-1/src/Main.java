import ar.edu.unlu.poo.tp2.Pasajero;
import ar.edu.unlu.poo.tp2.Ticket;
import ar.edu.unlu.poo.tp2.Tripulante;
import ar.edu.unlu.poo.tp2.Vuelo;

public class Main {
    public static void main(String[] args) {
        Tripulante tripulante = new Tripulante("Camila Perez", "1234", "abc123", "Azafata");
        Pasajero pasajero = new Pasajero("Camila Perez", "1234", "abc123", 1);
        Vuelo vuelo = new Vuelo(1111,"Buenos Aires", "Madrid", "22hs");

        Ticket ticket = new Ticket(vuelo,pasajero,"15A");

        System.out.println(vuelo.agregarMiembro(pasajero,ticket));

    }
}