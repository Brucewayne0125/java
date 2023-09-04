// add all

import java.util.*;


class Arraylisteg5
{
public static void main (String args[])
{
ArrayList<String> al=new ArrayList<String>();

al.add("Ravi");
al.add("vijay");
al.add("Ajay");

ArrayList<String> al2=new ArrayList<String>();

al2.add("Ganesh");
al2.add("Mahesh");
al.addAll(al2);

Iterator itr=al.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
