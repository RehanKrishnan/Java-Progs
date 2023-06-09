package OOPS;

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Human boy = new Human("Hari", 11);
        Human girl = new Human("Harini", 12);
        System.out.println(boy.getName() + "(boy) is " + boy.getAge() + " yrs");
        System.out.println(girl.getName() + "(girl) is " + girl.getAge() + " yrs\n");
    }
}
