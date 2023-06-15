package ArrayList;

import java.util.*;

class AL22 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Volkeswagen");
        cars.add("Toyota");
        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Ford");
        Collections.reverse(cars);
        System.out.println(cars);
    }
}
