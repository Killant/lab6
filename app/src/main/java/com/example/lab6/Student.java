package com.example.lab6;

import java.io.Serializable;


public class Student extends Human {
    private String group;

    Student () {

    }
    public Student (String name, String group) {
        super(name);
        this.group = group;
    }

    public Student (String name, String lastName,String group) {
        super(name, lastName);
        this.group = group;
    }

    public Student (String name, String lastName, Integer age, String group) {
        super(name, lastName, age);
        this.group = group;
    }

    public String getGroup () {
        return group;
    }

    public void getGroup (String group) {
        this.group = group;
    }
    @Override
    public String toString() {
        return String.format("Human = {firstName: %s, lastName: %s, age: %d, group: %s}",
            this.firstName, this.lastName, this.age, this.group);

}
}