// java program for method overloading

import java.util.*;

class Methodoverload

{
public int add (int a , int b)
{
return (a+b);
}

public Float add ( Float a , Float b)
{
return(a+b);
}

public Double add( Double a, Double b)
{
return(a+b);
}

public static void main(String args [])
{
 Methodoverload obj = new Methodoverload();

System.out.println("Addition of two integer values="+ obj.add(10,20));
System.out.println("Addition of two float values=" +obj.add(21.34f,23.44f));
System.out.println("Addition of two double values=" +obj.add(51.34d,85.44d));
}
}