package ar.edu.unlu.poo.tp2;

import java.time.LocalDate;

public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    private static final double INTERES_POR_INVERSION = 0.4;
    private static final double PLAZO_DIAS_INVERSION = 120;
    private LocalDate fechaInversion;
    private boolean precancelarInversion;

    public Cuenta(double saldo, double limiteGiroDescubierto) {
        this.saldo = saldo;
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        giroDescubierto = 0;
        saldoInvertido = 0;
        fechaInversion = null;
        precancelarInversion = false;
    }

    public boolean gastar(double monto) {
        boolean res = false;
        if ((saldo + (limiteGiroDescubierto-giroDescubierto)) >= monto) {
            if (saldo < monto) {
                if(precancelarInversion){
                    recuperarInversion();
                    if (saldo < monto){
                        giroDescubierto += monto - saldo;
                        saldo = 0;
                    } else {
                        saldo -= monto;
                    }
                }
            } else {
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

    public void recuperarInversion() {
        if (fechaInversion.plusDays((long)PLAZO_DIAS_INVERSION).isEqual(LocalDate.now()) ||
                fechaInversion.plusDays((long)PLAZO_DIAS_INVERSION).isBefore(LocalDate.now())){
            saldo += saldoInvertido + (saldoInvertido * INTERES_POR_INVERSION);
            saldoInvertido = 0;
        } else if (fechaInversion.plusDays(30).isEqual(LocalDate.now()) ||
                fechaInversion.plusDays(30).isBefore(LocalDate.now())){
            saldo += saldoInvertido + (saldoInvertido * 0.05);
            saldoInvertido = 0;
        } else {
            saldo += saldoInvertido;
            saldoInvertido = 0;
        }

    }

    public void activarPrecancelarInversion(){
        precancelarInversion = true;
    }

    public void desactivarPrecancelarInversion(){
        precancelarInversion = false;
    }

    public double getInteresAGanar() {
        if (fechaInversion != null){
            if (fechaInversion.plusDays((long) PLAZO_DIAS_INVERSION).isEqual(LocalDate.now()) ||
                    fechaInversion.plusDays((long) PLAZO_DIAS_INVERSION).isAfter(LocalDate.now())){
                return saldoInvertido * INTERES_POR_INVERSION;
            } else if(fechaInversion.plusDays(30).isEqual(LocalDate.now()) ||
                    fechaInversion.plusDays(30).isAfter(LocalDate.now())){
                return saldoInvertido * 0.05;
            }

        }

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
