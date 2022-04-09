package com.weifang.test;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student a = new Student(1,"张三");
        Student b = new Student(1,"李四");
        map.put(a,"first");
        map.put(b,"second");
        System.out.println(map.get(a));
        Set<Student> students = map.keySet();

        for (Student s :
                students) {
            System.out.println(s+"----->"+map.get(s));
        }
    }
}
class Student{
    private int num;
    private String name;

    public Student(){

    }

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return num == student.num && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num,name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
