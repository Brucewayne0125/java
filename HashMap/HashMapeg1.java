
// HashMap

import java.util.*;

class HashMapeg1 {
    public static void main(String args[]) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(100, "Vishv");
        hm.put(101, "Tanaya");
        hm.put(102, "Parth");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
