package org.example;
import java.util.ArrayList;
import java.util.List;

class Casino {
    private static Casino instance;
    private String nombre;
    private Persona responsable;
    private List<JuegoDeMesa> juegosDeMesa;
    private List<Slot> slots;

    public Casino(String nombre, Persona responsable) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.juegosDeMesa = new ArrayList<>();
        this.slots = new ArrayList<>();
    }
    public static Casino getInstance(String nombre, Persona responsable) {
        if (instance == null) {
            instance = new Casino(nombre, responsable);
        }
        return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getResponsable() {
        return responsable;
    }

    public List<JuegoDeMesa> getJuegosMesa() {
        return juegosDeMesa;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void agregarJuegoMesa(JuegoDeMesa juego) {
        if (juegosDeMesa.size() < 2) {
            juegosDeMesa.add(juego);
            System.out.println("Juego de mesa agregado: " + juego.getNombre());
        } else {
            System.out.println("No se pueden agregar más juegos de mesa.");
        }
    }

    public void agregarSlot(Slot slot) {
        if (slots.size() < 8) {
            slots.add(slot);
            System.out.println("Slot agregado: " + slot.getNombre());
        } else {
            System.out.println("No se pueden agregar más slots.");
        }
    }

    @Override
    public String toString() {
        return "Casino{" +
                "nombre='" + nombre + '\'' +
                ", responsable=" + responsable +
                ", juegosMesa=" + juegosDeMesa +
                ", slots=" + slots +
                '}';
    }
}

