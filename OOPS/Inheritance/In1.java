package OOPS.Inheritance;

class Vehicle {
    void drive() {
        System.out.println("2/4 Wheeler");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("4 Wheeler[car] is moving forward!");
    }
}

public class In1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
        myCar.accelerate();
    }
}
