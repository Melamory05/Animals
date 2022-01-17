package com.company;

public class Cat extends Animal {

    public Cat(String name, int weight){
        super(name,weight);
System.out.println("Vasya, 3");
    }
    @Override
    public void makeSound() {
        System.out.println("кот говорит - Meow");
    }

    @Override
    public void eat() {
        System.out.println("кот ест мясо");
    }

    @Override
    public void sleap() {
        System.out.println("кот спит в доме");
    }

}
