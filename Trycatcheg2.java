import java.util.*;

public class Trycatcheg2
{
public static void main(String args[])
{
try
{
int a[]=new int [5];
a [10] = 30;
}

catch (ArithmeticException e)
{
System.out.println(e+ " task1 completed ");
}

catch (ArrayindexoutofboundsException e)
{
System.out.println(e+ " task2 completed ");
}

catch (Exception e)
{
System.out.println( " common  task completed ");
}

System.out.println(" rest of the code... ");
}
}

