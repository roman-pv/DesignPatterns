package com.example.roman.abstractfactorysample.models;

public class Raspberry implements Filling {
    @Override
    public String name() {
        return "Raspberry";
    }

    @Override
    public String calories() {
        return "53 kcal";
    }
}
