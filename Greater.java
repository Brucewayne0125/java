// Java program for greatest amoung four number's

import java.util.*;


class Greater
{
public static void main(String args[])
{

int a,b,c,d;

Scanner sc=new Scanner(System.in);

System.out.println("enter the values of a,b,c and d");

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();

if(a>b && a>c && a>d)
{
System.out.println(a+"is greatest");
}
else if(b>c && b>d)
{
System.out.println(b+"is greatest");
}
else if(c>d)
{
System.out.println(c+"is greatest");
}
else
{
System.out.println(d+"is greatest");
} 

}
}