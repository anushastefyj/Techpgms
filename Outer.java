class Outer 
{
    void outermethod()
    {
        class Inner 
        {
            void innermethod()
            {
                System.out.println("inner method class");
            
            }
        }
        Inner i = new Inner();
        i.innermethod();
    }
    public static void main(String args[])
    {
        Outer ob= new Outer();
        ob.outermethod();
    }
}    