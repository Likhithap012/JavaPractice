package com.gevernova.inheritance.assignedproblems;



class Animal{
    String name="likhitha";
    int age;
    void makeSound(){
        System.out.println("Animal is making sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog is making sound");
    }
}
class Bird extends Animal{
    void makeSound(){
        System.out.println("Bird is making sound");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal animal=new Dog();
        String name = animal.name;//single inheritance
        System.out.println(name);
        Animal animals=new Bird();
        animals.makeSound();//Overriding

    }
}
