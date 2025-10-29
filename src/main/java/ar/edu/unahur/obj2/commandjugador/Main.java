package ar.edu.unahur.obj2.commandjugador;

import java.util.Scanner;

import ar.edu.unahur.obj2.commandjugador.observer.TableroConsola;

public class Main {
    public static void main(String[] args) {
        TableroConsola tablero = new TableroConsola();
        Jugador jugador = new Jugador();
        jugador.agregarObservador(tablero);
        Teclado teclado = new Teclado(jugador);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un comando para mover al jugador o q para salir: ");
        Character l = sc.next().toLowerCase().charAt(0);
        while (l != 'q') {
            teclado.moverAlPersonaje(l);    
            System.out.print("Ingrese otro comando para mover al jugador o q para salir: ");
            l = sc.next().toLowerCase().charAt(0);
        }
        sc.close();
        
        
    }
}