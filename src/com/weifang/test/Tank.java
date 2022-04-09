package com.weifang.test;

public class Tank extends Weapon implements Moveable, Attachable {

    public Tank(){
        super.setName("tank");

    }

    public Tank(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(super.getName()+"正在开炮！");
    }

    @Override
    public void move() {
        System.out.println(super.getName()+"正在行进！");
    }

    @Override
    public String toString() {
        if (super.getName() == null)
            return "tank";
        return super.getName();
    }


}
