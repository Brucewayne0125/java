//Java program for even or odd

import java.util.*;

class EvenOdd
{
public static void main(String args[])
{

int n;

Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");
n=sc.nextInt();

if(n%2==0)
{
 System.out.println("Even number");
}
else
{
 System.out.println("Odd number");
}

}
}