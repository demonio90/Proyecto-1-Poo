package com.cristian.proyecto1;

public interface Eliminar {
    public void setNext(Eliminar e);
    
    public void handle(Object request);    
}