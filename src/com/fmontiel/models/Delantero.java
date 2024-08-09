/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmontiel.models;

import com.fmontiel.interfaces.IDetalles;

/**
 *
 * @author PC
 */
public class Delantero extends Jugador implements IDetalles {
    private int golesMarcados;

    public Delantero(String nombre, int edad, String nacionalidad, int numeroCamiseta, int golesMarcados) {
        super(nombre, edad, nacionalidad, "Delantero", numeroCamiseta);
        this.golesMarcados = golesMarcados;
    }

    public void anotarGol() {
        System.out.println(nombre + " ha marcado un gol.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre + ", " + posicion + ", " + numeroCamiseta + ", Goles: " + golesMarcados);
    }
}