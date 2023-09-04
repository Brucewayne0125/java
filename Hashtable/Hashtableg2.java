import java.util.*;

public class Hashtableg2
{
public static void main(String args[])
{
Hashtable<Integer,String> map=new Hashtable<Integer,String>();

map.put(1,"Ganesh");
map.put(2,"Tanaya");
map.put(3,"Vishv");
map.put(4,"parth");

System.out.println("Before remove:"+ map);

//Remove value for key 4

map.remove(4);

System.out.println("After remove: "+map);
}
}
