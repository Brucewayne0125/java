// Java program for factorial using for loop

import java.util.*;

class FactForloop
{
public static void main(String args[])
{
int n, fact=1;

Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();

for (int i = 1; n>=1; i++)
 {
fact = fact * i;
n=n-1;
}

System.out.println("Factorial = " + fact);
}
}