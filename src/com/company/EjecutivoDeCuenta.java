package com.company;

public class EjecutivoDeCuenta implements Aprobador {
    private Aprobador next;

    @Override
    public void setNextAprobador(Aprobador aprobador) {
        this.next = aprobador;
    }

    @Override
    public Aprobador getNextAprobador() {
        return next;
    }

    @Override
    public void solicitudDePrestamo(int monto) {
        if (monto <= 10000){
            System.out.println("Lo manejo yo, el ejecutivo de cuentas");
        }else{
            next.solicitudDePrestamo(monto);
        }
    }
}