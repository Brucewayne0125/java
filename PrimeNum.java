// Java program for prime number 

import java.util.*;

class PrimeNum
{
public static void main(String args [])
{
int n=1, i=2;
boolean flag=false;

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
 
while(i<n)
{
if(n%i==0)
{
flag=true;
break;
}

i=i+1;
}
if(flag==false)
{
System.out.println("Not a prime number");
}

}
}

