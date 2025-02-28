class A
{
    void display()
    {
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("addition"+c);
    }
}
    class Sub extends A
    {
        void show()
        {
            int m=20;
            int n=10;
            int o=m-n;
            System.out.println("subtraction"+o);

        }
    }
    class Multi extends Sub
    {
        void result()
        {
            int x=3;
            int y=5;
            int z=x*y;
            System.out.println("multiplication"+z);
        }
    }
    class Inheritance
    {
        public static void main(String args[])
        {
            Multi m=new Multi();
            m.show();
            m.display();
            m.result();
        }
    }
