package com.example.roman.abstractfactorysample.models;

public class MilkChocolate implements Chocolate {
    @Override
    public String name() {
        return "Milk Chocolate";
    }

    @Override
    public String calories() {
        return "535 kcal";
    }
}
