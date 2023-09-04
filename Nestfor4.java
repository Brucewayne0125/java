// Java program for nest loop 

import java.util.*;


class Nestfor4
{ 
public static void main(String args[])
{
int i,j;


for(i=1;i<=5;i++)
{
for(j=1;j<=i; j++)
{
System.out.print(i*j + " ");
}
System.out.println();
}
}
}   