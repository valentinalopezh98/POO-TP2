import ar.edu.unlu.poo.tp1.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //CREA LA INSTANCIA DE EMPRESA
        Empresa empresa = new Empresa();

        // CREA UNA INSTANCIA DE CADA TIPO DE VEHICULO
        Auto auto = new Auto("AUTO111", 4, false);
        Combi combi = new Combi("COMBI222");
        Camioneta camioneta = new Camioneta("CAMIONETA333", 300);
        Camion camion = new Camion("CAMION444");

        // AGREGA LOS VEHICULOS A LA EMPRESA
        empresa.agregarVehiculo(auto);
        empresa.agregarVehiculo(combi);
        empresa.agregarVehiculo(camioneta);
        empresa.agregarVehiculo(camion);

        //CREA CLIENTES
        Cliente cliente1 = new Cliente("Juan Perez", "22333444");
        Cliente cliente2 = new Cliente("Maria Garcia", "33444555");

        //SOLICITA UN PRESUPUESTO PARA EL AUTO Y LO ALQUILA EL CLIENTE 1
        empresa.alquilarVehiculo(cliente1,empresa.pedirpresupuesto("AUTO111", 5),
                        LocalDate.of(2023,10,3));

        //SOLICITA UN PRESUPUESTO PARA EL CAMION Y LO ALQUILA EL CLIENTE 1
        empresa.alquilarVehiculo(cliente1,empresa.pedirpresupuesto("CAMION444", 2),
                LocalDate.of(2023,10,6));

        //SE SOLICITA UN PRESUPUESTO PARA LA COMBI Y PARA LA CAMBIONETA Y LAS ALQUILA EL CLIENTE 2

        empresa.alquilarVehiculo(cliente2,empresa.pedirpresupuesto("COMBI222", 5),
                LocalDate.of(2023,10,3));

        empresa.alquilarVehiculo(cliente2,empresa.pedirpresupuesto("CAMIONETA333", 5),
                LocalDate.of(2023,10,3));


        //MUESTRO TODOS LOS ALQUILERES
        System.out.println(empresa.mostrarAlquileres());
        System.out.println("MONTO TOTAL DE LOS ALQUILERES: $" + empresa.montoTotalDeAlquileres());


        System.out.println("MONTO TOTAL DE LOS ALQUILERES DEL CLIENTE 1: $" + cliente1.montoTotalAlquileres());
        System.out.println("MONTO TOTAL DE LOS ALQUILERES DEL CLIENTE 2: $" + cliente2.montoTotalAlquileres());
    }
}