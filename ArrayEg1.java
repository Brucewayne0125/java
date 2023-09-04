// Java program for array

import java.util.*;

class ArrayEg1
{
public static void main(String args[])
{

int rollno[]= new int[5];
String name[]=new String[5];
float marks[]= new float[5];

int i;
 
Scanner sc =new Scanner(System.in);
System.out.println("Enter rollno; name; marks of 5 students");

for (i=0;i<5;i++)
{
rollno [i]= sc.nextInt();
name [i]=sc.next();
marks[i]=sc.nextFloat();
}
System.out.println("rollno\t name \t marks");

for (i=0;i<5;i++)
{
System.out.println(rollno[i]+"\t"+name[i]+"\t"+marks[i]);
}
}
}
