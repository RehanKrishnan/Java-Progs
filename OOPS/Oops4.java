package OOPS;

class Animal {
    public void makeSound() {
        System.out.println("Different animals makes different sounds!!!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cats sounds MEOW!!");
    }
}

public class Oops4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
