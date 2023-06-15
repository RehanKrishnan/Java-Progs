package ArrayList;

import java.util.*;

class AL26 {
    public static void main(String[] args) {
        ArrayList<Integer> regno = new ArrayList<Integer>();
        regno.add(1);
        regno.add(6);
        regno.add(7);
        regno.add(11);
        regno.add(12);
        regno.add(23);
        System.out.println("Register Number: " + regno);
        regno.removeIf(e -> (e % 2) == 0);
        ;
        System.out.println("Odd Numbers: " + regno);
    }
}