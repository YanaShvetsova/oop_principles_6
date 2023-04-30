package oop_principles.abstraction;

public abstract class Phone {

    public Phone(){

    }

    public Phone(String color){
        this.color = color;
    }

    public String color;


    public abstract void call();

    public abstract void text();

    public void ring(){
        System.out.println("Phone rings");
    }
}
