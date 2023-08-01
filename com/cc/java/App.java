package com.cc.java;

public class App {

    public static void main(String[] args) {

        Child child = new Child();
        output(child.sayHello());

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
