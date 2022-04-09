package com.wf.java.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectFiledTest02 {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("com.wf.java.bean.Student");
        Field fieldModifiers = Field.class.getDeclaredField("modifiers");
        fieldModifiers.setAccessible(true);
        Field[] fields =  studentClass.getDeclaredFields();
        Field field = studentClass.getDeclaredField(fields[2].getName());
        field.setAccessible(true);
        fieldModifiers.setInt(field,field.getModifiers()&~Modifier.FINAL&~Modifier.STATIC);
        Object obj = studentClass.newInstance();
        System.out.println(Modifier.toString(field.getModifiers()));
        field.set(obj,20);
        System.out.println(field.get(obj));
    }
}
