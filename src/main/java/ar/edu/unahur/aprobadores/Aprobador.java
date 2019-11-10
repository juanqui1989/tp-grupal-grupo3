package ar.edu.unahur.aprobadores;


import ar.edu.unahur.Empleado;

public abstract class Aprobador extends Empleado {
  public Aprobador siguiente;

  public Aprobador( String cargo) {
    super( cargo);
  }

  public abstract void setSiguiente(Aprobador siguiente);
  public abstract Aprobador getSiguiente();
  public abstract boolean puedeAprobar(int monto);

  public void solicitudPrestamo(int monto) {
    if (puedeAprobar(monto))
      System.out.println("prestamo aprobado por " + getCargo());
    else
      siguiente.solicitudPrestamo(monto);
  }


}
