package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class AL28 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Honad");
        cars.add("Hyundai");
        cars.add("Toyota");
        cars.add("Jeep");
        Iterator<String> iterate = cars.iterator();
        System.out.print("ArrayList: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
