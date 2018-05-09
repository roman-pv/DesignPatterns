package com.example.roman.abstractfactorysample.models;

import com.example.roman.abstractfactorysample.R;

public class WhiteChocolate implements Chocolate {
    @Override
    public String name() {
        return "White Chocolate";
    }

    @Override
    public int image() {
        return R.drawable.white_chocolate;
    }

    @Override
    public String description() {
        return "Tasty white chocolate";
    }

    @Override
    public String calories() {
        return "540 kcal";
    }
}
