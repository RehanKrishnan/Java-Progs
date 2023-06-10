package OOPS.Inheritance;

class Area {

    int l;
    int b;

    Area(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void getArea() {
        int area = l * b;
        System.out.println("Area: " + area);
    }
}

class In6E {
    public static void main(String[] args) {

        Area rect = new Area(7, 2);
        rect.getArea();
    }
}
