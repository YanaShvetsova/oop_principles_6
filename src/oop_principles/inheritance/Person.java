package oop_principles.inheritance;

import java.time.LocalDate;

public class Person {

    // default constructor
    public Person(){}

    public Person (String name, int age){
       this.name = name;
       this.age = age;

    }

    public Person (String name, int age, LocalDate DOB){
        this(name, age);
        this.DOB = DOB;

    }

    public Person (String name, int age, LocalDate DOB, String SSN){
        this(name, age, DOB);
        this.SSN = SSN;

    }

    // instance variables
    public String name;
    protected int age;
    LocalDate DOB;
    private String SSN;


    // functions
    public void walk(){
        System.out.println("Person walks");
    }

    public void eat(){
        System.out.println("Person eats");
    }

    public void talk(){
        System.out.println("Person talks");
    }

}
