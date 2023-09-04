import java.util.*;

abstract class shape // Super class/ base class
{
float dim1,dim2,a;
public abstract float area();
}

class Rectangle extends shape // subclass /derived class

{
public float area ()// overriding (run time polymorphism)

{
a=dim1*dim2;
System.out.println("Area of rectangle="+a);
return a;
}
}

class Triangle extends shape 
{
public float area ()// overriding
{
a=(dim1*dim2)/2;
System.out.println("Area of Triangle="+a);
return a;
}
}

class Abstractclasseg
{
public static void main(String args[])
{

Rectangle r =new Rectangle ();
r.dim1=10;
r.dim2=4;

r.area();

Triangle t=new Triangle();

t.dim1=8;
t.dim2=4;

t.area();

}
}