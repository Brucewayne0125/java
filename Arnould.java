// Java program for arnould numbers

import java.util.*;

class ArmstrongNo
{
public static void main(String args[])
{
int n , arn=0 , rem=0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();

while (n>0)
{
digit=n%10;
sum= sum+digit*digit*digit;
n=n/10;
}
if (n1=sum)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not a Armstrong Num");
}
}
}
