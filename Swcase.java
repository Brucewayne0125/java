

import java.io.*;
import java.lang.*;
import java.util.*;

class Swcase
{
public static void main(String args[])
{
int a,b,choice;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a and b");

a=sc.nextInt();
b=sc.nextInt();

System.out.println("1:Addition");
System.out.println("2:Subtraction");
System.out.println("3:Multiplication");
System.out.println("4:Division");
System.out.println("5:Modulus");
System.out.println("6:Exit");

System.out.println("Enter your choice");
 
choice=sc.nextInt();

 switch(choice)
{

 
case 1:
System.out.println("Addition="+(a+b));
break;

case 2:
System.out.println("Subtraction="+(a-b));
break;

case 3:
System.out.println("Multiplication="+(a*b));
break;

case 4:
System.out.println("Division="+(a/b));
break;

case 5:
System.out.println("Modulus="+(a-b));
break;

case 6:
System.exit(0);

default:
System.out.println("Wrong choice");
break;
}

}
}