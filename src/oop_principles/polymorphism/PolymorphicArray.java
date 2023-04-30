package oop_principles.polymorphism;

import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {

        Object[] words = {"Book", "Hello", "What's up?", 10, 10.5, true, false, 'X', '5', new Scanner(System.in), new Dog(), new Animal()};

        Object input = new Scanner(System.in);
        Object cat = new Cat();
        Object dog = new Dog();
        Object animal = new Animal();

    }
}
