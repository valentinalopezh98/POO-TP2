import ar.edu.unlu.poo.tp2.Combustible;
import ar.edu.unlu.poo.tp2.EstacionServicio;

public class Main {
    public static void main(String[] args) {
        EstacionServicio estacionServicio = new EstacionServicio();
        //CREA LOS TIPOS DE COMBUSTIBLE
        Combustible nafta = new Combustible("Nafta", 90);
        Combustible gasoil = new Combustible("Gasoil", 85);
        Combustible kerosene = new Combustible("Kerosene", 100);

        //AGREGA EMPLEADOS
        estacionServicio.agregarEmpleado("Juan","Lopez","1111", "1234567890");
        estacionServicio.agregarEmpleado("Pedro", "Perez", "2222", "1234567899");
        estacionServicio.agregarEmpleado("Carlos", "Rodriguez", "3333", "12345678903");

        //AGREGA 11 CLIENTES
        estacionServicio.agregarCliente("Martín Pérez", "AAA111");
        estacionServicio.agregarCliente("Carla Rodríguez", "BBB222");
        estacionServicio.agregarCliente("Pablo López", "CCC333");
        estacionServicio.agregarCliente("Natalia González", "DDD444");
        estacionServicio.agregarCliente("Andrés Fernández", "EEE555");
        estacionServicio.agregarCliente("María Martínez", "FFF666");
        estacionServicio.agregarCliente("Sebastián Torres", "GGG777");
        estacionServicio.agregarCliente("Valeria Sánchez", "HHH888");
        estacionServicio.agregarCliente("Juan Silva", "III999");
        estacionServicio.agregarCliente("Camila Morales", "JJJ000");
        estacionServicio.agregarCliente("Diego Gómez", "KKK111");


        //AGREGA 3 EXPENDEDORES
        estacionServicio.agregarExpendedor(1,nafta);
        estacionServicio.agregarExpendedor(2, gasoil);
        estacionServicio.agregarExpendedor(3,kerosene);

        //AGREGA VARIAS VENTAS
        estacionServicio.agregarVenta(20, "AAA111", 1,"1111");
        estacionServicio.agregarVenta(10, "AAA111", 1,"1111");
        estacionServicio.agregarVenta(20, "AAA111", 2,"1111");
        estacionServicio.agregarVenta(20, "AAA111", 2, "1111");
        estacionServicio.agregarVenta(30, "BBB222", 3,"1111");
        estacionServicio.agregarVenta(80, "BBB222", 1,"2222");
        estacionServicio.agregarVenta(30, "CCC333", 2,"2222");
        estacionServicio.agregarVenta(30, "CCC333", 3,"2222");
        estacionServicio.agregarVenta(20, "CCC333", 3,"2222");
        estacionServicio.agregarVenta(30, "DDD444", 3,"2222");
        estacionServicio.agregarVenta(30, "DDD444", 2,"2222");
        estacionServicio.agregarVenta(30, "DDD444", 2,"2222");
        estacionServicio.agregarVenta(50, "DDD444", 2,"2222");
        estacionServicio.agregarVenta(30, "EEE555", 3,"2222");
        estacionServicio.agregarVenta(30, "EEE555", 1,"2222");
        estacionServicio.agregarVenta(30, "FFF666", 1,"3333");
        estacionServicio.agregarVenta(30, "GGG777", 2,"3333");
        estacionServicio.agregarVenta(40, "GGG777", 2,"3333");
        estacionServicio.agregarVenta(30, "HHH888", 1,"3333");
        estacionServicio.agregarVenta(30, "HHH888", 3,"3333");
        estacionServicio.agregarVenta(30, "III999", 1,"3333");
        estacionServicio.agregarVenta(30, "III999", 3,"3333");
        estacionServicio.agregarVenta(100, "JJJ000", 1,"3333");
        estacionServicio.agregarVenta(300, "KKK111", 3,"3333");


        //IMPRIME LO QUE PIDE EL EJERCICIO
        System.out.println(estacionServicio.getProporcionDeVentasPorCombustible());
        System.out.println(estacionServicio.listadoExpendedoresPorMontoVenta());
        System.out.println(estacionServicio.listadoExpendedoresPorLitros());
        System.out.println(estacionServicio.listadoEmpleadosPorMontoVenta());
        System.out.println(estacionServicio.top10Clientes());


    }
}