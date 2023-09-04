// Java program for reverse number using do loop

import java.util.*;

class RevNumdoloop
{
public static void main(String args[])
{
int n , rev=0, rem=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();

do
{
rem=n%10;
rev=rev*10+rem;
n=n/10;

}while(n>0);
System.out.println("Reverse number="+rev);
}
}