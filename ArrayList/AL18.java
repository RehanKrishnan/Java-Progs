package ArrayList;

import java.util.*;

class AL18 {
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
        ArrayList<String> sub_ArrayList = new ArrayList<String>(cars.subList(2, 6));
        System.out.println(sub_ArrayList);
    }
}
