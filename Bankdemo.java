import java.util.*;

class Bankdemo
{
public static void main(String args[])
{
CheckingAmount obj=new CheckingAmount(101);
obj.deposite(5000);

try
{
obj.withdraw(1000);
obj.withdraw(6000);
}

catch (InsufficentAmt e)
{
System.out.println("Insufficent Amount exception raised:" +e.getamount());
e.printStackTrace();
}
}
}