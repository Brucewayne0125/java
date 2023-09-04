// Treeset (removes duplication and prints in sorted order)

import java.util.*;

class Treeseteg1
{
public static void main(String args[])
{

TreeSet<String>al=new TreeSet<String>();

al.add("Vishv"); 
al.add("Tanaya");
al.add("Parth");
al.add("Tanaya");

Iterator<String>itr=al.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}