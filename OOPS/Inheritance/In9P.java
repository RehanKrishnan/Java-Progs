package OOPS.Inheritance;

class MTech {
    public void intern() {
        System.out.println("5 yrs course");
    }
}

class G extends MTech {
    public void intern() {
        System.out.println("Student 1");
    }
}

class B extends MTech {
    public void intern() {
        System.out.println("Student 2");
    }
}

class In9P {
    public static void main(String[] args) {
        MTech mtech = new MTech();
        MTech g = new G();
        MTech b = new B();
        mtech.intern();
        g.intern();
        b.intern();
    }
}