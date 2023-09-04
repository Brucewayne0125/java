// string methods

import java.util.*;

class StringEg1
{
public static void main(String args[])
{
String s1="Hello";
String s2="Hello";
String s3="Good Day";
String s4="HELLO";

System.out.println(s1+" equals "+ s2 +" is "+s1.equals(s2)); //true
System.out.println(s1+" equals "+ s3 +" is "+s1.equals(s3)); //false
System.out.println(s1+" equals "+ s4 +" is "+s1.equals(s4)); //false
System.out.println(s1+" equals "+ s4 +" is "+s1.equalsIgnoreCase(s4)); //true

}
}