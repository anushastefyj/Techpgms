import java.util.*;
abstract class tom
{
 public abstract void rat();
public void cat()
    {
        System.out.println("tom is a cat");
    }
}
class jerry extends tom
{
 public void rat()
   {
   System.out.println("jerry is an rat");
   }
}
class abstraction
{
    public static void main(String args[])
    {
        jerry r=new jerry();
        r.cat();
       r.rat();
    }
}