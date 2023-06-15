package ArrayList;

import java.util.*;

class Main {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Volkeswagen");
        cars.add(2, "Skoda");
        ArrayList<String> more_Cars = new ArrayList<String>(Arrays.asList("Fiat", "Jeep"));
        cars.removeAll(more_Cars);

        System.out.println(cars);

    }
}
