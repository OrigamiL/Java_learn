package com.wf.java.bean;

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ResourceBundle bundle = ResourceBundle.getBundle("com/wf/java/bean/b");
        String s = bundle.getString("ClassName");
        Class c = Class.forName(s);
    }
}
