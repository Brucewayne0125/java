 import java.util.*;

class CheckingAmount
{
private double balance;
private int number;

public CheckingAmount(int number)
{
this.number =number;
}

public void deposite (double amount)
{
balance+=amount;
}


public void withdraw (double amount) throws InsufficentAmt
{
if (amount<= balance)
{
balance = balance-amount;
}
else
{
double needs = amount - balance;
throw new InsufficentAmt(needs);
}
}
public double getbalance()
{
return balance;
}

public int getnumber()
{
return number;
}
}
