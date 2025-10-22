package ar.edu.unahur.obj2.commandjugador;

public class Subir extends MovimientoCommand {

    public Subir(Jugador jugador) {
        super(jugador);
    }

    @Override
    protected void doMovete() {
        jugador.subir();
    }

}
