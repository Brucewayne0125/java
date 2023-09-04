import java.util.*;

public class Throweg1
{
static void validate (int age)
{
if (age<18)

throw new ArithmeticException ("not eligible to vote");

else

System.out.println("wlecome to vote");
}

public static void main (String args [])
{
validate (21);
System.out.println(" rest of the code ...");

}
}