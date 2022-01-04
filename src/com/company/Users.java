package com.company;

public class Users {
    public String spec;
    public String name;
    public String surName;
    public int age;

    void User() {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.spec = spec;
    }
    String getSpec(){
        return spec;
    }
    public void setSpec(String newSpec) {
        this.spec = "Studentas";
        this.spec = "Destytojas";
        this.spec = "Admin";
    }

    String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    String getSurName(){
        return surName;
    }
    public void setSurName(String newSurName) {
        this.name = newSurName;
    }
    int getAge(){
        return age;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

}