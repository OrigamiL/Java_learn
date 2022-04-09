package com.weifang.test;

public class Artillery extends Weapon implements Attachable {
    public Artillery() {
    }

    public Artillery(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(super.getName()+"正在开炮！");
    }

    @Override
    public String toString() {
        if (super.getName() == null)
            return "火炮";
        return super.getName();
    }
}
