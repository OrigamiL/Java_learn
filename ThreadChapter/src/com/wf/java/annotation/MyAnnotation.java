package com.wf.java.annotation;

public @interface MyAnnotation {

    String name();
    int age() default 265;

}
