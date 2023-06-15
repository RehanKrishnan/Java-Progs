package ArrayList;

import java.util.*;

class AL12 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Volkeswagen");
        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Ford");
        System.out.println(cars.get(1));
    }
}