// Palindrome

import java.util.*;

public class Palindrome
{

public static void main(String[]args)
{
Scanner sc= new Scanner(System.in);

System.out.print("Enter a string ");

String str= sc.nextLine();

StringBuffer s1=new StringBuffer(str);
StringBuffer s2=new StringBuffer(s1);

s1.reverse();

System.out.println("Given String is : "+s2);
System.out.println("Reverse String is : "+s1);

if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)

System.out.println(s2 + " is Palindrome");
else 
System.out.println(s2 + " is Not Palindrome");

}
}
