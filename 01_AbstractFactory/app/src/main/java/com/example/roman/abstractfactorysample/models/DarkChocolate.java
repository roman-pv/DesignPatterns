package com.example.roman.abstractfactorysample.models;

import com.example.roman.abstractfactorysample.R;

public class DarkChocolate implements Chocolate {
    @Override
    public String name() {
        return "Dark Chocolate";
    }

    @Override
    public int image() {
        return R.drawable.dark_chocolate;
    }

    @Override
    public String description() {
        return "Tasty dark chocolate";
    }

    @Override
    public String calories() {
        return "650 kcal";
    }
}
