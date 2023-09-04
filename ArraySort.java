// Java program to sort array elements in ascending order

import java.util.*;

class ArraySort
{
public static void main(String args[])
{
int arr[]=new int[5];

int i,j,temp;

Scanner sc = new Scanner(System.in);

System.out.println("Enter five elements "); 

for (i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}

for(i=0;i<5;i++)
{
for(j=0;j<4;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}

System.out.println("Sorted elements are");

for(i=0;i<5;i++)
{
System.out.println(arr[i]);
}

}
}