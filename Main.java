package com.company;

public class Main {

    public static void main(String[] args) {
        Animal Cat = new Cat("Vasya",3);
        Cat.makeSound();
        Cat.eat();
        Cat.sleap();

        Animal Dog = new Dog("Sharik", 35);
        Dog.makeSound();
        Dog.eat();
        Dog.sleap();

        Animal Koala = new Koala("Lou", 60);
        Koala.makeSound();
        Koala.eat();
        Koala.sleap();
    }
}