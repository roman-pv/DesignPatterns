package com.example.roman.abstractfactorysample.models;

public class DarkChocolate implements Chocolate {
    @Override
    public String name() {
        return "Dark Chocolate";
    }

    @Override
    public String calories() {
        return "650 kcal";
    }
}
