// java program for encapsulation

import java.util.*;

class Emp
{
private int empno;
private String ename;
private esal;

public void set Empno(int eno)
{
empno=eno;
}

public int get Empno()
{
return (empno);
]

public void setEname (String name)
{
ename= name;
}

public string getEname()
{
return (ename);
}

public void setEsal( double sal)
{
esal =sal;
}

public double getEsal()
{
return (esal);
}

public String to String()
{
return empno+"\t" + ename+"\t" +esal;

} // end of emp class

class Encapsulation
{
public static void main (String args[])
{
Emp obj = new Emp();

obj.SetEmpno(101);
obj.SetEmpname("Ganesh");
obj.SetEsal(99000.00d);

System.out.println("empno/tname/ tsalary");
System.out.println(obj);
}
}