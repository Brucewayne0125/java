// Java program for smallest amoung 4 number's

import java.util.*;

class Smaller
{
public static void main(String args[])
{

int a,b,c;

Scanner sc=new Scanner (System.in);

System.out.println("enter the values of a,b,c");

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if(a<b && a<c)
{
System.out.println(a+" is the smallest");
}
else if (b<c)
{
System.out.println(b+" is the smallest");
}
else
{
System.out.println(c+" is the smallest");
}

}
}