package ar.edu.unahur;

public abstract class Empleado {
  private String cargo;

  public Empleado( String cargo) {
    this.cargo = cargo;
  }


  public String getCargo() {
    return cargo;
  }
}
