package com.kodilla.patterns.strategy;

public class IndyvidualYoungCustomer extends Customer {
    public IndyvidualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggresivePredictor();
    }
}
