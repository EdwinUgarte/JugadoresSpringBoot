package com.example.prueba.models;

public class Jugador {
    
    private String nombre;
    private Integer numero;
    private Equipo equipo;
    
    public Jugador(String nombre, Integer numero, Equipo equipo) {
        this.nombre = nombre;
        this.numero = numero;
        this.equipo = equipo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }


}
