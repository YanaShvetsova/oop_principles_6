package oop_principles.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollection {
    public static void main(String[] args) {
        /*
        Create 3 Animal objects named as a1, a2, a3 and all of them are in the shape of Animal
         */

        /*
        Create 2 Dog object named as d1 and d2
        d1 in the shape of Dog
        d2 in the shape of Animal
         */

        /*
        Create 2 Cat object named as c1 and c2
        c1 in the shape of Cat
        c2 in the shape of Animal
         */

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();

        Dog d1 = new Dog();
        Animal d2 = new Dog();

        Cat c1 = new Cat();
        Animal c2 = new Cat();

        Animal[] animals = {a1, a2, a3, d1, d2, c1, c2};



        for(Animal a : animals){
            a.eat();
        }

        System.out.println("\n------------------\n");

        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);

        // Remember forEach() method
        new ArrayList<>(Arrays.asList("Yahya", "Lesia", "Alina", "Yana")).forEach(System.out::println);

    }
}
