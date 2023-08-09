package org.example;

public class Principal {
    public static void main(String[] args) {
        Persona responsable = new Persona("12345678-9", "Luis Suarez", EstadoPersona.ACTIVO);
        Casino casino = Casino.getInstance("Casinos del estado", responsable);
        System.out.println(casino.toString());
        JuegoDeMesa juegoMesa1 = new JuegoDeMesa("Blackjack", 20, 2, 6);
        JuegoDeMesa juegoMesa2 = new JuegoDeMesa("Poquer", 20, 1, 8);

        Slot slot1 = new Slot("Slot 1", true);
        Slot slot2 = new Slot("Slot 2", false);

        casino.agregarJuegoMesa(juegoMesa1);
        casino.agregarJuegoMesa(juegoMesa2);
        casino.agregarSlot(slot1);
        casino.agregarSlot(slot2);



    }
}