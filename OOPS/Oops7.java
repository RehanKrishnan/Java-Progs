package OOPS;

class Square {
    int area(int sq) {
        return sq * sq;
    }
}

class Rectangle {
    int area(int re, int ct) {
        return re * ct;
    }
}

class Oops7 {
    public static void main(String args[]) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        System.out.println("Square: " + s.area(4));
        System.out.println("Rectangle: " + r.area(4, 7));
    }
}
