package com.example.roman.abstractfactorysample.models;

import com.example.roman.abstractfactorysample.R;

public class Strawberry implements Filling {
    @Override
    public String name() {
        return "Strawberry";
    }

    @Override
    public int image() {
        return R.drawable.strawberries;
    }

    @Override
    public String description() {
        return "Tasty strawberries";
    }

    @Override
    public String calories() {
        return "33 kcal";
    }
}
