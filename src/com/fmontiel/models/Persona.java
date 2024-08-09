/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fmontiel.models;

import com.fmontiel.interfaces.IPersona;

/**
 *
 * @author PC
 */
public abstract class Persona implements IPersona {
    protected String nombre;
    protected int edad;
    protected String nacionalidad;

    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public abstract void entrenar();

    @Override
    public abstract void descansar();
}
