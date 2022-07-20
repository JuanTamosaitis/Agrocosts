package com.agro.costs.model;

public class AgroquimicoData {

    private int id;
    private String nombre;

    public AgroquimicoData() {
    }

    public AgroquimicoData(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Agroquimico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
