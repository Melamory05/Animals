package com.company;

public abstract class Animal {

    private String name;
    private int weight;

    public Animal(String name, int weight) {
        System.out.println("Это животное");
        this.name = name;
        this.weight = weight;

    }
        abstract public void makeSound ();

        abstract public void eat ();

        abstract public void sleap ();



        @Override
        public boolean equals (Object o){
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Animal animal = (Animal) o;

            if (weight != animal.weight) {
                return false;
            }
            if (name != animal.name) {
                return false;
            }
            if (!name.equals(animal.name)) {
                return false;
            }

            return false;
        }
    }


