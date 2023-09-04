// java program for single inheritance
import java.util.*;

class College // Superclass/Base class
{
String name;
String address;
Scanner sc = new Scanner(System.in);

public void getData()
{
System.out.println("Enter college name and address:");
name = sc.next();
address = sc.next();
}
public void putData()
{
System.out.println("College name: " + name);
System.out.println("Address: " + address);
}
}

class Student extends College // Subclass/Derived class
{
 int rollno;
 String name;
 String sem;

public void getStudent()
{
getData(); // calling superclass method
System.out.println("Enter rollno, name, and semester:");
rollno = sc.nextInt();
name = sc.next();
sem = sc.next();
 }

public void display()
    {
 putData(); // calling superclass method
        System.out.println("Rollno: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }
}

public class SingleInheritance 
{
    public static void main(String args[])
    { 
        Student obj = new Student();
        obj.getStudent();
        obj.display();
    }
}
