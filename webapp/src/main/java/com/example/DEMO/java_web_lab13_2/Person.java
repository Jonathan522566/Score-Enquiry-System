package com.example.DEMO.java_web_lab13_2;

public class Person {
     private Cat cat;
     private Dog dog;
     private String pName;

     public Person(){
         super();
     }
     public Person(Cat cat,Dog dog){
         this.cat=cat;
         this.dog=dog;
     }

     public Cat getCat(){
         return cat;
     }
     public void setCat(Cat cat){
         this.cat=cat;
     }

     public Dog getDog(){
         return dog;
     }
     public void setDog(Dog dog){
         this.dog=dog;
     }

     public String getpName(){
         return pName;
     }
    public void setpName(String str) {
        this.pName = str;
    }
}
