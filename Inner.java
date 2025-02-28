class Outer 
{
    class Inner
    {
        void innermethod ()
        {
            System.out.println("Inner class method");
        
        }

    }
    void outermethod()
    {
        System.out.println("Outerclass method");

    }
    public static void main(String args[])
    {
        Outer ob = new Outer();
        ob.outermethod();
        Outer.Inner ob2= new Outer().new Inner ();
        ob2.innermethod();
    }
}