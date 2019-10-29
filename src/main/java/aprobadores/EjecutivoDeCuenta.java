package aprobadores;

public class EjecutivoDeCuenta implements Aprobador {
    private Aprobador siguiente;

    //Seteo el proximo aprobador.
    @Override
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    //Devuelvo el proximo aprobador.
    @Override
    public Aprobador getSiguiente() {
        return this.siguiente;
    }

    /*
    *   Atiendo la solicitud del prestamo si el monto es menor a 10000.
    *   Si el monto solicitado excede el que puede autorizar el
    *   "ejecutivo de cuentas", pasa la peticion al aprovador siguiente (siguiente).
    */
    @Override
    public void solicitudPrestamo(int monto) {
        if(monto <= 10000) {
            System.out.println("Prestamo aprobado por el ejecutivo de cuentas del banco");
        } else {
            siguiente.solicitudPrestamo(monto);
        }
    }
}