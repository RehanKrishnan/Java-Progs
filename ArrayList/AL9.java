package ArrayList;

import java.util.*;

class Main {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Volkeswagen");

        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Ford");
        cars.trimToSize();
        System.out.println(cars.size());
        System.out.println(cars);

    }
}
