import ar.edu.unlu.poo.tp2.Club;
import ar.edu.unlu.poo.tp2.Mes;
import ar.edu.unlu.poo.tp2.TipoSuscripcion;

public class Main {
    public static void main(String[] args) {
        Club club = new Club();
        club.agregarActividad("Basquet", TipoSuscripcion.BASICA);
        club.agregarActividad("Tenis", TipoSuscripcion.DESTACADA);
        club.agregarActividad("Futbol", TipoSuscripcion.BASICA);
        club.agregarActividad("Hockey", TipoSuscripcion.INTERMEDIA);
        club.agregarActividad("Rugby", TipoSuscripcion.DESTACADA);
        club.agregarActividad("Patin", TipoSuscripcion.BASICA);
        club.agregarActividad("Esgrima", TipoSuscripcion.INTERMEDIA);

        club.agregarSocio("Maria", "Garcia", "San Martin 234",
                "maria@gmail.com", "41309532", TipoSuscripcion.INTERMEDIA);
        club.agregarSocio("Juan", "Perez", "San Juan 234",
                "juan@gmail.com", "41309332", TipoSuscripcion.BASICA);
        club.agregarSocio("Pedro", "Rodriguez", "Belgrano 234",
                "pedro@gmail.com", "44309532", TipoSuscripcion.DESTACADA);

        System.out.println(club.reporteMensual(Mes.SEPTIEMBRE));
        System.out.println(club.listadoActividades());
        System.out.println(club.listadoSocios());
    }
}