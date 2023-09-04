
// Hashtable

import java.util.*;

class Hashtableg1 {
    public static void main(String args[]) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

        hm.put(1, "Ganesh");
        hm.put(2, "Tanaya");
        hm.put(3, "Vishv");
        hm.put(4, "parth");

        for (Map.Entry<Integer, String> m : hm.entrySet()) 
{
            System.out.println(m.getKey() + " " + m.getValue()); // k and v "capital"
        }
    }
}
