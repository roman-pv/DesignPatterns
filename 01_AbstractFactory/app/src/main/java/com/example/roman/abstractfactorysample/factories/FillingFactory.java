package com.example.roman.abstractfactorysample.factories;

import com.example.roman.abstractfactorysample.models.Chocolate;
import com.example.roman.abstractfactorysample.models.Filling;
import com.example.roman.abstractfactorysample.models.Raspberry;
import com.example.roman.abstractfactorysample.models.Strawberry;

public class FillingFactory extends AbstractFactory {
    @Override
    public Chocolate getChocolate(String chocolate) {
        return null;
    }

    @Override
    public Filling getFilling(String filling) {
        switch (filling) {
            case "RASP":
                return new Raspberry();
            case "STRAW":
                return new Strawberry();
            default:
                return null;
        }
    }
}
