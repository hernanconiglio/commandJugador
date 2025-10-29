package ar.edu.unahur.obj2.commandjugador;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unahur.obj2.commandjugador.observer.Observable;
import ar.edu.unahur.obj2.commandjugador.observer.Observador;

public class Jugador implements Observable{
    private Integer posX;
    private Integer posY;
    private Integer cantMovimientos = 0;
    private Set<Observador> observadores = new HashSet<>();

    public Jugador() {
        this.posX = 0;
        this.posY = 0;
    }

    public Jugador(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void reset() {
        this.posX = 0;
        this.posY=0;
        this.cantMovimientos = 0;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }

    public Integer getCantMovimientos() {
        return cantMovimientos;
    }

    public void avanzar() {
        this.posX ++; // this.posX += 1 // this.posX = this.posX + 1
    }

    public void retroceder() {
        this.posX --;
    }

    public void subir() {
        this.posY ++;
    }

    public void bajar() {
        this.posY --;
    }

    public void incrementarMovimientos() {
        this.cantMovimientos ++;
    }

    @Override 
    public String toString() {
        return "Jugador{" + "posX=" + this.posX + ", posY=" 
        + this.posY + ", cantMovimientos=" + this.cantMovimientos + "}";
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void quitarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificar() {
        observadores.forEach(o -> o.actualizar(this));
    }

}
