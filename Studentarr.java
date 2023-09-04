// java program for array of objects

import java.util.*;

class Studentarr

{
static int rollno; // class variable
String name;
float marks;

public static void Accept() // method
{
Scanner sc=new Scanner(System.in);
name=sc.next();
marks=sc.nextFloat();
}

public void Display() // output
{
rollno=rollno+1;
System.out.println(rollno+"\t"+name+"\t"+marks);
}

public static void main(String args[])
{

Studentarr obj[]=new Studentarr[5]; // array of objects

int i;

System.out.println("Enter name and marks for five students");

for(i=0;i<5;i++)
{
obj[i]=new Studentarr();
obj[i].Accept();
}
System.out.println("Rollno\tName\tMarks");

for(i=0;i<5;i++)
{
obj[i].Display();
}

}
}