package com.designpattern;

public class HMHumanFactory extends FMAbstractHumanFactory {
    @Override
    public <T extends FMHuman> T createHuman(Class<T> c) {
        FMHuman human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生成人种错误");
        }
        return (T)human;
    }
}
