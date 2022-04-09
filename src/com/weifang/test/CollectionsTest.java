package com.weifang.test;

import java.io.*;
import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TreeSet<Animal> treeSet = new TreeSet<>(Comparator.comparingInt(Animal::getAge));
        treeSet.add(new Animal(10,"as"));
        treeSet.add(new Animal(100,"asd"));
        treeSet.add(new Animal(180,"s"));
        treeSet.add(new Animal(120,"f"));
        ArrayList<Animal> animals = new ArrayList<>(treeSet);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("animals"));
        objectOutputStream.writeObject(animals);
        objectOutputStream.flush();
        objectOutputStream.close();
        for (Animal a : treeSet) {
            System.out.println(a);
        }
        Properties properties = new Properties();
        properties.setProperty("name", "zhang");
        properties.setProperty("password", "1234");

        String name = properties.getProperty("name");
        System.out.println(name);
        System.out.println("======");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("animals"));
        Object obj = objectInputStream.readObject();
        List<Animal> list = new ArrayList<>();
        if (obj instanceof List<?>) {
            list.addAll((List<Animal>) obj);
        }

        for (Animal a :
                list) {
            System.out.println(a);
        }
        objectInputStream.close();
    }
}
class Animal implements Serializable{
    private static final long serialVersionUID = 7896688279423120653L;
    private int age;
    private String name;

    public Animal(int age ,String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
 /*
    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }*/
}