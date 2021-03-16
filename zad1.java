package com.company;

public class Main {

    public static void main(String[] args) {
        Cat kot = new Cat("Barsik", "rudy");
        Dog pies = new Dog("Druzhok", "czarny");
        kot.makeSound(); System.out.println("\n");
        pies.makeSound();
    }
}
