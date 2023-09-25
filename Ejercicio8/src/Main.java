import ar.edu.unlu.poo.tp2.Autor;
import ar.edu.unlu.poo.tp2.Biblioteca;
import ar.edu.unlu.poo.tp2.Socio;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Socio socio1 = new Socio("Juan Lopez", "1234", "123456764");
        Socio socio2 = new Socio("Matias Perez", "2345", "123456543");

        Autor claudia = new Autor("Claudia", "Pineiro");
        Autor alex = new Autor("Alex", "Michaelides");

        biblioteca.agregarPublicacion("Catedrales", "Planeta", "1223456789",
                claudia, 370, "1111",5);

        biblioteca.agregarPublicacion("La paciente silenciosa", "Planeta", "123456789",
                alex, 410, "2222", 7);

        biblioteca.prestarLibroPorISBN("1111",2,socio1,5);
        biblioteca.prestarLibroPorISBN("1111",4,socio2,3);
        biblioteca.prestarLibroPorISBN("2222",1,socio2,5);
        biblioteca.prestarLibroPorISBN("2222",5,socio1,8);

        System.out.println("Ejemplares prestados de Catedrales: \n" +
                biblioteca.ejemplaresPrestados("Catedrales"));

        System.out.println("Ejemplares prestados de La paciente silenciosa: \n" +
                biblioteca.ejemplaresPrestados("La paciente silenciosa"));
    }
}