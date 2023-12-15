package com.cristian.proyecto1;

public class CRUD {
    private Strategy strategy;

    public CRUD(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.execute();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}