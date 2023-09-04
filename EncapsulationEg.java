// java program for encapsulation

import java.util.*;

class Emp
{
public int empno;
private string ename;
private double esal;

public void setEmpno(int eno)
{
empno=eno;
}

public int getEmpno()
{
return (emp no);
}

public void setEname(String name)
{
ename=name;
}
 
public string getEname()
{
return (ename);
}

public void setEsal(double sal)
{
esal=sal;
}

public double getEsal()
{
return (esal);
}

public String to String()
{
return empno+"\t" +ename + "\t" + esal;
}
}

class EncapsulationEg
{
public static void main (String args[])
{
Emp obj= new Emp();

obj.SetEmpno(101);
obj.SetEname("Ganesh");
obj.SetEsal(94000.00d);

System.out.println("empno\tname\tsalary");
System.out.println(obj);
}
}