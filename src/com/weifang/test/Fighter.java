package com.weifang.test;

public class Fighter extends Weapon implements Moveable, Attachable {

    public Fighter(String name) {
        super(name);
    }

    public Fighter(){
        super.setName("fighter");

    }

    @Override
    public void attack() {
        System.out.println(super.getName()+"正在攻击！");
    }

    @Override
    public void move() {
        System.out.println(super.getName()+"正在飞行！");
    }

    @Override
    public String toString() {
        if (super.getName() == null)
            return "fighter";
        return super.getName();
    }
}
