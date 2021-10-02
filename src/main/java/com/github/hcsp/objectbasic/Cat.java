package com.github.hcsp.objectbasic;

public class Cat {
    int age = initAge();
    String name;
    static {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }

    public int initAge() {
        System.out.println(4);
        return 0;
    }
    public int count = initStaticCount();
    public static int initStaticCount() {
        System.out.println(5);
        return 0;
    }

    public Cat(String name) {
        age = 0;
        this.name = name;
        System.out.println(6);
        System.out.println(7);
    }

    public Cat(int age, String name) {
        this(name);
        this.age = age;

    }
}
