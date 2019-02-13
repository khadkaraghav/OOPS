package com.company;

public class Main {

    public static void main(String[] args) {


        Dog dog = new Dog();
        Bird bird = new Bird();
        Unicorn unic = new Unicorn();
        Cars car = new Cars();

        System.out.println(dog.makeSound());
        System.out.println(unic.fly());
        System.out.println(car.model().toLowerCase());
    }
}
