package class_vs_object;

public class Car {

    //create 4 instance variables as make, model, year, price and set them all public
    public String make;
    public String model;
    public int year;
    public double price;

    //create 4-args constructor, this helps to assign local variable to instance variable
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //override toString method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
