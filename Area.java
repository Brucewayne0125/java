//Java progam for calculating area of circle 

import java.io.*;
import java.lang.*;//package
import java.util.*;

class Area
{
public static void main(String[]args)
{
float r,area=0.0f;
Scanner sc=new Scanner (System.in);
System.out.println("enter radius");
r=sc.nextFloat();
area =(3.14f*r*r);
System.out.println("area="+area);

}
}