package org.example;

class Slot extends Juego {
    private boolean palanca;

    public Slot(String nombre, boolean palanca) {
        super(nombre);
        this.palanca = palanca;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "nombre='" + getNombre() + '\'' +
                ", palanca=" + palanca +
                '}';
    }
}
