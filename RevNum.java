// java program for reverse number

import java.util.*;

class RevNum
{
public static void main(String args[])
{
int n, rev=0, rem=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
n=sc.nextInt();

while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;

}
System.out.println("Reverse number="+rev);
}
}


/**
To understand the condition and its purpose, let's go through an example step by step:

Let's say the input number is 123.

Initially, n is set to 123.

In the first iteration of the while loop:

rem is calculated as the remainder of n divided by 10, which is 3.
rev is updated as rev * 10 + rem, which is 0 * 10 + 3, resulting in 3.
n is updated as n / 10, which is 123 / 10, resulting in 12.
Now, after the first iteration, rem is 3, rev is 3, and n is 12.

In the second iteration of the loop:

rem is calculated as the remainder of n divided by 10, which is 2.
rev is updated as rev * 10 + rem, which is 3 * 10 + 2, resulting in 32.
n is updated as n / 10, which is 12 / 10, resulting in 1.
After the second iteration, rem is 2, rev is 32, and n is 1.

In the third iteration of the loop:

rem is calculated as the remainder of n divided by 10, which is 1.
rev is updated as rev * 10 + rem, which is 32 * 10 + 1, resulting in 321.
n is updated as n / 10, which is 1 / 10, resulting in 0.
After the third iteration, rem is 1, rev is 321, and n is 0.

Since n is now 0, the condition n > 0 in the while loop becomes false, and the loop terminates.

The reversed number is stored in the variable rev, which is 321.

So, the purpose of the condition and the statements rem = n % 10, rev = rev * 10 + rem, and n = n / 10 is to extract the rightmost digit (rem), accumulate the reversed digits (rev), and reduce the number (n) by shifting digits to the right. These steps are repeated until all digits have been reversed and the number becomes 0.
*/