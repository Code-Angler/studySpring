package com.example.homework.prac;

public class Person {
    private String name;
    private String job;
    private int age;

//    public Person(){
//
//    }
//
//    public Person(String name, String job, int age) {
//        this.name = name;
//        this.job = job;
//        this.age = age;
//    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public String getName(){
        return this.name;
    }
    public String getJob(){
        return this.job;
    }
    public int getAge(){
        return this.age;
    }
}
