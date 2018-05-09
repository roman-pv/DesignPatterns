package com.example.roman.abstractfactorysample.models;

public class WhiteChocolate implements Chocolate {
    @Override
    public String name() {
        return "White Chocolate";
    }

    @Override
    public String calories() {
        return "540 kcal";
    }
}
