package output;
class B
{
    int i = 50;
    String s;
    StringBuilder sb = new StringBuilder();
 
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
 
public class Finalizzzzz
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
 
      B a1 = new B();
 
      B a2 = new B();
 
      //Assigning a2 to a1
 
      a1 = a2;
      System.gc();
      //Now both a1 and a2 will be pointing to same object 
 
      //An object earlier referred by a1 will become abandoned
 
      System.out.println("done");
   }
}