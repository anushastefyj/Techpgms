class Are
{
    void outer()
    {
    int a=30;
    int b=20;
    System.out.println("outermethod");
    }
class And extends Are
{
    void inner()
    {
        int c=30;
        int d=35;
        System.out.println("innermethod");    
    }
}
}
class Methodlocal
{
    public static void main(String args[])
    {
    And e=new And();
    e.inner();
    
}
}