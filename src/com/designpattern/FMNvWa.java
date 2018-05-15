package com.designpattern;

public class FMNvWa {
    public static void main(String[] args) {
        FMAbstractHumanFactory factory = new HMHumanFactory();
        FMHuman yellowHuman = factory.createHuman(FMYellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
