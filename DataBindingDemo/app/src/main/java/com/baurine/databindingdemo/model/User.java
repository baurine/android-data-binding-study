package com.baurine.databindingdemo.model;

/**
 * Created by baurine on 12/13/16.
 */

public class User {
    private final String firstName;
    private final String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void incAge() {
        age++;
    }

    public String getFullName() {
        return firstName + "." + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return firstName + "-" + lastName + ":" + age;
    }
}
