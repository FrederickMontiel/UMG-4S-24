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
public class Portero extends Jugador implements IDetalles {
    private int paradasRealizadas;

    public Portero(String nombre, int edad, String nacionalidad, int numeroCamiseta, int paradasRealizadas) {
        super(nombre, edad, nacionalidad, "Portero", numeroCamiseta);
        this.paradasRealizadas = paradasRealizadas;
    }

    public void atajarBalon() {
        System.out.println(nombre + " ha realizado una gran parada.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre + ", " + posicion + ", " + numeroCamiseta + ", Paradas: " + paradasRealizadas);
    }
}