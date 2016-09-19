package com.cristian.proyecto1;

public class Boletos extends Usuarios {

	public Boletos() {
		menu();
	}
	
	protected void menu() {
		System.out.println("\nBoletos:\n\n" + "1)Listar Boletos.\n" + "2)Comprar Boletos.\n" + "3)Editar Boletos.\n" + "4)Eliminar Boletos.\n" + "5)Volver atrás.\n");
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
			System.out.println("\nActualmente no hay registro de boletos comprados.");
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
			System.out.println("\nLo sentimos, a excedido el limite de boletos comprados.");
			menu();
		}else {
			System.out.println("\nPor favor ingrese el numero de boletos que desea a comprar:");
			registro[contador] = entradaU.nextLine();
			contador++;
			System.out.println("La compra de boletos se ha registrado con éxito.");
			menu();
		}
	}

	protected void editar() {
		for(int c = 0; c < registro.length; c++) {
			if(registro[c] == null) {
				System.out.println("\nLo sentimos, no existe ningun registro de compra de boletos.");
				menu();
			}else {
				System.out.println("\nPor favor indique el id del boleto que desea editar:");
				id = entradaE.nextInt();
				
				if(id >= registro.length) {
					System.out.println("\nLo sentimos, el valor ingresado no es valido.");
					menu();
				}else {
					if(registro[id] != null) {
						System.out.println("\nIndique el nuevo número de boletos:");
						registro[id] = entradaU.nextLine();
						System.out.println("\nEl número de boletos comprados fue editado correctamente.");
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
				System.out.println("\nPor favor indique el id del boleto que desea eliminar:");
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
