package OOPS.Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Animal-Dog");
    }
}

class Bulldog extends Dog {
    void guard() {
        System.out.println("Dog-Pug");
    }
}

public class In2 {
    public static void main(String[] args) {
        Bulldog b = new Bulldog();
        b.eat();
        b.bark();
        b.guard();
    }
}
