package com.cristian.proyecto1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		IniciarSesion inicioSesion;
		Scanner entrada = new Scanner(System.in);
		String opcion;
		int opc;
		
		System.out.println("Bienvenido al cinema:\n\n" + "¿Que desea hacer?\n\n" +"1)Administración del sistema.\n" + "2)Salir.\n");
		System.out.println("Opción:");
		opcion = entrada.next();
		
		switch(opcion) {
			case "1":
				System.out.println("\f");
				inicioSesion = new IniciarSesion();
			break;
			case "2":
				System.out.println("\nGracias por usar nuestro servicio, hasta pronto.");
			break;
			default:
				System.out.println("\nLa opción ingresada no es valida.");
			break;
		}
	}
}
