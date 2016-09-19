package com.cristian.proyecto1;

public class Reservas extends Usuarios {

	public Reservas() {
		menu();
	}
	
	protected void menu() {
		System.out.println("\nPeliculas:\n\n" + "1)Listar Reservas.\n" + "2)Crear Reservas.\n" + "3)Editar Reservas.\n" + "4)Pagar Reservas.\n" + "5)Eliminar Reservas.\n" + "6)Volver atrás.\n");
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
				pagar();
				break;
			case "5":
				eliminar();
				break;
			case "6":
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
			System.out.println("\nActualmente no hay reservas disponibles.");
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
			System.out.println("\nLo sentimos, a excedido el limite de reservas permitidas.");
			menu();
		}else {
			System.out.println("\nPor favor ingrese el número de reservas:");
			registro[contador] = entradaU.nextLine();
			contador++;
			System.out.println("La reserva ha sido registrada con éxito.");
			menu();
		}
	}

	protected void editar() {
		for(int c = 0; c < registro.length; c++) {
			if(registro[c] == null) {
				System.out.println("\nLo sentimos, no existe ningun registro de reservas.");
				menu();
			}else {
				System.out.println("\nPor favor indique el id de la reserva que desea editar:");
				id = entradaE.nextInt();
				
				if(id >= registro.length) {
					System.out.println("\nLo sentimos, el valor ingresado no es valido.");
					menu();
				}else {
					if(registro[id] != null) {
						System.out.println("\nIndique el nuevo número de reserva:");
						registro[id] = entradaU.nextLine();
						System.out.println("\nLa reserva fue editada correctamente.");
						menu();
					}else {
						System.out.println("\nLo sentimos, no se puede editar un campo vacio.");
						menu();
					}
				}
			}
		}
	}
	
	private void pagar() {
		for(int c = 0; c < registro.length; c++) {
			if(registro[c] == null) {
				System.out.println("\nLo sentimos, no existe ningun registro del pago de reservas.");
				menu();
			}else {
				System.out.println("\nPor favor indique el id de la reserva que desea pagar:");
				id = entradaE.nextInt();
				
				if(id >= registro.length) {
					System.out.println("\nLo sentimos, el valor ingresado no es valido.");
					menu();
				}else {
					if(registro[id] != null) {
						System.out.println("\nPor favor indique el pago de la reserva:");
						registro[id] = registro[id] + " " + entradaU.nextLine();
						System.out.println("\nEl pago de la reserva fue realizada con éxito.");
						menu();
					}else {
						System.out.println("\nLo sentimos, no se puede editar un campo vacio.");
						menu();
					}
				}
			}
		}
	}

	protected void eliminar() {
		for(int i = 0; i < registro.length; i++) {
			if(registro[i] == null) {
				System.out.println("\nLo sentimos, la base de datos se encuentra vacia.");
				menu();
			}else {
				System.out.println("\nPor favor indique el id de la reserva que desea eliminar:");
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
