// remove All()method

import java.util.*;

class Arraylisteg6 
{
public static void main (String args[])
{
ArrayList<String> al=new ArrayList<String>();

al.add("Ravi");
al.add("Vijay");
al.add("Ajay");


ArrayList<String> al2=new ArrayList<String>();

al2.add("Ravi");
al2.add("Rakesh");
al2.add("Vijay");

al2.removeAll(al);

System.out.println("iterating the elements after removing the elements of al2...");

Iterator itr=al2.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}