package OOPS.Inheritance;

interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Human implements Walkable {
    public void walk() {
        System.out.println("Human is walking");
    }
}

class Human1 implements Swimmable {
    public void swim() {
        System.out.println("Human1 is swimming");
    }
}

class Human2 implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Human2 is walking");
    }

    public void swim() {
        System.out.println("Human2 is swimming");
    }
}

class In4 {
    public static void main(String[] args) {
        Human human = new Human();
        Human1 H1 = new Human1();
        Human2 H2 = new Human2();
        human.walk();
        H1.swim();
        H2.walk();
        H2.swim();
    }
}
