package com.sparta.week01.prac;

public class Tutor {
    private String name;
    private String bio;

    // Constructor
    public Tutor() {

    }

    public Tutor(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    // Getter
    public String getName() {
        return this.name;
    }
    public String getBio() {
        return this.bio;
    }


    // Setter
    public void setName() {
        this.name = name;
    }

    public void setBio() {
        this.bio = bio;
    }
}
