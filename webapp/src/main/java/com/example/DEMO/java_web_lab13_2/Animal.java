package com.example.DEMO.java_web_lab13_2;

public class Animal {
    public String name;
    public String age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }

    public void feed(){
        System.out.println("Feed Animal");
    }
    public void shout(){
        System.out.println("Animal shout");
    }

}
