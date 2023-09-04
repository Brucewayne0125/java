import java.util.*;

class MultMat

{
public static void main(String args[])
{
int a [] []=new int [2] [2];
int b [] []=new int [2] [2];
int c [] []=new int [2] [2];

int i,j,k;

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
System.out.println("Multiplication of matrix");

for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=0;
for(k=0;k<2;k++)
{
c[i][j] =c[i][j]+ a[i][k] * b[k][j];
}
System.out.print(c[i][j]+" ");
}

System.out.println();
}

}
}