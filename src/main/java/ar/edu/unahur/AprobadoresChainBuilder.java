package ar.edu.unahur;
import ar.edu.unahur.aprobadores.*;

public class AprobadoresChainBuilder {
  Banco banco;
  public AprobadoresChainBuilder(Banco banco) {
    this.banco = banco;
  }

  public void crearAprobadores() {

    banco.addAprobador( new Ejecutivo("ejecutivo"));
    banco.addAprobador(new LiderEjecutivo("lider ejecutivo"));
    banco.addAprobador(new Gerente("gerente"));
    banco.addAprobador( new Director("director"));

  }

  public void encadenarAprobadores() {
    for (int i = 0; i < banco.getAprobadores().size() -1; i++) {
      banco.getAprobadores().get(i)
              .setSiguiente(banco.getAprobadores().get(i+1));
    }
  }
}
