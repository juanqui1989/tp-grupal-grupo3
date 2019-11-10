package ar.edu.unahur.aprobadores;


import ar.edu.unahur.Empleado;

public abstract class Aprobador extends Empleado {
  public Aprobador siguiente;

  public Aprobador( String cargo) {
    super( cargo);
  }

  public  void setSiguiente(Aprobador siguiente) {
    this.siguiente = siguiente;
  }
  public Aprobador getSiguiente() {
    return siguiente;
  };
  public abstract boolean puedeAprobar(int monto);

  public void solicitudPrestamo(int monto) {
    if (puedeAprobar(monto))
      System.out.println("prestamo aprobado por " + getCargo());
    else
      siguiente.solicitudPrestamo(monto);
  }


}
