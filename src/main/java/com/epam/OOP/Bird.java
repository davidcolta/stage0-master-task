package com.epam.OOP;

public class Bird extends Animal {
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        String baseDescription = super.getDescription();
        return baseDescription + " Moreover, it has 2 wings and can fly.";
    }
}