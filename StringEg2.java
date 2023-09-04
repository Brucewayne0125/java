 // string methods

import java.util.*;

class StringEg2
{
public static void main(String args[])
{
String s1="Hello";
String s2="Hello";
String s3="Good Day";
String s4="HELLO";

System.out.println("Index of L" +s1.indexOf('l'));
System.out.println(" Last index of L" +s1.lastIndexOf('l'));
System.out.println(s1.concat(" "+s3));
System.out.println(s1.substring(3));
System.out.println(s1.substring(2,5));
System.out.println(s1.replace('l','b'));
System.out.println(s1.toLowerCase());
System.out.println(s3.toUpperCase());
System.out.println("Length="+s1.length());
System.out.println(s1.trim());
}
}