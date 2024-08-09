/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmontiel.models;

/**
 *
 * @author PC
 */
public class Jugador extends Persona {
    protected String posicion;
    protected int numeroCamiseta;

    public Jugador(String nombre, int edad, String nacionalidad, String posicion, int numeroCamiseta) {
        super(nombre, edad, nacionalidad);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " esta entrenando.");
    }

    @Override
    public void descansar() {
        System.out.println(nombre + " esta descansando.");
    }

    public void jugarPartido() {
        System.out.println(nombre + " esta jugando un partido.");
    }
}
