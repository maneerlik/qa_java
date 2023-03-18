package com.example;

import java.util.List;

public class Lion {

    private Feline feline;
    boolean hasMane;

    public Lion(String sex, Feline feline) throws IllegalArgumentException {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new IllegalArgumentException("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() {
        return feline.getFood("Хищник");
    }

}