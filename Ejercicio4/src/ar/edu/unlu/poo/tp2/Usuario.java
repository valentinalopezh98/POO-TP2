package ar.edu.unlu.poo.tp2;

public class Usuario {
    private Cuenta cuenta;
    private CuentaCredito cuentaCredito;

    public Usuario(double saldo, double limiteGiroDescubierto) {
        cuenta = new Cuenta(saldo,limiteGiroDescubierto);
    }

    public Usuario(double saldo, double limiteGiroDescubierto, double limiteCuentaCredito) {
        cuenta = new Cuenta(saldo,limiteGiroDescubierto);
        cuentaCredito = new CuentaCredito(limiteCuentaCredito);
    }

    /**
     * Muestra por consola el estado de su cuenta, imprime:
     * 	a. El saldo
     *  b. El limite de giro en descubierto y en parentesis el monto girado en descubierto.
     *  c. El monto total invertido y entre parentesis el interes a ganar.
     *  d. El monto disponible para compras a credito y la deuda total a pagar segun las compras.
     */
    public String mostrarEstado() {
        String estado = "\n--- Cuenta ---\nSaldo: " + cuenta.getSaldo() +
                "\nGiro en descubierto: " +  cuenta.getLimiteGiroDescubierto() + " (" +
                cuenta.getGiroDescubierto() + ")\nInversiones: " + cuenta.getMontoInvertido() +
                " (" + cuenta.getInteresAGanar() + ")";
                if (cuentaCredito != null){
                    estado += "\n\n--- Cuenta crédito ----\nDisponible para compras: " +
                            cuentaCredito.getLimite() + "\nSaldo deudor: " + cuentaCredito.getSaldoDeudor()
                    + "\n";
                }
        return estado;
    }


    public String realizarGasto(double monto) {
        if(monto > cuenta.getSaldo()) {
            return "No se puede realizar el gasto, se va a girar en descubierto";
        }else {
            cuenta.gastar(monto);
            return "Se ha realizado el gasto exitosamente";
        }
    }

   public boolean realizarGastoYGirar(double monto) {
       return cuenta.gastar(monto);
   }

   public void depositar(double monto){
        cuenta.depositar(monto);
   }

   public boolean invertir(double monto){
        return cuenta.invertir(monto);
   }

   public boolean recuperarInversion(){
        return cuenta.recuperarInversion();
   }

//Devuelve el numero de compra o -1 si no se pudo
   public int realizarCompra(double monto){
        return cuentaCredito.comprar(monto);
   }

   public boolean pagarCompra(double monto, int nroCompra){
        return cuentaCredito.pagar(monto, nroCompra);
   }

}
