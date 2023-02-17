package com.factorypattern;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryLaptop lap=new FactoryLaptop();
        Laptop orderLap=lap.getNewLaptop( "Apple");
        Laptop appleLaptop = new AppleLaptop();

        orderLap.orderLaptop();

    }
}
