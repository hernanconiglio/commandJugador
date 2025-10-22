package ar.edu.unahur.obj2.commandjugador;

import java.util.HashMap;

public class Teclado {

    private HashMap<Character,MovimientoCommand> keyCommands = new HashMap<>();

    public Teclado(Jugador jugador) {
        keyCommands.put('w', new Subir(jugador));
        keyCommands.put('s', new Bajar(jugador));
        keyCommands.put('a', new Retroceder(jugador));
        keyCommands.put('d', new Avanzar(jugador));
        keyCommands.put('c', new Correr(jugador,3));
    }
    public void moverAlPersonaje(Character letra) {
        keyCommands.get(letra).movete();
    };
}
