package oop_principles.polymorphism;

public class Animal {

    // eat(), sleep()

    public void eat(){
        System.out.println("Animal eats");
    }

    //Overloaded eat method
    public void eat(String str){
        System.out.println("Animal eats " + str);
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }

    //Overloaded sleep method
    public void sleep(int i){
        System.out.println("Animal sleeps " + i + " hours");
    }


}
