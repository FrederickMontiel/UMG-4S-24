/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmontiel.models;

/**
 *
 * @author PC
 */
public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String nombre, int edad, String nacionalidad, String estrategia) {
        super(nombre, edad, nacionalidad);
        this.estrategia = estrategia;
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " esta preparando la estrategia.");
    }

    @Override
    public void descansar() {
        System.out.println(nombre + " esta descansando.");
    }

    public void dirigirPartido() {
        System.out.println(nombre + " esta dirigiendo el partido.");
    }
}