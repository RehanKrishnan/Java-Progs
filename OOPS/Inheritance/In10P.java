package OOPS.Inheritance;

class Shapes {
    public void area() {
        System.out.println("Find area ");
    }

    public void area(int r) {
        System.out.println("Circle area = " + 3.14 * r * r);
    }

    public void area(int l, int b) {
        System.out.println("Rectangle area=" + l * b);
    }

}

class In10P {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        s.area(5);
        s.area(6, 2);

    }
}
