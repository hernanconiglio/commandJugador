package ar.edu.unahur.obj2.commandjugador.observer;

public interface Observable {
    void agregarObservador(Observador observador);
    void quitarObservador(Observador observador);
    void notificar();
}
