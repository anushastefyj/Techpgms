class array
{
    public void display(int[][]a)
    {
        for(int i=0;i<a.length;i++)
        {
           for(int j=0;j<a.length;j++)
                System.out.println(j);
            }
            System.out.println();
        }
    public static void main(String args[])
    {
        int[][]arr={{1,2,3},{4,5,6}};
        array a=new array();
        a.display(arr);
    }
}


    

    
