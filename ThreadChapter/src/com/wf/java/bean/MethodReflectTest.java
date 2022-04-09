package com.wf.java.bean;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodReflectTest {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("com.wf.java.bean.Student");
        Method method = studentClass.getDeclaredMethod("doSome", String.class);
        Constructor constructor = studentClass.getConstructor();
        Object obj = constructor.newInstance();
        Object obj1 = method.invoke(obj,"azhe");
        System.out.println(obj1);
    }
}
