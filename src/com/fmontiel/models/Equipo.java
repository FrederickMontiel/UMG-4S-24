/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmontiel.models;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private List<Jugador> listaJugadores = new ArrayList<>();
    private Entrenador entrenador;

    public Equipo(String nombreEquipo, Entrenador entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
    }

    public void agregarJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public void jugarPartido() {
        System.out.println(nombreEquipo + " esta jugando un partido.");
        entrenador.dirigirPartido();
        for (Jugador jugador : listaJugadores) {
            jugador.jugarPartido();
        }
    }
}