package OOPS.Inheritance;

abstract class Bike {
    abstract void on();

    void off() {
        System.out.println("Zzz");
    }
}

class Yamaha extends Bike {
    void on() {
        System.out.println("Vroom!");
    }
}

class In7A {
    public static void main(String args[]) {
        Yamaha y1 = new Yamaha();
        y1.on();
        y1.off();
    }
}