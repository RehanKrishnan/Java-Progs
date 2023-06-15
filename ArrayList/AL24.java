package ArrayList;

import java.util.*;

class AL24 {
    public static void main(String args[]) {
        int c = 0;
        String[] cars = { "Hyundai", "Honda", "Ford", "Jeep", "Fiat" };
        ArrayList<String> Cs = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (Cs.contains(cars[i]) == false) {
                Cs.add(cars[i]);
                c++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println(Cs.get(i));
        }
    }
}
