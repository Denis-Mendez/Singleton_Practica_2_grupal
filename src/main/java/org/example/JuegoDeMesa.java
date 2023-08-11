package org.example;

public class JuegoDeMesa extends Juego {
    private int metrosCuadrados;
    private int minJugadores;
    private int maxJugadores;

    public JuegoDeMesa(String nombre, int metrosCuadrados, int minJugadores, int maxJugadores) {
        super(nombre);
        this.metrosCuadrados = metrosCuadrados;
        this.minJugadores = minJugadores;
        this.maxJugadores = maxJugadores;
    }



    @Override
    public String toString() {
        return "JuegoDeMesa{" +
                "nombre='" + getNombre() + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", minJugadores=" + minJugadores +
                ", maxJugadores=" + maxJugadores +
                '}';
    }
}

