package com.cristian.proyecto1;

public class CerrarSesion {
	
	private Principal principal;

	public CerrarSesion() {
		System.out.println("\nHas cerrado sesión correctamente.\n");
		principal = new Principal();
		principal.main(null);
	}
}
