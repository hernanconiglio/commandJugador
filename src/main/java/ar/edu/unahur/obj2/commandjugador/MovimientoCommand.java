package ar.edu.unahur.obj2.commandjugador;

public abstract class MovimientoCommand {
    protected Jugador jugador;

    public MovimientoCommand(Jugador jugador) {
        this.jugador = jugador;
    }

    public void movete() {
        this.doMovete();
        jugador.incrementarMovimientos();
        jugador.notificar();
    }

    protected abstract void doMovete();
}
