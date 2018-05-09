package com.example.roman.abstractfactorysample.models;

public class Strawberry implements Filling {
    @Override
    public String name() {
        return "Strawberry";
    }

    @Override
    public String calories() {
        return "33 kcal";
    }
}
