//java program for addition subtraction multiplication divison modulus of two no's

import java.io.*;
import java.lang.*;//package
import java.util.*;

class Arith
{
public static void main (String[]args)
{
int a,b;
Scanner sc= new Scanner (System.in);
System.out.println("enter the values of a and b ");
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Addition="+(a+b));
System.out.println("Subtraction="+(a-b));
System.out.println("Multiplication="+(a*b));
System.out.println("Division="+(a/b));
System.out.println("Modulus="+(a%b));

}
}