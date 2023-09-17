package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    private static final double INTERES_POR_INVERSION = 0.4;
    private static final double PLAZO_DIAS_INVERSION = 30;
    private LocalDate fechaInversion;

    public Cuenta(double saldo, double limiteGiroDescubierto) {
        this.saldo = saldo;
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        this.giroDescubierto = 0;
        this.saldoInvertido = 0;
        this.fechaInversion = null;
    }

    public boolean gastar(double monto) {
        boolean res = false;
        if ((saldo + (limiteGiroDescubierto-giroDescubierto)) >= monto) {
            if (saldo < monto) {
                giroDescubierto += monto - saldo;
                saldo = 0;
            }else {
                saldo -= monto;
            }
            res = true;
        }
        return res;
    }

    public void depositar(double monto) {
        if(giroDescubierto > 0){
            if (giroDescubierto >= monto){
                giroDescubierto -= monto;
            } else {
                saldo += monto - giroDescubierto;
                giroDescubierto = 0;
            }
        } else {
            saldo += monto;
        }
    }

    public boolean invertir(double monto) {
        if(saldo >= monto && saldoInvertido == 0){
            saldoInvertido = monto;
            saldo -= saldoInvertido;
            fechaInversion = LocalDate.now();
            return true;
        }
        return false;
    }

    public boolean recuperarInversion() {
        if (fechaInversion.plusDays((long) PLAZO_DIAS_INVERSION).isEqual(LocalDate.now())){
            saldo += saldoInvertido + (saldoInvertido * INTERES_POR_INVERSION);
        }
        return false;
    }

    public double getInteresAGanar() {
        if (fechaInversion != null)
            return saldoInvertido * Cuenta.INTERES_POR_INVERSION;
        return 0.0d;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getGiroDescubierto() {
        return giroDescubierto;
    }

    public double getLimiteGiroDescubierto() {
        return limiteGiroDescubierto;
    }

    public double getMontoInvertido() {
        return saldoInvertido;
    }
}
