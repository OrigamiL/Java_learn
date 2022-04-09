package com.weifang.test;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
    Cat cat = new Cat();
    Brid brid = new Brid();
    ArrayList<Animals> arrayList = new ArrayList<>();
    arrayList.add(cat);
    arrayList.add(brid);
    Iterator<Animals> iterator = arrayList.iterator();
    while (iterator.hasNext()){
        Animals animals = iterator.next();
        if(animals instanceof Brid){
            ((Brid) animals).chirp();
        }
    }
    }
}
class Animals{
    public void move(){
        System.out.println("动物在移动！");
    }
}
class Cat extends Animals{
    @Override
    public void move() {
        System.out.println("猫猫在移动！");
    }
}
class Brid extends Animals{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔！");
    }
    public void chirp(){
        System.out.println("鸟儿在鸣叫！");
    }
}