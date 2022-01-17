package com.company;

public class Dog extends Animal {

    public Dog(String name, int weight){
        super(name, weight);
System.out.println("Sharik, 35");
    }

    @Override
    public void makeSound() {
        System.out.println("Собака говорит - Woof");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест мясо");
    }

    @Override
    public void sleap() {
        System.out.println("Собака спит в будке");
    }
}
