package com.wf.java.bean;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.lang.reflect.*;

public class EverythingIsTrue {

    static void setFinalStatic(Field field, Object newValue) throws Exception {

        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        System.out.println(Modifier.toString(field.getModifiers()));
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        System.out.println(Modifier.toString(field.getModifiers()));
        field.set(null, newValue);
    }

    public static void main(String[] args) throws Exception {

        setFinalStatic(Boolean.class.getField("FALSE"), true);
        System.out.format("Everything is %s\n", false); // "Everything is true"
        Class booleanClass = Class.forName("java.lang.Boolean");
        Field field = booleanClass.getDeclaredField("FALSE");
        Constructor constructor = booleanClass.getConstructor(boolean.class);
        Object obj = constructor.newInstance(false);
        System.out.println(obj);
        System.out.println(field.get(null));
    }
}
