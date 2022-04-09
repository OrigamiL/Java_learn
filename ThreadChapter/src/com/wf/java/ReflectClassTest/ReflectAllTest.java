package com.wf.java.ReflectClassTest;

import java.lang.reflect.*;

public class ReflectAllTest {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("com.wf.java.ReflectClassTest.Student");
        StringBuilder s = new StringBuilder();
        s.append(Modifier.toString(studentClass.getModifiers()));
        s.append(" class ");
        s.append(studentClass.getSimpleName());
        //获取父类及接口
        Class superClass = studentClass.getSuperclass();
        if (superClass!=null && !superClass.getSimpleName().equals("Object")){
            s.append(" extends ");
            s.append(superClass.getSimpleName());
            s.append(" ");
        }
        Class[] interfaces = studentClass.getInterfaces();
        if (interfaces.length > 0){
            s.append("implements ");
            for (Class i :
                    interfaces) {
                s.append(i.getSimpleName()).append(", ");
            }
            s.deleteCharAt(s.length()-1);
            s.deleteCharAt(s.length()-1);
        }
        s.append(" {\n");
        //获取field
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field :
                fields) {
            field.setAccessible(true);
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            if(Modifier.toString(field.getModifiers()).contains("final")){
                s.append(" = ");
                Object obj1 = studentClass.newInstance();
                Object obj = field.get(obj1);
                if (obj != null){
                    s.append(obj);
                }

            }
            s.append(";\n");
        }
        s.append("\n");
        //获取constructor
        Constructor[] constructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor :
                constructors) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(constructor.getDeclaringClass().getSimpleName());
            s.append("(");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter :
                    parameters) {
                s.append(parameter.getType().getSimpleName()).append(", ");
            }
            if(parameters.length != 0){
                s.deleteCharAt(s.length()-1);
                s.deleteCharAt(s.length()-1);
            }
            s.append(") { }\n");
        }
        s.append("\n");
        //获取Method
        Method[] methods = studentClass.getDeclaredMethods();
        for (Method method :
                methods) {
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter :
                    parameters) {
                s.append(parameter.getType().getSimpleName()).append(", ");
            }
            if(parameters.length != 0){
                s.deleteCharAt(s.length()-1);
                s.deleteCharAt(s.length()-1);
            }
            s.append(") { }\n");
        }
        s.append("\n}");
        System.out.println(s);
    }
}
