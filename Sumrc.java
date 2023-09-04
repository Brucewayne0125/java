// sum of rows and column

import java.util.*;

class Sumrc
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int i,j,sumr,sumc;

Scanner sc=new Scanner(System.in);
System.out.println("Enter 3*3 Matrix");

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}

for(i=0;i<3;i++)
{
sumr=0;
for(j=0;j<3;j++)
{
sumr=sumr+a[i][j];
}

for(i=0;i<3;i++)
{
sumc=0;
for(j=0;j<3;j++)
{
sumc=sumc+a[i][j];
}
System.out.println("Sum of cols="+sumc);
}
}
}
