// Java program for class result

import java.util.*;

class Result
{
public static void main(String args[])
{

 int rollno;
 String name;
 float m1,m2,m3,total,avg;

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rollno , Name , Marks of 3 subjects ");


 rollno=sc.nextInt();
 name=sc.next();
 m1=sc.nextFloat();
 m2=sc.nextFloat();
 m3=sc.nextFloat();
 
 total=m1+m2+m3;
 avg=total/3;
 
 System.out.println("Rollno="+rollno);
 System.out.println("Name="+name);
 System.out.println("M1="+m1);
 System.out.println("M2="+m2);
 System.out.println("M3="+m3);
 System.out.println("Student total="+total);
 System.out.println("Student avg="+avg);
  
 if(m1>=40 && m2>=40 &&m3>=40)
{
if (avg>=90 && avg<=100)
{
System.out.println("Grade A");
}
else if (avg>=70 && avg<90)
{
System.out.println("Grade B");
}
else if (avg>40 && avg<70)
{
System.out.println("Grade C");
}
else
{
System.out.println("Pass");
}
}
else
{
System.out.println("Fail");
}

}
}
