package ar.edu.unahur.obj2.commandjugador;

import java.util.ArrayList;
import java.util.List;

public class Correr extends MovimientoCommand {
    List<MovimientoCommand> movimientos = new ArrayList<>();

    public Correr(Jugador jugador, Integer cantPasos) {
        super(jugador);
        for (Integer i = 0; i < cantPasos; i++) {
            movimientos.add(new Avanzar(jugador));
        }
    }

    @Override
    protected void doMovete() {
        movimientos.forEach(MovimientoCommand::doMovete); // m -> m.doMovete()
    }

}
