package com.designpattern;

public class FMYellowHuman implements FMHuman {
    @Override
    public void getColor() {
        System.out.println("黄色肤色");
    }

    @Override
    public void talk() {
        System.out.println("亚洲居多");
    }
}
