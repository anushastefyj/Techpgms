class outer{
    void outermethod()
}
class Inner
    {
        void innermethod()
        {
            System.out.println("Inner method");

        }
    }
    public static void main(String args[])
    {
        Inner i=new Inner();
        i.innermethod();

    }
} 