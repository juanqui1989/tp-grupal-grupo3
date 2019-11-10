package ar.edu.unahur.aprobadores;

public class Gerente extends Aprobador {

    public Gerente(String cargo) {
        super(cargo);
    }


    @Override
    public boolean puedeAprobar(int monto) {
        return monto > 5000 && monto <= 100000;
    }



}
