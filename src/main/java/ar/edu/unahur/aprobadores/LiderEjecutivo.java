package ar.edu.unahur.aprobadores;

public class LiderEjecutivo extends Aprobador {


    public LiderEjecutivo(String cargo) {
        super(cargo);
    }

    @Override
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public Aprobador getSiguiente() {
        return this.siguiente;
    }



    @Override
    public boolean puedeAprobar(int monto) {
        return monto > 10000 && monto <= 5000;
    }

}
