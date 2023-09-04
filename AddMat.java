// Java program for addition of matrix (two dimensional array)


import java.util.*;

class AddMat

{
public static void main(String args[])
{
int a [] []=new int [2] [2];
int b [] []=new int [2] [2];
int c [] []=new int [2] [2];

int i,j;

Scanner sc=new Scanner(System.in);
System.out.println("Enter 2*2 Matrix(A)");

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j] =sc.nextInt();
}
}
System.out.println("Enter 2*2 Matrix(B)");

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j] =sc.nextInt();
}
}
System.out.println("Addition of matrix");

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j] =a[i][j]+b[i][j];

System.out.print(c[i][j]+" ");
}

System.out.println();
}

}
}