
// HashSet(removes duplication)

import java.util.*;

class HashSeteg1
{
public static void main(String args[])
{

HashSet<String>al=new HashSet<String>();

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