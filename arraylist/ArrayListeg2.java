// arraylisteg2

import java.util.*;

class ArrayListeg2
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>(); // creating arraylist

al.add("Ravi"); // adding object in arraylist
al.add("Vijay");
al.add("Rvai");
al.add("Ajay");

Iterator itr= al.iterator(); //getting iterators from arraylist to traverse elements 

while(itr.hasNext()) //hasNext(). return boolean
{
System.out.println(itr.next()); // return object
}
}
}
