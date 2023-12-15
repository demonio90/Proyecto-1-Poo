package com.cristian.proyecto1;

public class Main {
    public static void main(String[] args) {
        CRUD crud = new CRUD(new SalasStrategy());
        crud.execute();
        crud.setStrategy(new HorariosStrategy());
        crud.execute();
    }
}