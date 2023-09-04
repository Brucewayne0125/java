


import java.util.*;

class HashMapeg2 {
    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        System.out.println("Initial list of elements: " + hm);

        hm.put(100, "Vishv");
        hm.put(101, "Tanaya");
        hm.put(102, "Parth");

        System.out.println("After invoking put() method");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        hm.putIfAbsent(4, "Suni");

        System.out.println("After invoking putIfAbsent() method");

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        HashMap<Integer, String> map = new HashMap<Integer, String>(); // Fixed variable name

        map.put(5, "Rakesh");
        map.putAll(hm); // Used 'hm' instead of 'map' to merge

        System.out.println("After invoking putAll() method");

        for (Map.Entry<Integer, String> m : map.entrySet()) { // Fixed variable name
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
