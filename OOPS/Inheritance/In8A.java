package OOPS.Inheritance;

abstract class MotorBike {
    abstract void brake();
}

class Bikes extends MotorBike {

    public void brake() {
        System.out.println("Bike Brake");
    }
}

class SportsBike extends MotorBike {

    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class Main {
    public static void main(String[] args) {
        SportsBike m1 = new SportsBike();
        m1.brake();
        Bikes s1 = new Bikes();
        s1.brake();
    }
}