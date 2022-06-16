package com.revature.dev.service;

// This is the animal class
// It is missing some function implementations that you will need to do

public class Animal {

    private String name;
    private int age;
    private int legs;
    private Diet diet;

    public Animal(String name, int age, int legs, Diet diet) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public String speak(){
        return null;
    }

}
