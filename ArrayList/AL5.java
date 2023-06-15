package ArrayList;

import java.util.*;

class AL5 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Volkeswagen");
        cars.add(0, "Skoda");
        cars.add(0, "Jeep");
        cars.remove(1);

        System.out.println(cars);

    }
}
