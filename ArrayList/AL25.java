package ArrayList;

import java.util.ArrayList;

class AL25 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Volkeswagen");
        cars.add("Toyota");
        cars.add("Jeep");
        cars.add("Fiat");
        System.out.println("ArrayList: " + cars);
        cars.subList(1, 3).clear();
        System.out.println("Updated ArrayList: " + cars);
    }
}
