package ArrayList;

import java.util.*;

class AL2 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Volkeswagen");
        cars.add(2, "Skoda");

        System.out.println(cars);

    }
}
