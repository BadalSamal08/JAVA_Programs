public class Checkedexp {
    public static void main(String args[])
    {
        try{
            method1();
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
            System.out.println("Hello");
        }
    }
   private static void method1() throws InterruptedException
    {
        Thread.sleep(2000);
    }
    
}
