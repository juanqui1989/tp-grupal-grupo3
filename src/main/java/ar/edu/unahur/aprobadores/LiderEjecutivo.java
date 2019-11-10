package ar.edu.unahur.aprobadores;

public class LiderEjecutivo extends Aprobador {


    public LiderEjecutivo(String cargo) {
        super(cargo);
    }




    @Override
    public boolean puedeAprobar(int monto) {
        return monto > 10000 && monto <= 5000;
    }

}
