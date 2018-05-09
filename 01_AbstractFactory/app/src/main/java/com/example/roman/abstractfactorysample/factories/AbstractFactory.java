package com.example.roman.abstractfactorysample.factories;

import com.example.roman.abstractfactorysample.models.Chocolate;
import com.example.roman.abstractfactorysample.models.Filling;

public abstract class AbstractFactory {
        public abstract Chocolate getChocolate(String chocolate);
        public abstract Filling getFilling(String filling);
}
