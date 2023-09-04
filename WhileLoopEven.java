// Java program to print even numbers from 1 to 10 using while loop

import java.io.*;
import java.lang.*;
import java.util.*;


class WhileLoopEven
{
public static void main(String args[])
{
int i=1;
while (i<=10)
{
if (i%2==0)
{
System.out.print(i+"\t");
}
i=i+1;
}

}
}