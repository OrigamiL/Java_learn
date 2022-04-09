package com.wf.java.ReflectClassTest;

public class Student {

    private int no;
    private String name;
    private String address;
    private static final int mate = 1;

    public Student() {
    }

    public Student(int no, String name, String address) {
        this.no = no;
        this.name = name;
        this.address = address;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean doSome(String name, int no) {
        System.out.println("doSome");
        return true;
    }
}
