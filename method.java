import java.util.*;
public class method
{
    public void set()
    {
        a=30;
        b=40;
    }
    public void set(int x)
    {
        a=x;
        b=5;
    }
    public void set(int x,int y)
    {
    a=x;
    b=y;
    }
    public void display()
    {
    System.out.println();
    }
    public static void main(String args[])
    {
        method t=new method();
        t.set();
        t.display();
}
}