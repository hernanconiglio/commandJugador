package ar.edu.unahur.obj2.commandjugador;

public class Retroceder extends MovimientoCommand {

    public Retroceder(Jugador jugador) {
        super(jugador);
    }

    @Override
    public void doMovete() {
        jugador.retroceder();
    }

}
