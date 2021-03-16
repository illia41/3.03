package com.company;

public class Dog extends Animal{
    String name;
    String color;
    public  Dog(String name , String color) {
        this.name = name;
        this.color = color;
    }
    public void makeSound(){
        System.out.println("piesko: ");
        System.out.println("hau hau");
        System.out.println(name);
        System.out.println(color);
    }
}
