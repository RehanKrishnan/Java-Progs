package ArrayList;

import java.util.*;

class AL29 {
    public static void main(String args[]) {
        String sent = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String ban[] = { "hit" };
        String s = "";
        String lc = sent.toLowerCase();
        String[] ps = lc.split("\\W+");
        int count = 0, max = 0;
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> bn = new ArrayList<>();
        for (int i = 0; i < ban.length; i++) {
            bn.add(ban[i]);
        }
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(ps));
        for (int i = 0; i < l1.size(); i++) {
            if (!l.contains(l1.get(i))) {
                l.add(l1.get(i));
            }
        }
        for (int i = 0; i < l.size(); i++) {
            count = 0;
            if (!bn.contains(l.get(i))) {
                count = Collections.frequency(l1, l.get(i));
            }
            if (count > max) {
                max = count;
                s = l.get(i);
            }
        }
        System.out.println(s);
    }
}