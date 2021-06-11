package com.company;

public class Student {
    private String name;
    private String classes;
    Student(){

    }
    public void getClasses(){
        System.out.println(this.classes);
    }
    public void getName(){
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
