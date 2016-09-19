package com.cristian.proyecto1;

import java.util.Scanner;

public class IniciarSesion {
	
	protected String usuario;
	protected String contrasena;
	protected String password;
	protected Scanner entradaU = new Scanner(System.in);
	protected Scanner entradaP = new Scanner(System.in);
	protected Scanner entrada = new Scanner(System.in);
	private Menu menu;
	private String opcion;
	private String[] registroU = new String[4];
	private int c;
	
	public IniciarSesion() {
		menu();
	}
	
	private void menu() {
		System.out.println("Administración del sistema:\n\n" + "1)Iniciar sesión.\n" + "2)Registrarse.\n");
		System.out.println("Opción:");
		opcion = entrada.next();
		
		switch (opcion) {
			case "1":
				inicioSesion();
				break;
			case "2":
				registro();
				break;
			default:
				System.out.println("\nLa opcion ingresada no es valida.\n");
				menu();
				break;
		}
	}
	
	private void inicioSesion() {
		if(registroU[0] != null) {
			System.out.println("\nIniciar Sesión:\n\n" + "Usuario:");
			usuario = entradaU.next();
			
			System.out.println("\nContraseña:");
			contrasena = entradaP.next();
			
			for(int a = 0; a < registroU.length; a++) {
				if(usuario.equals(registroU[a]) && contrasena.equals(registroU[a+1])) {
					System.out.println("\nBienvenido " + registroU[a]);
					menu = new Menu();
				}
			}
		}else {
			System.out.println("\nLo sentimos, no se encuentra ningun usuario registrado.\n");
			menu();
		}
	}
	
	private void registro() {
		if(c >= registroU.length) {
			System.out.println("\nLo sentimos, a excedido el limite de usuarios permitidos.\n");
			menu();
		}else {
			System.out.println("\nRegistrarse:\n\n" + "Por favor indique el nombre de usuario que desea registrar:");
			usuario = entradaU.next();
			registroU[c] = usuario;
			c++;
			
			System.out.println("\nPor favor indique la contraseña que desea registrar:");
			contrasena = entradaP.next();
			
			System.out.println("\nPor favor indique nuevamente la contraseña que desea registrar:");
			password = entradaP.next();
			
			if(contrasena.equals(password)) {
				registroU[c] = contrasena;
				c++;
				
				System.out.println("\nSu registro se ha efectuado con éxito.\n");
				menu();
			}else {
				System.out.println("\nLo sentimos, las contraseñas ingresadas no coinciden.\n");
				menu();
			}
		}
	}
}
