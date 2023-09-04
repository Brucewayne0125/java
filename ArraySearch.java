// Java program for searching of element 

import java.util.*;

class ArraySearch 
{
public static void main(String args[])
{
 
int arr[]=new int[5];

int i, search;

boolean flag= false;

Scanner sc= new Scanner(System.in);
System.out.println("Enter five elements");

for (i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}

System.out.println("Enter elements to be search");
search=sc.nextInt();

for(i=0;i<5;i++)
{
if (arr[i]==search)
{
flag=true;
break;
}
}

if (flag=true)
{
System.out.println(search+"found at the location="+i+1);
}

else

{
System.out.println(search+"not found in the array");
}

}
}