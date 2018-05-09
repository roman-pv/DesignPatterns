package com.example.roman.abstractfactorysample.models;

import com.example.roman.abstractfactorysample.R;

public class MilkChocolate implements Chocolate {
    @Override
    public String name() {
        return "Milk Chocolate";
    }

    @Override
    public int image() {
        return R.drawable.milk_chocolate;
    }

    @Override
    public String description() {
        return "Tasty milk chocolate";
    }

    @Override
    public String calories() {
        return "535 kcal";
    }
}
