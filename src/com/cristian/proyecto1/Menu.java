package com.cristian.proyecto1;

import java.util.Scanner;

public class Menu {
	private String opcion;
	private Scanner entrada = new Scanner(System.in);
	private Usuarios usuarios;
	private Salas salas;
	private Peliculas peliculas;
	private Boletos boletos;
	private Reservas reservas;
	private Horarios horarios;
	private CerrarSesion cerrarSesion;
	
	public Menu() {
		System.out.println("\nMenu:\n\n" + "1)Usuarios.\n" + "2)Salas.\n" + "3)Peliculas.\n" + "4)Boletos.\n" + "5)Reservas.\n" + "6)Horarios.\n" + "7)Cerrar sesión.\n");
		System.out.println("Opción:");
		opcion = entrada.next();
		
		switch(opcion) {
			case "1":
				usuarios  = new Usuarios();
				break;
			case "2":
				salas = new Salas();
				break;
			case "3":
				peliculas = new Peliculas();
				break;
			case "4":
				boletos = new Boletos();
				break;
			case "5":
				reservas = new Reservas();
				break;
			case "6":
				horarios = new Horarios();
				break;
			case "7":
				cerrarSesion = new CerrarSesion();
				break;
			default:
				System.out.println("\nLa opción ingresada no es valida.");
		}
	}
}
