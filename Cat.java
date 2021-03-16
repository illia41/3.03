package com.company;

public class Cat extends Animal{
    String name;
    String color;
    public Cat(String name, String color){

    }
    public void makeSound(){
        System.out.println("Kot: ");
        System.out.println("miau");
        System.out.println(name);
        System.out.println(color);
    }
}
