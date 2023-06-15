package ArrayList;

import java.util.*;

class AL19 {
    public static void main(String args[]) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Honda");
        cars.add("Hyundai");
        cars.add("Volkeswagen");
        ArrayList<String> car_collection = new ArrayList<String>();
        car_collection.add("Fiat");
        car_collection.add("Ford");
        car_collection.add("Toyota");
        car_collection.add("Jeep");
        cars.retainAll(car_collection);
        System.out.println(car_collection);

    }
}
