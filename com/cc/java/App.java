package com.cc.java;

public class App {

    public static void main(String[] args) {

        Parent dad = new Parent();
        Children child = new Children();

        output(dad.sayHello("Hey!"));
        output(dad.sayHello());
        output(child.sayHello());

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}
