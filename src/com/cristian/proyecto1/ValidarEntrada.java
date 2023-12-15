package com.cristian.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author braulio04
 */
public class ValidarEntrada extends EliminarBase{
    @Override
    public void handle(Object request) {
        List<String> peliculas = (ArrayList<String>) request;
        System.out.println("Ingresa un indice");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        if (index >= peliculas.size()) System.out.println("\nLo sentimos, el valor ingresado no es valido.");
        else {
            Object[] data = { peliculas, index, sc };
            super.handle(data);
        };
    }
}