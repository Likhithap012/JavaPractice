package com.gevernova.customannotations.override;

public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
