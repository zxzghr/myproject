package com.designpattern;

public abstract class FMAbstractHumanFactory {
    public abstract <T extends FMHuman> T createHuman(Class<T> c);
}
