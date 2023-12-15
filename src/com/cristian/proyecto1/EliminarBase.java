package com.cristian.proyecto1;

public abstract class EliminarBase implements Eliminar {
    private Eliminar next;
    
    @Override
    public void setNext(Eliminar next) {
        this.next = next;
    }
    
    @Override
    public void handle(Object request) {
        if (this.next != null) {
            this.next.handle(request);
        }
    }
}
