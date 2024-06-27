package com.example.builder;

import java.security.PublicKey;

public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
class pidDog extends Animal{
    public void animalSound(){
        System.out.println("he pig says: wee wee\nThe dog says: bow wow");
    }
}
class Chick extends Animal{
    public void animalSound(){
        System.out.println("The chick says: pio pio pio");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println("The cat says: mau mau mau");
    }
}
