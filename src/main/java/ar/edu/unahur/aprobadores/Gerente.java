package ar.edu.unahur.aprobadores;

public class Gerente extends Aprobador {

    public Gerente(String cargo) {
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
        return monto > 5000 && monto <= 100000;
    }



}
