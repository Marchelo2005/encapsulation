package com.example.builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {


    public static void main(String[] args) {
        Hi hi = new Hi();
        hi.setName("Hi guys");
        System.out.println(hi.getName());

        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        Animal myDogPig=new pidDog();
        Animal myChick=new Chick();
        Animal myCat=new Cat();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myDogPig.animalSound();
        myChick.animalSound();
        myCat.animalSound();
    }

}

