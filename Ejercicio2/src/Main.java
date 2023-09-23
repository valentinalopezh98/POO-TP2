import ar.edu.unlu.poo.tp2.*;

public class Main {
    public static void main(String[] args) {
        AgenciaTurismo agencia = new AgenciaTurismo();
        Proveedor proveedor = new Proveedor("Proveedor", "22-34567989-7", "123456789", TipoProveedor.EXCURSION);
        Destino destino1 = new Destino("Paris", "Francia", proveedor);
        Destino destino2 = new Destino("Madrid", "España", proveedor);
        Hospedaje hospedaje = new Hospedaje(3000,"Grand Hotel", TipoHospedaje.HOTEL, proveedor);
        Transporte transporte = new Transporte("LATAM Airlines", proveedor, TipoTransporte.AEREO, 30000);
        //Defino dos paquetes con distintos destinos
        Paquete paquete1 = new Paquete(destino1,hospedaje,transporte);
        Paquete paquete2 = new Paquete(destino2,hospedaje,transporte);

        //Defino varios clientes
        Cliente cliente1 = new Cliente("Juan", "Lopez", "juan@gmail.com", "1234567");
        Cliente cliente2 = new Cliente("Jose", "Garcia", "jose@gmail.com", "1234567");
        Cliente cliente3 = new Cliente("Camila", "Rodriguez", "camila@gmail.com", "1234567");
        Cliente cliente4 = new Cliente("Agustina", "Perez", "agustina@gmail.com", "1234567");

        //Creo ventas para los clientes
        agencia.realizarVenta(cliente1, paquete1);
        agencia.realizarVenta(cliente1, paquete2);
        agencia.realizarVenta(cliente2, paquete2);
        agencia.realizarVenta(cliente3, paquete1);
        agencia.realizarVenta(cliente3, paquete2);
        agencia.realizarVenta(cliente4, paquete2);

        //Muestro el destino favorito
        System.out.println("El destino favorito es " + agencia.obtenerDestinoFavorito());

        //Lista de ventas por destino
        System.out.println(agencia.obtenerVentasPorDestino());

    }
}