package oop_principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        /*
        Polymorphism
            1. Static Polymorphism - method overloading - compiler time polymorphism
            2. Dynamic Polymorphism - method overriding - runtime polymorphism
         */

        System.out.println("\n----------Static Polymorphism----------\n");
        Animal animal1 = new Animal();
        animal1.eat(); // Animal eats

        animal1.eat("meat"); // Animal eats meat


        System.out.println("\n----------Dynamic Polymorphism----------\n");
        Dog dog1 = new Dog();
        Animal dog2 = new Dog(); // Dog in the shape of Animal - upcasting


        dog1.eat(); // Dog eats
        dog2.eat(); // Dog eats


        System.out.println("\n----------Up-casting happens implicitly----------\n");
        //Ref     = Object
        Animal a1 = new Cat(); // up-casting
        Animal a2 = new Dog(); // up-casting

        a1.eat(); // Animal eats
        a2.eat(); // Dog eats


        System.out.println("\n----------Down-casting happens explicitly----------\n");
        //Ref    = Object
        //Cat c1 = (Cat)new Animal(); // ClassCastException
        //Dog d1 = (Dog)new Animal(); // ClassCastException

        // Down casting can happen only for upcasted object
        Animal a5 = new Dog(); // up-casting

        Dog d5 = (Dog) a5; // down-casting

        a5.eat(); // Dog eats
        d5.eat(); // Dog eats


        Animal a10 = new Cat(); // up-casting

        Cat c10 = (Cat) a10; // down-casting

        a10.eat(); // Animal eats
        c10.eat(); // Animal eats
    }
}
