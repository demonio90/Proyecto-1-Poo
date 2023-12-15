package com.cristian.proyecto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braulio04
 */
public class DatosVacios extends EliminarBase{

    @Override
    public void handle(Object request) {
        List<String> peliculas = (ArrayList<String>) request;
        if (peliculas.isEmpty()) System.out.println("\nLo sentimos, no existe ningun registro de peliculas.");
        else super.handle(peliculas);
    }
    
}
