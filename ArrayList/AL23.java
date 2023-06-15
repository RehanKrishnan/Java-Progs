package ArrayList;

import java.util.*;

class AL23 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Volkeswagen");
        cars.add("Toyota");
        cars.add("Volkeswagen");
        cars.add("Jeep");
        cars.add("Fiat");
        cars.add("Volkeswagen");
        cars.add("Ford");
        Collections.shuffle(cars);
        System.out.println(cars);
    }
}
