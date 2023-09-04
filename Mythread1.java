import java.util.*;

class MyThread1 extends Thread
{
Table t =new Table ();

MyThread1 (Table t)
{
this.t=t;
}
public void run()
{
t.printTable(5);
}
}