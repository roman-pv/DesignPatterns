package com.example.roman.abstractfactorysample.factories;

import com.example.roman.abstractfactorysample.models.Chocolate;
import com.example.roman.abstractfactorysample.models.DarkChocolate;
import com.example.roman.abstractfactorysample.models.Filling;
import com.example.roman.abstractfactorysample.models.MilkChocolate;
import com.example.roman.abstractfactorysample.models.WhiteChocolate;

public class ChocolateFactory extends AbstractFactory {

    @Override
    public Chocolate getChocolate(String chocolate) {
        switch (chocolate) {
            case "WHITE":
                return new WhiteChocolate();
            case "MILK":
                return new MilkChocolate();
            case "DARK":
                return new DarkChocolate();
            default:
                return null;
        }
    }

    @Override
    public Filling getFilling(String filling) {
        return null;
    }
}
