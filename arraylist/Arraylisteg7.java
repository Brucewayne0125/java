// removeAll()method

import java.util.*;

class ArrayListeg7 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Ravi");
        al.add("vijay");
        al.add("Ajay");

        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("Ravi");
        al2.add("vijay");

        al2.retainAll(al); // Corrected the method call to retainAll and used 'al' instead of 'al2'

        System.out.println("Iterating the elements after retaining the elements of al2...");

        Iterator<String> itr = al2.iterator(); // Changed the iterator to iterate over 'al2'

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
