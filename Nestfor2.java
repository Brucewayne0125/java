// Java program for nest loop

import java.util.*;

class Nestfor2
{
public static void main(String args[])
{
int i,j;


for(i=1;i<=5;i++) 
{
for(j=1;j<=i;j++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}