package com.wf.java.bean;
//reflect field
public class Student {
    public int num;
    private String name;
    protected static final int age = 10;
    boolean sex;

    public Student() {
    }

    public Student(int num, String name, boolean sex) {
        this.num = num;
        this.name = name;
        this.sex = sex;
    }
    public String doSome(String s) {
        return s;
    }
}
