package com.company;

public class Koala extends Animal{

    public Koala(String name, int weight){
        super(name, weight);
        System.out.println("Lou, 60");
    }
    @Override
    public void makeSound() {
        System.out.println("Коала говорит - Uuuuu");
    }

    @Override
    public void eat() {
        System.out.println("Коала ест листья деревьев");
    }

    @Override
    public void sleap() {
        System.out.println("Коала спит на дереве");
    }
}
