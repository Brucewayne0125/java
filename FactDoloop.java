// Java program for factorial using do loop

import java.util.*;

class FactDoloop
{
public static void main(String args[])
{
int n, fact=1;

Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();

do
{
fact=fact*n;
n=n-1;
} while(n>=1);

System.out.println("factorial="+fact);
}
}