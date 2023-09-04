import java.util.*;

class InsufficentAmt extends Exception
{
private double amount;

public InsufficentAmt(double amount)
{
this.amount= amount;
}

public double getamount()
{
return amount;
}
}