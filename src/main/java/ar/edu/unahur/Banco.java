package ar.edu.unahur;

import ar.edu.unahur.aprobadores.*;

import java.util.ArrayList;
import java.util.List;

public class Banco  {
    private List<Aprobador> aprobadores;
    private AprobadoresChainBuilder builder;

    public Banco() {
        aprobadores = new ArrayList<>();
        builder = new AprobadoresChainBuilder(this);
        builder.crearAprobadores();
        builder.encadenarAprobadores();
    }

    public List<Aprobador> getAprobadores() {
        return aprobadores;
    }



    public void addAprobador(Aprobador aprobador) {
        this.aprobadores.add(aprobador);
    }


    public void solicitudPrestamo(int monto) {
        System.out.println("Solicitando prestamo...");
        aprobadores.get(0).solicitudPrestamo(monto);
    }


}
