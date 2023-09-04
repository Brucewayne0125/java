// java program for class and object

import java.util.Scanner;

class Student
 {
 int rollno;
 String name;
 float marks;

public void accept()
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno, name, and marks:");
        rollno = sc.nextInt();
        name = sc.next();
        marks = sc.nextFloat();
 }

    public void display()
 {
        System.out.println("Rollno=" + rollno);
        System.out.println("Name=" + name);
        System.out.println("Marks=" + marks);
 }

    public static void main(String args[])
 {
        Student s1 = new Student();
        s1.accept();
        s1.display();

        Student s2 = new Student();
        s2.accept();
        s2.display();

        Student s3 = new Student();
        s3.accept();
        s3.display();
    }
}
