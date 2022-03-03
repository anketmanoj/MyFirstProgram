public class Car {
    String make = "Toyota";
    String model = "GT86";
    int year = 2016;
    String color = "red";
    double price = 20000.00;

    void drive() {
        System.out.println("The " + make + " " + model + " is driving.");
    }

    void brake() {
        System.out.println("The " + make + " " + model + " is braking.");
    }

    void setMake(String make) {
        this.make = make;
    }

}
