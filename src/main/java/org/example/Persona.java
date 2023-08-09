package org.example;

class Persona {
    private String cedula;
    private String nombre;
    private EstadoPersona estado;

    public Persona(String cedula, String nombre, EstadoPersona estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoPersona getEstado() {
        return estado;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(EstadoPersona estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
