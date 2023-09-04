

import java.util.*;

class Empcon
{
 int empno;
 String empname;
 double esal;

public Empcon() // default constructor
{
empno=1;
empname="Anil";
esal=89000.00d;
}

public Empcon(int empno,String empname, double esal) // parameterized constructor
{
this.empno=empno; // this keyword refer t current object
this.empname=empname;
this.esal=esal;
}

void Display()
{
System.out.println("Emp no="+empno);
System.out.println("Emp name="+empname);
System.out.println("Emp salary="+esal);
}

public static void manin(String args[])
{
Empcon obj=new Empcon();

obj.Display();

Empcon obj1= newEmpcon(2,"Ganesh", 98000.00d);

obj1.Display();
}
}