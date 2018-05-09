package com.example.roman.abstractfactorysample.models;

import com.example.roman.abstractfactorysample.R;

public class Raspberry implements Filling {
    @Override
    public String name() {
        return "Raspberry";
    }

    @Override
    public int image() {
        return R.drawable.raspberries;
    }

    @Override
    public String description() {
        return "Tasty raspberries";
    }

    @Override
    public String calories() {
        return "53 kcal";
    }
}
