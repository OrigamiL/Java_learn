package com.weifang.test;

public class Awces extends Weapon implements Moveable{
    public Awces() {
    }

    public Awces(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println(super.getName()+"正在飞行！");
    }

    @Override
    public String toString() {
        if (super.getName() == null)
            return "awces";
        return super.getName();
    }
}
