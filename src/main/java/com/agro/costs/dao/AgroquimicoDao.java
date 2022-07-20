package com.agro.costs.dao;

import javax.persistence.*;

@Entity
@Table(name = "TIPOS_AGROQUIMICO")
public class AgroquimicoDao {

    @Id
    @Column(name = "id_tipo")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    public AgroquimicoDao() {
    }

    public AgroquimicoDao(String nombre) {
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
