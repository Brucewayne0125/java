import java.util.*;

public class Bufferread
{
public static void main (String args[]) throws IOException
{

int n1,n2;

InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br= new BufferedReader(isr);

System.out.println("enter n1 and n2");

n1=Integer.parseInt(br.readLine()); // Integer-wrapper class Float,Double,Character"20" 20
n2=Integer.parseInt(br.readLine());

System.out.println("Addition ="+(n1+n2));

}
}