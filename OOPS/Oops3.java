package OOPS;

class Vehicle {
    public void drive() {
        System.out.println("4 Wheeler");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car - Camry");
    }
}

public class Oops3 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
