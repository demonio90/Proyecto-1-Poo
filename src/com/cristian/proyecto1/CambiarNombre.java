package com.cristian.proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author braulio04
 */
public class CambiarNombre extends EliminarBase{
    @Override
    public void handle(Object request) {
        Object[] data = (Object[]) request;
        List<String> movies = (ArrayList<String>) data[0];
        int index = (int) data[1];
        Scanner sc = (Scanner) data[2];
        System.out.println("Ingresa un nuevo nombre");
        String newName = "";
        sc.nextLine();
        newName = sc.nextLine();
        movies.set(index, newName);
        sc.close();
        super.handle(request);
    }
}