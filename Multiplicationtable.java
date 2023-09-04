import java.io.*;
import java.lang.*;
import java.util.*;


class Multiplicationtable
{
public static void main(String args[])
{
int i=1;
int n;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
n=sc.nextInt();

System.out.println("Multiplication Table");

do
{
System.out.println(n+"*"+i+"="+(n*i));
i=i+1;
}while(i<=10);

}
}