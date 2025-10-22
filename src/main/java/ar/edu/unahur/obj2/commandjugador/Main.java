package ar.edu.unahur.obj2.commandjugador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador(1,1);
        Teclado teclado = new Teclado(jugador);
        Scanner sc = new Scanner(System.in);
        System.out.println(jugador);
        System.out.print("Ingrese un comando para mover al jugador o q para salir: ");
        Character l = sc.next().toLowerCase().charAt(0);
        while (l != 'q') {
            teclado.moverAlPersonaje(l);    
            System.out.println(jugador);
            System.out.print("Ingrese otro comando para mover al jugador o q para salir: ");
            l = sc.next().toLowerCase().charAt(0);
        }
        sc.close();
        
        
    }
}