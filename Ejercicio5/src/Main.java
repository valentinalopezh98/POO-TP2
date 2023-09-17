import ar.edu.unlu.poo.tp2.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(300,700,1000);
        System.out.println("ESTADO INICIAL:" + usuario.mostrarEstado());
        usuario.depositar(600);
        usuario.invertir(500);
        System.out.println("ESTADO LUEGO DE DEPOSITAR $600 E INVERTIR $500:" + usuario.mostrarEstado());
        System.out.println(usuario.realizarGasto(1000));
        usuario.activarPrecancelarInversion();
        usuario.realizarGastoYGirar(1000);
        System.out.println("ESTADO LUEGO DE ACTIVAR PRECANCELAR INVERSION Y REALIZAR UN GASTO CON GIRO EN DESCUBIERTO($1000):" + usuario.mostrarEstado());
        usuario.realizarCompra(800);
    }
}