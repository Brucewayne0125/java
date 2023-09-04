
// java program for interface taking example of bank

import java.util.*;

interface Bank
{
Float rateofinterest();
}

class SBI implements Bank
{
public Float rateofinterest()
{
return 10.25f;
}
}

class PNB implements Bank
{
public Float rateofinterest()
{
return 10.50f;
}
}
 
class InterfaceEg1
{
public static void main(String args[])
{
SBI b=new SBI();

System.out.println("ROI of SBI:"+ b.rateofinterest());

PNB  b1=new PNB();

System.out.println("ROI of PNB:"+ b1.rateofinterest());
}
}