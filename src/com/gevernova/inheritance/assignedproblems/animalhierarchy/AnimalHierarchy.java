package com.gevernova.inheritance.assignedproblems.animalhierarchy;


public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal=new Dog();
        String name = animal.name;//single inheritance
        System.out.println(name);
        Animal animals=new Bird();
        animals.makeSound();//Overriding

    }
}
