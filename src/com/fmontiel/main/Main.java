package com.fmontiel.main;

import com.fmontiel.models.Delantero;
import com.fmontiel.models.Entrenador;
import com.fmontiel.models.Equipo;
import com.fmontiel.models.Jugador;
import com.fmontiel.models.Portero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Equipo equipo = crearEquipo(scanner);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Ver Detalles de Jugadores");
            System.out.println("3. Jugar Partido");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    agregarJugador(scanner, equipo);
                    break;
                case 2:
                    mostrarDetallesJugadores(equipo);
                    break;
                case 3:
                    equipo.jugarPartido();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        }
    }

    private static Equipo crearEquipo(Scanner scanner) {
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese el nombre del entrenador: ");
        String nombreEntrenador = scanner.nextLine();
        System.out.print("Ingrese la edad del entrenador: ");
        int edadEntrenador = leerEntero(scanner);
        System.out.print("Ingrese la nacionalidad del entrenador: ");
        String nacionalidadEntrenador = scanner.nextLine();
        System.out.print("Ingrese la estrategia del entrenador: ");
        String estrategia = scanner.nextLine();

        Entrenador entrenador = new Entrenador(nombreEntrenador, edadEntrenador, nacionalidadEntrenador, estrategia);
        return new Equipo(nombreEquipo, entrenador);
    }

    private static void agregarJugador(Scanner scanner, Equipo equipo) {
        System.out.println("\n--- Agregar Jugador ---");
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del jugador: ");
        int edad = leerEntero(scanner);
        System.out.print("Ingrese la nacionalidad del jugador: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Ingrese la posicion del jugador (1. Delantero, 2. Portero): ");
        int tipoJugador = leerEntero(scanner);
        System.out.print("Ingrese el numero de camiseta: ");
        int numeroCamiseta = leerEntero(scanner);

        Jugador jugador = null;
        switch (tipoJugador) {
            case 1:
                System.out.print("Ingrese la cantidad de goles marcados: ");
                int golesMarcados = leerEntero(scanner);
                jugador = new Delantero(nombre, edad, nacionalidad, numeroCamiseta, golesMarcados);
                break;
            case 2:
                System.out.print("Ingrese la cantidad de paradas realizadas: ");
                int paradasRealizadas = leerEntero(scanner);
                jugador = new Portero(nombre, edad, nacionalidad, numeroCamiseta, paradasRealizadas);
                break;
            default:
                System.out.println("Posicion no valida. No se agrego el jugador.");
                return;
        }

        equipo.agregarJugador(jugador);
        System.out.println("Jugador agregado correctamente.");
    }

    private static void mostrarDetallesJugadores(Equipo equipo) {
        System.out.println("\n--- Detalles de Jugadores ---");
        for (Jugador jugador : equipo.getListaJugadores()) {
            if (jugador instanceof Delantero) {
                ((Delantero) jugador).mostrarDetalles();
            } else if (jugador instanceof Portero) {
                ((Portero) jugador).mostrarDetalles();
            }
        }
    }

    private static int leerEntero(Scanner scanner) {
        int numero = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                numero = scanner.nextInt();
                scanner.nextLine(); 
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.print("Entrada invalida. Por favor, ingrese un numero: ");
                scanner.nextLine(); 
            }
        }

        return numero;
    }
}
