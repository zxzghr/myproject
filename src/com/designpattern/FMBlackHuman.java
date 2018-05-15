package com.designpattern;

public class FMBlackHuman implements FMHuman {
    @Override
    public void getColor() {
        System.out.println("黑色皮肤");
    }

    @Override
    public void talk() {
        System.out.println("非洲居多");
    }
}
