package com.cristian.proyecto1;

public class Peliculas extends Usuarios {

	public Peliculas() {
		menu();
	}
	
	protected void menu() {
		System.out.println("\nPeliculas:\n\n" + "1)Listar Peliculas.\n" + "2)Crear Peliculas.\n" + "3)Editar Peliculas.\n" + "4)Eliminar Peliculas.\n" + "5)Volver atrás.\n");
		System.out.println("Opción:");
		
		opcion = entradaOpc.next();
		
		switch(opcion) {
			case "1":
				listar();
				break;
			case "2":
				crear();
				break;
			case "3":
				editar();
				break;
			case "4":
				eliminar();
				break;
			case "5":
				volverAtras();
				break;
				
			default:
				System.out.println("\nLa opción ingresada no es valida.");
				menu();
				break;
		}
	}
	
	protected void listar() {
		if(registro[0] == null) {
			System.out.println("\nActualmente no hay cartelera de peliculas.");
			menu();
		}else {
			System.out.println("\n");
			for(int c = 0; c < registro.length; c++) {
				if(registro[c] == null) {
					System.out.println(c + ".");
				}else {
					System.out.println(c + "." + registro[c]);
				}
			}
			menu();
		}
	}
	
	protected void crear() {
		if(contador >= registro.length) {
			System.out.println("\nLo sentimos, a excedido el limite de peliculas permitidas.");
			menu();
		}else {
			System.out.println("\nPor favor ingrese la pelicula que desea a registrar:");
			registro[contador] = entradaU.nextLine();
			contador++;
			System.out.println("La pelicula ha sido registrada con exito.");
			menu();
		}
	}

	protected void editar() {
		Eliminar datosVacios = new DatosVacios();
        Eliminar validarEntrada = new ValidarEntrada();
        Eliminar cambiarNombre = new CambiarNombre();
        datosVacios.setNext(validarEntrada);
        validarEntrada.setNext(cambiarNombre);
        datosVacios.handle(registro);
	}

	protected void eliminar() {
		for(int i = 0; i < registro.length; i++) {
			if(registro[i] == null) {
				System.out.println("\nLo sentimos, la base de datos se encuentra vacia.");
				menu();
			}else {
				System.out.println("\nPor favor indique el id de la pelicula que desea eliminar:");
				id = entradaE.nextInt();
				
				if(registro[id] != null) {
					if(id < registro.length) {
						for(int c = id; c < registro.length; c++) {
							if((c + 1) < registro.length) {
								registro[c] = null;
								registro[c] = registro[c + 1];
								registro[c + 1] = null;
							}else {
								registro[c] = null;
							}
						}
						contador -= 1;
						System.out.println("\nEl registro se ha eliminado con éxito.");
					}else {
						System.out.println("\nEl id proporcinado no es valido.");
					}
					menu();
				}else {
					System.out.println("\nLo sentimos, no se puede eliminar un campo vacio.");
					menu();
				}
			}
		}
	}
	
	public void volverAtras() {
		menuPrincipal = new Menu();
	}
}
