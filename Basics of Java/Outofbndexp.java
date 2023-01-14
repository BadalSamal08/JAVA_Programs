public class Outofbndexp {
    public static void main(String args[])
    {
        method1();
        System.out.println("main ended");
    }
    private static void method1()
    {
        method2();
        System.out.println("End of method 1");
    }
    private static void method2()
    {
        try
        {
            int[] a={1,3};
            int num=a[1];
            System.out.println(num);
            System.out.println("End of method 2");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Matched");
           ex.printStackTrace();
        }
        finally
        {
            System.out.println("Test");
        }
    }
    
}

    

