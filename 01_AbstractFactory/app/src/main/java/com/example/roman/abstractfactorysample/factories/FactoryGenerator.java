package com.example.roman.abstractfactorysample.factories;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factory) {
        switch (factory) {
            case "CHOC":
                return new ChocolateFactory();
            case "FILL":
                return new FillingFactory();
            default:
                return null;
        }
    }
}
