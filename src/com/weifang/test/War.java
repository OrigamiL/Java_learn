package com.weifang.test;

public class War {
    public static void main(String[] args) {
        Army army = new Army(5);
        Weapon tank = new Tank();
        Weapon artillery = new Artillery("火炮");
        Weapon fighter = new Fighter();
        Weapon f22 = new Fighter("F22");
        Weapon awacs = new Awces("预警机");
        try{
        army.addWeapon(tank);
        army.addWeapon(artillery);
        army.addWeapon(fighter);
        army.addWeapon(f22);
      //  System.out.println(army.getW()[3].getName());
        army.addWeapon(awacs);
        army.addWeapon(awacs);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        army.moveAll();
        army.attackAll();
    }
}
