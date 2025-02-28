import java.util.*;
class dog
{
    void character_of_dog()
    {
        System.out.println("dog barks");
        System.out.println("dog is a pet animal");
    }
}
class cat extends dog
{
    void character_of_cat() 
    {
        System.out.println("cat says meow");
        System.out.println("cat is a pet animal");
    }
}
class lion extends dog
{
    void character_of_lion()
    {
        System.out.println("lion roars");
        System.out.println("lion is not a pet animal");
    }
}
class polymorphism
{
    public static void main(String args[])
    {
        dog mydog=new dog();
        cat mycat=new cat();
        lion mylion=new lion();
        mydog.character_of_dog();
        mycat.character_of_cat();
        mylion.character_of_lion();
    }

}