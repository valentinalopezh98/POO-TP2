package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Diario extends Publicacion{
    private LocalDate fechaPublicacion;
    public Diario(String nombre, String editor, String telefono,
                  LocalDate fechaPublicacion) {
        super(nombre, editor, telefono);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
}
