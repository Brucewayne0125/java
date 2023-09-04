import java.util.*;

class FileEg1
{
public static void main(String args[])
{
try
{

FileOutputStream fout=new FileoutputStream("file1.txt");

String s ="Java File Handling";
 byte b[]=s.getBytes();

fout.write(b);
fout.close();
 
System.out.println(" stored successfully");
}

catch(Exception e)
{
System.out.println(e);
}
}
}
