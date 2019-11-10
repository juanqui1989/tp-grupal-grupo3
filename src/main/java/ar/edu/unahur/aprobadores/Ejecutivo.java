package ar.edu.unahur.aprobadores;

public class Ejecutivo extends Aprobador {
    public Ejecutivo(String cargo) {
        super(cargo);
    }


    @Override
    public boolean puedeAprobar(int monto) {
        return monto <= 10000;
    }


}
