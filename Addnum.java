//java progrma for addition of two no's

import java.io.*;
import java.lang.*;//package
import java.util.*;

class Addnum
{
public static void main (String[]args)
{
int a,b,add;
Scanner sc=new Scanner(System.in);
System.out.println("enter the values of a and b");
a=sc.nextInt();
b=sc.nextInt();

add=(a+b);
System.out.println("Addition="+add);

}
}