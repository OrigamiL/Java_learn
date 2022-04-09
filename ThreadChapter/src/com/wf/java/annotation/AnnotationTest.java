package com.wf.java.annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        System.out.println("a");
    }

    @MyAnnotation(name = "zhangSan")
    private int al;

    public AnnotationTest() {

    }


    public int getAl() {
        return al;
    }

}
