// Java program for prime number from 10 to 20
 

import java.util.*;

class PrimeNum20
{
public static void main(String args [])
{
int n=10, i;
boolean flag;
System.out.println("Prime no's are");
 
while(n<=20)
{
i=2;
flag=false;

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
System.out.println(n);
}
n=n+1;
}

}
}


