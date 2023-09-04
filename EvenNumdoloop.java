// Java program for even numbers from 1 to 10 using do loop

import java.util.*;

class EvenNumdoloop
{
public static void main(String args[])
{
int i=1;

do
{
if(i%2==0)
{
System.out.println(i+"\t");
}
i=i+1;
} while (i<=10);

}
}