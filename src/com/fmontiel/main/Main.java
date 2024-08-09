/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fmontiel.main;

import com.fmontiel.models.Delantero;
import com.fmontiel.models.Entrenador;
import com.fmontiel.models.Equipo;
import com.fmontiel.models.Portero;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Delantero delantero = new Delantero("El SIUUUUUU", 35, "Portugal", 10, 30);
        Portero portero = new Portero("Casillas B)", 37, "Espaniol", 1, 15);


        Entrenador entrenador = new Entrenador("Maurinio", 52, "Espaniol", "Esperar a que todos se cansen y anotar gol xd");

  
        Equipo equipo = new Equipo("Real Madrid", entrenador);
        equipo.agregarJugador(delantero);
        equipo.agregarJugador(portero);

        equipo.jugarPartido();


        delantero.mostrarDetalles();
        portero.mostrarDetalles();
    }
    
}
