package ar.edu.unahur.obj2.commandjugador.observer;

import ar.edu.unahur.obj2.commandjugador.Jugador;

public class TableroConsola implements Observador {

    @Override
    public void actualizar(Jugador jugador) {
        System.out.println(jugador);
    }

}
