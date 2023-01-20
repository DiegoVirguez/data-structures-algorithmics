package com.diego.polimorfismo;


import java.util.List;

public class Animal {
    public Animal() {
        System.out.println("Animal");
    }
}

interface SoundBehavior {}

class Cat extends Animal implements SoundBehavior {


    public Cat() {
        super();
        System.out.println("mi gato");
    }
}

class Dog extends Animal implements SoundBehavior {
    public Dog() {
        System.out.println("mi perro");
    }
}

class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        SoundBehavior soundBehavior = myDog;
        Animal animal = myDog;


    }

}