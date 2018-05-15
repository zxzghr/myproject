package com.designpattern;

public class FMWhiteHuman implements FMHuman {
    @Override
    public void getColor() {
        System.out.println("白色肤色");
    }

    @Override
    public void talk() {
        System.out.println("欧洲居多");
    }
}
