package com.wf.java.bean;

public class ArgsTest {
    public static void main(String[] args) {
        m("wo","shi");
    }
    public static void m(String... args){
        System.out.println("m方法执行！");
    }
}
