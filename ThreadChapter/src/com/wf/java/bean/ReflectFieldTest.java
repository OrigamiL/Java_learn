package com.wf.java.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectFieldTest {
    public static void main(String[] args) throws Exception{
        Class studentClass = Class.forName("com.wf.java.bean.Student");
        StringBuilder  stringBuilder = new StringBuilder();
        String student = studentClass.getSimpleName();
        String modifierString = Modifier.toString(studentClass.getModifiers());
        stringBuilder.append(modifierString+" class ");
        stringBuilder.append(student+"\n");

        Field[] field = studentClass.getDeclaredFields();

        for (Field f :
                field) {
            stringBuilder.append("\t"+Modifier.toString(f.getModifiers())+" "+f.getType().getSimpleName()+" "+f.getName()+"\n");
        }
        System.out.println(stringBuilder);
    }
}
