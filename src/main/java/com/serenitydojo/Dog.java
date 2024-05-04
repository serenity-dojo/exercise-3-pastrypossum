package com.serenitydojo;

public class Dog {

    private String name;
    private int age;
    private String toy;
    private boolean isFed;

    private static final String DOG_NOISE = "Woof";

    public Dog(String name, String toy, int age) {
        this.name = name;
        this.toy = toy;
        this.age = age;
    }

    public static String makeNoise() {

        return DOG_NOISE;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getToy() {
        return toy;
    }

    public void feed() {
        this.isFed = true;
    }

    public boolean hasBeenFed() {
        return isFed;
    }
}
