// Java program for largest element in array of 5

import java.util.*;

class LargeSmallArray
{
public static void main(String args[])
{

int arr[]= new int[5]; 

int i,large,small;


 
Scanner sc =new Scanner(System.in);
System.out.println(" enter 5 elements");



for (i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}

large=arr[0];
small=arr[0];

for (i=0;i<5;i++)
{
if(arr[i]>large)
{
large=arr[i];
}
else if (arr[i]<small)
{
small=arr[i];
}
}
System.out.println("The largest element in the array is="+ large);
System.out.println("The smallest element in the array is="+ small);
}
}