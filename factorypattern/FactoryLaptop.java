package com.factorypattern;

public class FactoryLaptop {
    public Laptop getNewLaptop(String str){
        if(str.equals("Apple"))
            return new AppleLaptop();
        else if(str.equals("Dell"))
            return new DellLaptop();
        else
            return new HpLaptop();
    }
}
