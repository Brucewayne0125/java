// Java program for factorial

import java.util.*;

class Factorial
{
public static void main(String args[])
{
int n, Fact=1;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
n=sc.nextInt();

while(n>=1)
{
Fact=Fact*n;
n=n-1;
}
System.out.println("Factorial="+Fact);
}
}