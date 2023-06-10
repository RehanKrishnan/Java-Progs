package OOPS.Inheritance;

class Elephant {
    void run() {
        System.out.println("^Elephant^");
    }
}

class Elephant1 extends Elephant {
    void sleep() {
        System.out.println("Elephant sleeps by standing");
    }
}

class Elephant2 extends Elephant {
    void run() {
        System.out.println("Elephant is running");
    }
}

class Elephant3 extends Elephant {
    void play() {
        System.out.println("Elephant plays with other elephants");
    }
}

class In3 {
    public static void main(String args[]) {
        Elephant3 E3 = new Elephant3();
        Elephant2 E2 = new Elephant2();
        Elephant1 E1 = new Elephant1();
        Elephant c1 = new Elephant();

        c1.run();
        E3.play();
        E2.run();
        E1.sleep();

    }
}