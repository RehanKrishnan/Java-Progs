package ArrayList;

import java.math.BigInteger;
import java.util.*;

class AL30 {
    public static void main(String args[]) {
        int[] num = { 1, 2, 0, 0 };
        int s = 30;
        String r = "";
        String k = "";
        for (int i = 0; i < num.length; i++) {
            r = Integer.toString(num[i]);
            k += r;
        }
        String ch = Integer.toString(s);
        BigInteger v = new BigInteger(k);
        BigInteger b = new BigInteger(ch);
        BigInteger c = v.add(b);
        String rs = c.toString();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < rs.length(); i++) {
            res.add(Character.getNumericValue(rs.charAt(i)));
        }
        System.out.println(res);
    }
}