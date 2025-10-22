package ar.edu.unahur.obj2.commandjugador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TecladoTest {

    private Jugador jugador = new Jugador();
    private Teclado teclado = new Teclado(jugador);

    @BeforeEach
    void setupJuego() {
        jugador.reset();
    }

    @Test
    void alPresionarLaTeclaDElPersonajeAvanzaCorrectamente() {
        teclado.moverAlPersonaje('d');
        assertEquals(1,jugador.getPosX());
        assertEquals(1,jugador.getCantMovimientos());
    }

    @Test
    void alPresionarLaTeclaaElPersonajeRetrocedeCorrectamente() {
        teclado.moverAlPersonaje('a');
        assertEquals(-1,jugador.getPosX());
        assertEquals(1,jugador.getCantMovimientos());
    }

    @Test
    void alPresionarLaTeclawElPersonajeSubeCorrectamente() {
        teclado.moverAlPersonaje('w');
        assertEquals(1,jugador.getPosY());
        assertEquals(1,jugador.getCantMovimientos());
    }

    @Test
    void alPresionarLaTeclasElPersonajeBajeCorrectamente() {
        teclado.moverAlPersonaje('s');
        assertEquals(-1,jugador.getPosY());
        assertEquals(1,jugador.getCantMovimientos());
    }

    @Test
    void dadoUnPersonajeSiAvanzaDosVecesYRetrocedeUnaVezLoHaceCorrectamente() {
        teclado.moverAlPersonaje('d');
        teclado.moverAlPersonaje('d');
        teclado.moverAlPersonaje('a');
        assertEquals(1,jugador.getPosX());
        assertEquals(3,jugador.getCantMovimientos());        
    }

    @Test
    void alPresionarLaTeclaCElPersonajeCorreCorrectamenteYLaCantidadDeMovimientosEsLaCorrecta() {
        teclado.moverAlPersonaje('c');
        assertEquals(3,jugador.getPosX());
        assertEquals(1,jugador.getCantMovimientos());
    }

    @Test
    void funcionaBienElOverrideDelToStringDelJugador() {
        Jugador jugador2 = new Jugador(1,1);
        assertEquals("Jugador{posX=1, posY=1, cantMovimientos=0}",jugador2.toString());
    }

}
