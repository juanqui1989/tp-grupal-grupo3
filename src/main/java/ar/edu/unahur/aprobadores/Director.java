package ar.edu.unahur.aprobadores;

public class Director extends Aprobador {

    public Director(String cargo) {
        super(cargo);
    }


    @Override
    public boolean puedeAprobar(int monto) {
        return  monto >10000;
    }


}
