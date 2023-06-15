package ArrayList;

import java.util.*;

class AL8 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Volkeswagen");

        cars.ensureCapacity(10);
        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Ford");
        System.out.println(cars.size());
        System.out.println(cars);

    }
}