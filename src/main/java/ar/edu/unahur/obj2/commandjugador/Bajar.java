package ar.edu.unahur.obj2.commandjugador;

public class Bajar extends MovimientoCommand {

    public Bajar(Jugador jugador) {
        super(jugador);
    }

    @Override
    protected void doMovete() {
        jugador.bajar();
    }

}
